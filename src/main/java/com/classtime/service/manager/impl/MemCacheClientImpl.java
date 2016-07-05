package com.classtime.service.manager.impl;

/**
 * Created by IntelliJ IDEA.
 * java  memcache client接口实现类
 */

import com.danga.MemCached.MemCachedClient;
import com.classtime.service.manager.CacheClient;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service(value = "cacheClient")
public class MemCacheClientImpl implements CacheClient {

    private MemCachedClient cache;
    private int expire;
    private boolean openCache;

    public void setCache(MemCachedClient cache) {
        this.cache = cache;
    }

    public Object getFromCache(String key) {
        return cache.get(key);
    }

    public void putInCache(String key, Object value, String... groups) {
        updateGroups(groups, key);
    }

    public void putInCacheDefaultExpire(String key, Object value) {
        cache.set(key, value, expire);
    }

    /**
     * @param key    - key to store data under
     * @param value  - value to store
     * @param second - after second millis to expire the record
     * @return Returns: true, if the data was successfully stored
     */
    public void putInCache(String key, Object value, int second) {
        cache.set(key, value, new Date(second));
    }

    public boolean delete(String key) {
        return cache.delete(key);
    }

    public boolean keyExists(String key) {
        return cache.keyExists(key);
    }

    public String toKey(Object... params) {
        if (params == null) {
            throw new NullPointerException("params is null");
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < params.length - 1; i++) {
            builder.append(params[i]).append(":");
        }
        builder.append(params[params.length - 1]);
        return builder.toString();
    }


    public boolean replace(String key, Object value) {
        return cache.replace(key, value);
    }

    public void setExpire(int expire) {
        this.expire = expire;
    }

    public int getExpire() {
        return expire;
    }

    public boolean isOpenCache() {
        return openCache;
    }

    public void setOpenCache(boolean openCache) {
        this.openCache = openCache;
    }


    private void updateGroups(String[] groups, String key) {
        if (null == groups || groups.length == 0)
            return;
        for (String group : groups) {
            updateGroup(group, key);
        }
    }

    private void updateGroup(String group, String key) {
        Object o = getFromCache(group);
        if (o == null) {
            List<String> list = new ArrayList<String>();
            list.add(key);
            putInCache(group, list);
        } else {
            List<String> list = (List<String>) o;
            if (!list.contains(key)) {
                list.add(key);
                putInCache(group, list);
            }
        }
    }

    @SuppressWarnings("unchecked")
    public void flushGroup(String group) {
        Object o = getFromCache(group);
        if (o != null) {
            List<String> list = (List<String>) o;
            for (String key : list)
                delete(key);
        }
        delete(group);
    }
}
