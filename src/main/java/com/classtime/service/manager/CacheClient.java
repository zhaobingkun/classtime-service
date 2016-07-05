package com.classtime.service.manager;

/**
 * 缓存的接口.
 */
public interface CacheClient {
    public String toKey(Object... params);

    /**
     * 根据关键字从缓存里获取一个对象
     *
     * @param key 该对象的缓存关键字
     * @return 被缓存的对象
     */
    public Object getFromCache(String key);

    /**
     * 存放一个对象到缓存里，设置过期时间
     *
     * @param key    该对象的缓存关键字
     * @param value  被缓存的对象
     * @param second 过期时间，单位毫秒
     */

    public void putInCache(String key, Object value, int second);

    /**
     * 存放一个对象到缓存里，不设置过期时间
     *
     * @param key   该对象的缓存关键字
     * @param value 被缓存的对象
     */
    public void putInCache(String key, Object value, String... groups);


    /**
     * 存放一个对象到缓存里，设置过期时间为配置文件指定时间
     *
     * @param key   该对象的缓存关键字
     * @param value 被缓存的对象
     */
    public void putInCacheDefaultExpire(String key, Object value);

    /**
     * 从缓存里删除一个对象
     *
     * @param key 该对象的缓存关键字
     */
    public boolean delete(String key);

    /**
     * 判断缓存内是否包含一个缓存对象
     *
     * @param key 该对象的缓存关键字
     */
    public boolean keyExists(String key);

    /**
     * 替换对应的键值的缓存对象
     */
    public boolean replace(String key, Object cache);

    /**
     * 缓存开关
     */
    public boolean isOpenCache();

    /**
     * 缓存默认过期时间
     */
    public int getExpire();

    /**
     * 使指定缓存组的对象失效
     */
    public void flushGroup(String group);

}
