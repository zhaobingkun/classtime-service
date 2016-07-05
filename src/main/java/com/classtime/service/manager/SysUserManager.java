package com.classtime.service.manager;

import com.classtime.service.beans.RolePermissions;
import com.classtime.service.model.Role;
import com.classtime.service.model.SysUser;

import java.util.List;

/**
 * Created by zhaobk on 2014/9/15.
 */
public interface SysUserManager {
    public SysUser selectByPrimaryKey(Long id);

    public SysUser findByLoginName(String loginName);

    public List<SysUser> findAll();

    public List<RolePermissions> getRolePerms(Role role);

    int insert(SysUser record);

    public int update(SysUser record);

    int deleteByPrimaryKey(Long id);
}
