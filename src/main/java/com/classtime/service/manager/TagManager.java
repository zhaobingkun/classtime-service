package com.classtime.service.manager;

import com.classtime.service.model.Tag;

import java.util.List;

/**
 * Created by zhaobk on 2016-01-18.
 * 标签管理类
 */
public interface TagManager extends BaseObjectManager<Tag, Long> {
    /**
     * 根据分类类型获取所有的标签
     *
     * @param cateid,分类, 行程标签=1，即Tag.CATEID_PLAN_TAG；行程分类=0，即Tag.CATEID_PLAN_CATE；
     * @return List<Tag>
     */
    List<Tag> selectAll(Long cateid);

    /**
     * 根据分类类型获取所有的status=1的标签
     *
     * @param cateid,分类, 行程标签=1，即Tag.CATEID_PLAN_TAG；行程分类=0，即Tag.CATEID_PLAN_CATE；
     * @return List<Tag>
     */
    List<Tag> selectByCate(Long cateid);

    /**
     * 根据资源id获取所有的status=1的标签，并且cateid=1，行程标签；
     */
    List<Tag> selectTagByResourceid(Long resourcesid);

    /**
     * 根据资源id获取所有的status=1的标签，并且cateid=0，行程分类；
     */
    Tag selectCateByResourceid(Long resourcesid);

}
