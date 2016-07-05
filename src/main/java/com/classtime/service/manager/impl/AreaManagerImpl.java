package com.classtime.service.manager.impl;

import com.classtime.service.dao.AreaMapper;
import com.classtime.service.manager.AreaManager;
import com.classtime.service.manager.CacheClient;
import com.classtime.service.model.Area;
import com.classtime.service.utils.StringTools;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhaobk on 2015-08-11.
 */
@Service("areaManager")
public class AreaManagerImpl implements AreaManager {
    protected static Logger logger = LoggerFactory.getLogger(AreaManagerImpl.class);
    private static final String AREA_KEY_PREFIX_ID = "Area:id";
    private static final String AREA_KEY_PREFIX_LIST = "Area:list";
    @Autowired
    private CacheClient cacheClient;
    @Autowired
    private AreaMapper areaMapper;

    @Override
    @SuppressWarnings("unchecked")
    public List<Area> findByPrivateId(Long privateId) {
        Object objectFromCache = null;
        String areaListKey = cacheClient.toKey(AREA_KEY_PREFIX_LIST, privateId);
        if (cacheClient.isOpenCache()) {
            objectFromCache = cacheClient.getFromCache(areaListKey);
        }
        if (objectFromCache != null) {
            return (List<Area>) objectFromCache;
        }

        Area area = new Area();
        area.setParentid(privateId);
        List<Area> areaList = areaMapper.selectBySelective(area);
        List<Area> areaListNew = new ArrayList<Area>();
        for (Area areaTemp : areaList) {
            Area areaSea = new Area();
            areaSea.setParentid(areaTemp.getId());
            List<Area> areaListTemp = areaMapper.selectBySelective(areaSea);
            areaTemp.setListArea(areaListTemp);
            areaListNew.add(areaTemp);
        }
        if (cacheClient.isOpenCache()) {
            cacheClient.putInCacheDefaultExpire(areaListKey, areaListNew);
            logger.debug("put area list into cache key: {} value:{}: ", areaListKey,
                    cacheClient.getFromCache(areaListKey));
        }
        return areaList;
    }

    @Override
    public int insert(Area area) {
        int result = areaMapper.insert(area);
        logger.debug("insert   area into  db result is: {} {}", result, area.toString());
        if (result > 0 && cacheClient.isOpenCache()) {
            //美国所有地区缓存key
            String areaListKey = cacheClient.toKey(AREA_KEY_PREFIX_LIST, 1);
            cacheClient.delete(areaListKey);
        }
        return result;
    }

    @Override
    public int insertSelective(Area record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(Area area) {
        int result = areaMapper.updateByPrimaryKeySelective(area);
        logger.debug("update area into  db result is: {}", result);
        if (result > 0 && cacheClient.isOpenCache()) {
            //美国所有地区缓存key
            String areaListKey = cacheClient.toKey(AREA_KEY_PREFIX_LIST, 1);
            cacheClient.delete(AREA_KEY_PREFIX_ID + ":" + area.getId());
            cacheClient.delete(areaListKey);
        }
        return result;
    }

    @Override
    public int updateByPrimaryKey(Area record) {
        return 0;
    }

    public Area selectByPrimaryKey(Long id) {
        Object objectFromCache = null;
        String areaKey = cacheClient.toKey(AREA_KEY_PREFIX_ID, id);
        if (false) {
            objectFromCache = cacheClient.getFromCache(areaKey);
            // logger.debug("get  area from cache key is: {} value is: {}", areaKey, objectFromCache);
        }
        if (objectFromCache != null) {
            return (Area) objectFromCache;
        }

        Area area = areaMapper.selectByPrimaryKey(id);
        if (cacheClient.isOpenCache()) {
            cacheClient.putInCacheDefaultExpire(areaKey, area);
            logger.debug("put area  into cache key: {} value:{}: ", areaKey,
                    cacheClient.getFromCache(areaKey));
        }
        return area;
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        int result = areaMapper.deleteByPrimaryKey(id);
        if (result > 0 && cacheClient.isOpenCache()) {
            String areaKey = cacheClient.toKey(AREA_KEY_PREFIX_ID, id);
            if (cacheClient.keyExists(areaKey)) {
                cacheClient.delete(areaKey);
            }
            cacheClient.delete(cacheClient.toKey(AREA_KEY_PREFIX_LIST, 1));
        }
        return result;
    }

    public List<Area> selectListByInID(String ids) {
        if (StringTools.isEmpty(ids))
            return null;
        List list = new ArrayList();
        String[] idsArr = ids.split(",");
        for (String id : idsArr) {
            list.add(id);
        }
        return areaMapper.selectListByInID(list);
    }

    public List<Area> selectListByInIDOrder(String ids) {
        List<Area> areaList = selectListByInID(ids);
        List<Area> areaListNew = new ArrayList<Area>();
        String areaArr[] = ids.split(",");
        for (String areaid : areaArr) {
            for (Area area : areaList) {
                if (areaid.equals(area.getId() + "")) {
                    areaListNew.add(area);
                    break;
                }
            }
        }
        return areaListNew;
    }

    public List<Area> selectListByInID(List areas) {
        return areaMapper.selectListByInID(areas);
    }

    @Override
    public Area selectByAsid(Long asid) {
        Area area = areaMapper.selectByAsid(asid);
        return area;
    }
}
