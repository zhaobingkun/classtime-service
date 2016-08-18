package com.classtime.service.manager;

import com.classtime.service.model.ClassTimeMain;

import java.util.List;

/**
 * Created by Administrator on 2016/6/17.
 */
public interface ClassTimeMainManager extends BaseObjectManager<ClassTimeMain,Integer>  {

    List<ClassTimeMain> selectClassMainForSid(int sid);

    List<ClassTimeMain> selectClassMainById(int mid);
}
