package com.classtime.service.manager;

import com.classtime.service.model.ClassTimeChild;

import java.util.List;

/**
 * Created by Administrator on 2016/6/17.
 */
public interface ClassTimeChildManager extends BaseObjectManager<ClassTimeChild,Integer> {
    int addClassTimeChildBatch(List<ClassTimeChild> classTimeChildList);
}