package com.classtime.service.dao;

import com.classtime.service.model.ClassTimeChild;

import java.util.List;

public interface ClassTimeChildMapper extends  BaseObjectMapper<ClassTimeChild,Integer>{
    int addCodeBatch(List<ClassTimeChild> classTimeChildList);
    List<ClassTimeChild> selectByMainId(int mid);

    List<ClassTimeChild> selectByMainIdByMonth(int mid);
}