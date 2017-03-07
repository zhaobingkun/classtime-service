package com.classtime.service.manager;

import com.classtime.service.model.ClassTimeChild;

import java.util.List;

/**
 * Created by Administrator on 2016/6/17.
 */
public interface ClassTimeChildManager extends BaseObjectManager<ClassTimeChild,Integer> {
    int addClassTimeChildBatch(List<ClassTimeChild> classTimeChildList);
    List<ClassTimeChild> selectByMainId(int mid);
    List<ClassTimeChild> selectByMainIdByMonth(int sid,String checkDate);
    List<ClassTimeChild> selectByMainIdByDay(int sid,String checkDate);
    List<ClassTimeChild> selectMobileByDay(String checkDate);
    int updateClassStatus(String checkDate);
    List<ClassTimeChild> selectStatusByChild(int mid);
    int deleteByMainId(int mid);
}
