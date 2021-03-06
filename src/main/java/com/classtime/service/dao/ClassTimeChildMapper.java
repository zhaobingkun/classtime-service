package com.classtime.service.dao;

import com.classtime.service.model.ClassTimeChild;

import java.util.List;
import java.util.Map;

public interface ClassTimeChildMapper extends  BaseObjectMapper<ClassTimeChild,Integer>{
    int addCodeBatch(List<ClassTimeChild> classTimeChildList);
    List<ClassTimeChild> selectByMainId(int mid);
    List<ClassTimeChild> selectByMainIdByMonth(Map paraMap);
    List<ClassTimeChild> selectByMainIdByDay(Map paraMap);
    List<ClassTimeChild> selectMobileByDay(Map paraMap);
    int updateClassStatus(Map paraMap);
    List<ClassTimeChild> selectStatusByChild(Map paraMap);

    List<ClassTimeChild> selectByStatus(Map paraMap);
    int deleteByMainId(int mid);
}