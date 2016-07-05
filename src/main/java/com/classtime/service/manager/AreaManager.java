package com.classtime.service.manager;

import com.classtime.service.model.Area;

import java.util.List;

/**
 * Created by zhaobk on 2014/9/19.
 */
public interface AreaManager extends BaseObjectManager<Area, Long> {
    /**
     * 根据rivateid获得地区列表，当privateid=0时，获取国家列表
     */
    public List<Area> findByPrivateId(Long privateId);

    List<Area> selectListByInID(String ids);

    //按逗号间隔的id顺序查找
    List<Area> selectListByInIDOrder(String ids);

    List<Area> selectListByInID(List areas);


    Area selectByAsid(Long asid);//根据负责人id查大区id

}