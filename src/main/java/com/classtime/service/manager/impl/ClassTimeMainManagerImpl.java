package com.classtime.service.manager.impl;

import com.classtime.service.dao.ClassTimeMainMapper;
import com.classtime.service.manager.ClassTimeMainManager;
import com.classtime.service.model.ClassTimeMain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2016/6/17.
 */
@Service
public class ClassTimeMainManagerImpl implements ClassTimeMainManager {
    @Autowired
    private ClassTimeMainMapper classTimeMainDao;

    @Override
    public int deleteByPrimaryKey(Long id) {
        int result = classTimeMainDao.deleteByPrimaryKey(id);
        return result;
    }

    @Override
    public int insert(ClassTimeMain record) {
        int result = classTimeMainDao.insert(record);
        return result;
    }

    @Override
    public int insertSelective(ClassTimeMain record) {
        int result = classTimeMainDao.insertSelective(record);
        return result;
    }

    @Override
    public ClassTimeMain selectByPrimaryKey(Integer id) {
        ClassTimeMain result = classTimeMainDao.selectByPrimaryKey(id);
        return result;
    }

    @Override
    public int updateByPrimaryKeySelective(ClassTimeMain record) {
        int result = classTimeMainDao.updateByPrimaryKeySelective(record);
        return result;
    }

    @Override
    public int updateByPrimaryKey(ClassTimeMain record) {
        int result = classTimeMainDao.updateByPrimaryKey(record);
        return result;
    }

    @Override
    public List<ClassTimeMain> selectClassMainForSid(int sid) {
        List<ClassTimeMain> result = classTimeMainDao.selectClassMainForSid(sid);
        return result;
    }

    @Override
    public List<ClassTimeMain> selectClassMainById(int mid) {
        List<ClassTimeMain> result = classTimeMainDao.selectClassMainById(mid);
        return result;
    }
}
