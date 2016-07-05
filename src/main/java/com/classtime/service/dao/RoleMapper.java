package com.classtime.service.dao;

import com.classtime.service.model.Role;

import java.util.List;

public interface RoleMapper extends BaseObjectMapper<Role, Long> {
    public List<Role> selectAll();
}