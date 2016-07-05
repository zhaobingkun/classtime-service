package com.classtime.service.dao;

import com.classtime.service.model.Area;

import java.util.List;

public interface AreaMapper extends BaseObjectMapper<Area, Long> {
    List<Area> selectBySelective(Area record);

    List<Area> selectListByInID(List list);

    Area selectByAsid(Long asid);
}