package com.classtime.service.manager.impl;

import com.classtime.service.dao.TagMapper;
import com.classtime.service.manager.TagManager;
import com.classtime.service.model.Tag;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zhaobk on 2016-01-18.
 */
@Service
public class TagManagerImpl implements TagManager {
    protected static Logger logger = LoggerFactory.getLogger(TagManagerImpl.class);

    @Autowired
    private TagMapper tagMapper;

    public List<Tag> selectAll(Long cateid) {
        Map<String, Object> map = new HashMap<String, Object>();
        if (cateid != null) {
            map.put("cateid", cateid);
        }
        return tagMapper.selectBySelective(map);
    }

    @Override
    public List<Tag> selectByCate(Long cateid) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("cateid", cateid);
        map.put("status", true);
        return tagMapper.selectBySelective(map);
    }

    @Override
    public List<Tag> selectTagByResourceid(Long resourcesid) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("cateid", Tag.CATEID_PLAN_TAG);
        map.put("resourcesid", resourcesid);
        return tagMapper.selectByResourceid(map);
    }

    @Override
    public Tag selectCateByResourceid(Long resourcesid) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("cateid", Tag.CATEID_PLAN_CATE);
        map.put("resourcesid", resourcesid);
        List<Tag> list = tagMapper.selectByResourceid(map);
        if (list != null && list.size() > 0) {
            return list.get(0);
        }
        return null;
    }


    @Override
    public int deleteByPrimaryKey(Long id) {
        return tagMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Tag record) {
        return tagMapper.insert(record);
    }

    @Override
    public int insertSelective(Tag record) {
        return tagMapper.insert(record);
    }

    @Override
    public Tag selectByPrimaryKey(Long id) {
        Tag result = tagMapper.selectByPrimaryKey(id);
        return result;
    }

    @Override
    public int updateByPrimaryKeySelective(Tag record) {
        return tagMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Tag record) {
        return tagMapper.updateByPrimaryKey(record);
    }
}
