package com.classtime.service.manager.impl;

import com.classtime.service.dao.TagResourcesMapper;
import com.classtime.service.manager.TagResourcesManager;
import com.classtime.service.model.Tag;
import com.classtime.service.model.TagResources;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zhaobk on 2016-01-18.
 */
@Service
public class TagResourcesManagerImpl implements TagResourcesManager {
    protected static Logger logger = LoggerFactory.getLogger(TagResourcesManagerImpl.class);
    @Autowired
    private TagResourcesMapper tagResourcesMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        int result = tagResourcesMapper.deleteByPrimaryKey(id);
        logger.debug("deleteByPrimaryKey TagResources into  db result is: {} {}", result);
        return result;
    }

    @Override
    public int insert(TagResources record) {
        int result = tagResourcesMapper.insert(record);
        logger.debug("insert TagResources into  db result is: {} {}", result, record.toString());
        return result;
    }

    @Override
    public int insertSelective(TagResources record) {
        int result = tagResourcesMapper.insertSelective(record);
        logger.debug("insertSelective TagResources into  db result is: {} {}", result, record.toString());
        return result;
    }

    @Override
    public TagResources selectByPrimaryKey(Long id) {
        TagResources result = tagResourcesMapper.selectByPrimaryKey(id);
        if (result != null)
            logger.debug("selectByPrimaryKey TagResources into  db result is: {} ", result.toString());
        return result;
    }

    @Override
    public int updateByPrimaryKeySelective(TagResources record) {
        int result = tagResourcesMapper.updateByPrimaryKeySelective(record);
        logger.debug("insert updateByPrimaryKeySelective into  db result is: {} {}", result, record.toString());
        return result;
    }

    @Override
    public int updateByPrimaryKey(TagResources record) {
        int result = tagResourcesMapper.updateByPrimaryKeySelective(record);
        logger.debug("insert updateByPrimaryKeySelective into  db result is: {} {}", result, record.toString());
        return result;
    }

    public TagResources selectByResourceidAndTagid(Long resourcesid, Long tagid) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("tagid", tagid);
        map.put("resourcesid", resourcesid);
        List<TagResources> list = tagResourcesMapper.selectBySelective(map);
        if (list != null && list.size() > 0) {
            return list.get(0);
        }
        return null;
    }

    public List<TagResources> selectByTagid(Long tagid) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("tagid", tagid);
        List<TagResources> list = tagResourcesMapper.selectByTagid(map);
        return list;
    }
}
