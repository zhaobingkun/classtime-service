package com.classtime.service.dao;

import com.classtime.service.model.ClassTimeMain;

import java.util.List;

public interface ClassTimeMainMapper  extends  BaseObjectMapper<ClassTimeMain,Integer>{
    List<ClassTimeMain> selectClassMainForSid(int sid);

    List<ClassTimeMain> selectClassMainById(int mid);
}