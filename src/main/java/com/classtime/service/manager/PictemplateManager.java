package com.classtime.service.manager;

import com.classtime.service.model.Pictemplate;

import java.util.List;

/**
 * Created by Administrator on 2014/9/19.
 */
public interface PictemplateManager {

    public Pictemplate selectByPrimaryKey(Long id);

    public int  deleteByPrimaryKey(Long id);

    public int  deleteByFileName(String filename);

    int insert(Pictemplate record);

    int insertSelective(Pictemplate record);

    int updateByPrimaryKeySelective(Pictemplate record);

    int updateByPrimaryKey(Pictemplate record);

    //type标记：1：封面，2：地图，0：普通
    //categroy 1：餐饮，2：景点：3：导游：4：酒店，5：包车：6：签证：17：行程单：18：线路 19：用车服务 20：产品包
    //图片尺寸按路径   http://img.etripworld.com/bigger/ + 库里检索出的文件名
    // bigger（大） medium（中）  small（小） source（原图）

    List<Pictemplate> getPictemplateList(Long category, Long parentid, int type);

    List<Pictemplate> getPictemplateListNew(Long category, Long parentid);

    List<Pictemplate> selectListByPage(Long category, Long parentid, int type, int star, int num);

    List<Pictemplate> selectListByPageNew(Long category, Long parentid, int star, int num);


}
