package com.classtime.service.dao;

import com.classtime.service.model.SysUser;

import java.util.List;

public interface SysUserMapper extends BaseObjectMapper<SysUser, Long> {
    public List<SysUser> findByLoginName(String loginname);
    public List<SysUser> selectAll();
}