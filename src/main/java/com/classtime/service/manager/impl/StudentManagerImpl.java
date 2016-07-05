package com.classtime.service.manager.impl;

import com.classtime.service.dao.StudentMapper;
import com.classtime.service.manager.StudentManager;
import com.classtime.service.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2016/6/17.
 */
@Service
public class StudentManagerImpl implements StudentManager {
    @Autowired
    private StudentMapper studentDao;


    @Override
    public int deleteByPrimaryKey(Long id) {
        int result = studentDao.deleteByPrimaryKey(id);
        return result;
    }

    @Override
    public int insert(Student record) {
        int result = studentDao.insert(record);
        return result;
    }

    @Override
    public int insertSelective(Student record) {
        int result = studentDao.insertSelective(record);
        return result;
    }

    @Override
    public Student selectByPrimaryKey(Integer id) {
        Student result = studentDao.selectByPrimaryKey(id);
        return result;
    }

    @Override
    public int updateByPrimaryKeySelective(Student record) {
        int result = studentDao.updateByPrimaryKeySelective(record);
        return result;
    }

    @Override
    public int updateByPrimaryKey(Student record) {
        int result = studentDao.updateByPrimaryKey(record);
        return result;
    }
}
