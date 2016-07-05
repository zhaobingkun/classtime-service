package com.classtime.service.manager;

import com.classtime.service.model.Tag;
import com.classtime.service.model.TagResources;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zhaobk on 2016-01-18.
 * 标签资源id对应管理类
 */
public interface TagResourcesManager extends BaseObjectManager<TagResources, Long> {
    TagResources selectByResourceidAndTagid(Long resourcesid, Long tagid);
    List<TagResources> selectByTagid(Long tagid);
}
