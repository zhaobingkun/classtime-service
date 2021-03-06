package com.classtime.service.manager.impl;

import com.classtime.service.dao.ClassTimeChildMapper;
import com.classtime.service.manager.ClassTimeChildManager;
import com.classtime.service.model.ClassTimeChild;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    public List<ClassTimeChild> selectByMainIdByMonth(int sid,String checkDate) {
        Map<String,Object> paramMap = new HashMap<String,Object>();
        paramMap.put("sid",sid);
        paramMap.put("checkDate",checkDate);
        List<ClassTimeChild> result = classTimeChildDao.selectByMainIdByMonth(paramMap);
        return result;
    }

    @Override
    public List<ClassTimeChild> selectByMainIdByDay(int sid, String checkDate) {
        Map<String,Object> paramMap = new HashMap<String,Object>();
        paramMap.put("sid",sid);
        paramMap.put("checkDate",checkDate);
        List<ClassTimeChild> result = classTimeChildDao.selectByMainIdByDay(paramMap);
        return result;
    }

    @Override
    public List<ClassTimeChild> selectMobileByDay(String checkDate) {
        Map<String,Object> paramMap = new HashMap<String,Object>();

        paramMap.put("checkDate",checkDate);
        List<ClassTimeChild> result = classTimeChildDao.selectMobileByDay(paramMap);
        return result;
    }

    @Override
    public int updateClassStatus(String checkDate) {
        Map<String,Object> paramMap = new HashMap<String,Object>();

        paramMap.put("checkDate",checkDate);

        //System.out.println("service checkDate==="+checkDate);

        int result = classTimeChildDao.updateClassStatus(paramMap);

        //System.out.println("service result==="+result);

        return result;
    }

    @Override
    public List<ClassTimeChild> selectStatusByChild(int mid) {
        Map<String,Object> paramMap = new HashMap<String,Object>();

        paramMap.put("mid",mid);
        List<ClassTimeChild> result = classTimeChildDao.selectStatusByChild(paramMap);
        return result;
    }

    @Override
    public List<ClassTimeChild> selectByStatus(int mid,int status) {
        Map<String,Object> paramMap = new HashMap<String,Object>();
        paramMap.put("status",status);
        paramMap.put("mid",mid);
        List<ClassTimeChild> result = classTimeChildDao.selectByStatus(paramMap);
        return result;
    }

    @Override
    public int deleteByMainId(int mid) {
        int result = classTimeChildDao.deleteByMainId(mid);
        return result;
    }
}
