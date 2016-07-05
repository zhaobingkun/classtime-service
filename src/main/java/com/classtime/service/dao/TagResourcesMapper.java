package com.classtime.service.dao;

import com.classtime.service.model.TagResources;

import java.util.List;
import java.util.Map;

public interface TagResourcesMapper extends BaseObjectMapper<TagResources, Long> {
    List<TagResources> selectBySelective(Map map);

    List<TagResources> selectByTagid(Map map);
}