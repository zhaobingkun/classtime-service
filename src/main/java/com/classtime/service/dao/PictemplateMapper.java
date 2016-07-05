package com.classtime.service.dao;

import com.classtime.service.model.Pictemplate;

import java.util.List;
import java.util.Map;

public interface PictemplateMapper extends BaseObjectMapper<Pictemplate, Long> {




    int  deleteByFileName(String filename);

    List<Pictemplate> getPictemplateList(Map map);

    List<Pictemplate> selectBySelective(Map map);

    List<Pictemplate> getPictemplateListNew(Map map);

    List<Pictemplate> selectBySelectiveNew(Map map);

}