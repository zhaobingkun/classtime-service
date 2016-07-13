package com.classtime.service.dao;

import com.classtime.service.model.Student;

import java.util.List;

public interface StudentMapper extends  BaseObjectMapper<Student,Integer>{
    List<Student>  selectForUser(int uid);

    List<Student>  selectForUserAndClass(int uid);
}