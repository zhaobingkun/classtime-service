package com.classtime.service.manager;

import com.classtime.service.model.Cpsuser;

/**
 * Created by zhaobk on 2014/12/4.
 */
public interface CpsuserManager {

    public Cpsuser selectByPriaryKey(Long id);

    public Cpsuser findByEmail(String email);

    public Cpsuser findByPhone(String phone);

    int insert(Cpsuser record);

    public int update(Cpsuser record);

    int deleteByPrimaryKey(Long id);
}
