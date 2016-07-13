package com.classtime.service.manager;

import com.classtime.service.model.Student;

import java.util.List;

/**
 * Created by Administrator on 2016/6/17.
 */
public interface StudentManager extends BaseObjectManager<Student,Integer> {
    List<Student> selectForUser(int uid);

    List<Student>  selectForUserAndClass(int uid);
}
