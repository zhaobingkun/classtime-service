package com.classtime.service.dao;

import com.classtime.service.model.Cpsuser;

import java.util.List;
import java.util.Map;

public interface CpsuserMapper extends BaseObjectMapper<Cpsuser, Long> {
    List<Cpsuser> findByLoginName(String loginName);
    List<Cpsuser> findByEmail(String email);
    List<Cpsuser> selectBySelective(Map map);
    int countBySelective(Map map);
}