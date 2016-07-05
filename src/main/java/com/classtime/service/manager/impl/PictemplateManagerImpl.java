package com.classtime.service.manager.impl;

import com.classtime.service.dao.PictemplateMapper;
import com.classtime.service.manager.PictemplateManager;
import com.classtime.service.model.Pictemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2014/9/19.
 */
@Service
public class PictemplateManagerImpl implements PictemplateManager {

    protected static Logger logger = LoggerFactory.getLogger(PictemplateManagerImpl.class);

    @Autowired
    private PictemplateMapper pictemplateDao;

    public Pictemplate selectByPrimaryKey(Long id) {
        Pictemplate pictemplate = pictemplateDao.selectByPrimaryKey(id);
        return pictemplate;
    }

    public int deleteByPrimaryKey(Long id){
        int returnValue =  pictemplateDao.deleteByPrimaryKey(id);
        return returnValue;
    }

    public int  deleteByFileName(String filename){
        int returnValue =  pictemplateDao.deleteByFileName(filename);
        return returnValue;
    }

    public int insert(Pictemplate record){
        int returnValue = pictemplateDao.insert(record);
        return returnValue;
    }

    public  int insertSelective(Pictemplate record){
        int returnValue = pictemplateDao.insertSelective(record);
        return returnValue;
    }

    public  int updateByPrimaryKeySelective(Pictemplate record){
        int returnValue = pictemplateDao.updateByPrimaryKeySelective(record);
        return returnValue;
    }

    public  int updateByPrimaryKey(Pictemplate record){
        int returnValue = pictemplateDao.updateByPrimaryKey(record);
        return returnValue;
    }

    public List getPictemplateList(Long category,Long parentid,int type) {

        Map map = new HashMap();
        if (category != null) {
            map.put("category", category);
        }
        if (parentid != null) {
            map.put("parentid", parentid);
        }

        if (type != 0) {
            map.put("type", type);
        }

        List returnValue = pictemplateDao.getPictemplateList(map);

        return returnValue;
    }


    public List getPictemplateListNew(Long category,Long parentid) {

        Map map = new HashMap();
        if (category != null) {
            map.put("category", category);
        }
        if (parentid != null) {
            map.put("parentid", parentid);
        }


        List returnValue = pictemplateDao.getPictemplateListNew(map);

        return returnValue;
    }

    @Override
    public List<Pictemplate> selectListByPage(Long category,Long parentid,int type,int star, int num) {

        Map map = new HashMap();

        map.put("category",category);
        map.put("parentid",parentid);
        map.put("type",type);
        map.put("star",star);
        map.put("num", num);

        List<Pictemplate> picList = pictemplateDao.selectBySelective(map);

        return picList;
    }


    @Override
    public List<Pictemplate> selectListByPageNew(Long category,Long parentid,int star, int num) {

        Map map = new HashMap();

        map.put("category",category);
        map.put("parentid",parentid);
        map.put("star",star);
        map.put("num", num);

        List<Pictemplate> picList = pictemplateDao.selectBySelectiveNew(map);

        return picList;
    }
}
