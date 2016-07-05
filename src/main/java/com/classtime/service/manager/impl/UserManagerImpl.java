package com.classtime.service.manager.impl;

import com.classtime.service.manager.UserManager;


import com.classtime.service.model.User;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2016/6/17.
 */
@Service
public class UserManagerImpl implements UserManager {
    @Override
    public int deleteByPrimaryKey(Long id) {
        return 0;
    }

    @Override
    public int insert(User record) {
        return 0;
    }

    @Override
    public int insertSelective(User record) {
        return 0;
    }

    @Override
    public User selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(User record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(User record) {
        return 0;
    }
}
