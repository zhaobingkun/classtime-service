package com.classtime.service.dao;

import com.classtime.service.model.Tag;

import java.util.List;
import java.util.Map;

public interface TagMapper extends BaseObjectMapper<Tag,Long> {
    List<Tag> selectBySelective(Map map);

    List<Tag> selectByResourceid(Map map);
}