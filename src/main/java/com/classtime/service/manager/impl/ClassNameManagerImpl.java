package com.classtime.service.manager.impl;

import com.classtime.service.manager.ClassNameManager;
import com.classtime.service.model.ClassName;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2016/6/17.
 */
@Service
public class ClassNameManagerImpl implements ClassNameManager {
    @Override
    public int deleteByPrimaryKey(Long id) {
        return 0;
    }

    @Override
    public int insert(ClassName record) {
        return 0;
    }

    @Override
    public int insertSelective(ClassName record) {
        return 0;
    }

    @Override
    public ClassName selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(ClassName record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(ClassName record) {
        return 0;
    }
}
