package com.classtime.service.manager.impl;

import com.classtime.service.dao.ClassTimeChildMapper;
import com.classtime.service.manager.ClassTimeChildManager;
import com.classtime.service.model.ClassTimeChild;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2016/6/17.
 */

@Service
public class ClassTimeChildManagerImpl implements ClassTimeChildManager {

    @Autowired
    private ClassTimeChildMapper classTimeChildDao;

    @Override
    public int deleteByPrimaryKey(Long id) {
        int result = classTimeChildDao.deleteByPrimaryKey(id);
        return result;
    }

    @Override
    public int insert(ClassTimeChild record) {
        int result = classTimeChildDao.insert(record);
        return result;
    }

    @Override
    public int insertSelective(ClassTimeChild record) {
        int result = classTimeChildDao.insertSelective(record);
        return result;
    }

    @Override
    public ClassTimeChild selectByPrimaryKey(Integer id) {
        ClassTimeChild result = classTimeChildDao.selectByPrimaryKey(id);
        return result;
    }

    @Override
    public int updateByPrimaryKeySelective(ClassTimeChild record) {
        int result = classTimeChildDao.updateByPrimaryKeySelective(record);
        return result;
    }

    @Override
    public int updateByPrimaryKey(ClassTimeChild record) {
        int result = classTimeChildDao.updateByPrimaryKey(record);
        return result;
    }

    @Override
    public int addClassTimeChildBatch(List<ClassTimeChild> classTimeChildList) {
        int result = classTimeChildDao.addCodeBatch(classTimeChildList);
        return result;
    }

    @Override
    public List<ClassTimeChild> selectByMainId(int mid) {
        List<ClassTimeChild> result = classTimeChildDao.selectByMainId(mid);
        return result;
    }

    @Override
    public List<ClassTimeChild> selectByMainIdByMonth(int mid) {
        List<ClassTimeChild> result = classTimeChildDao.selectByMainIdByMonth(mid);
        return result;
    }
}
