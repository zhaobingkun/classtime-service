package com.classtime.service.manager.impl;


import com.classtime.service.dao.CpsuserMapper;
import com.classtime.service.manager.CacheClient;
import com.classtime.service.manager.CpsuserManager;
import com.classtime.service.model.Cpsuser;
import com.classtime.service.utils.SecurityUtil;
import com.classtime.service.utils.StringTools;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

/**
 * Created by zhaobk on 2014/12/4.
 */
@Service
@Transactional
public class CpsuserManagerImpl implements CpsuserManager {
    protected static Logger logger = LoggerFactory.getLogger(CpsuserManagerImpl.class);
    //  private static final String KEY_PREFIX_LOGINNAME = "Cpsuser:loginName";
    private static final String KEY_PREFIX_EMAIL = "Cpsuser:email";

    @Autowired
    private CpsuserMapper cpsuserMapper;
    @Autowired
    private CacheClient cacheClient;

    @Override
    public Cpsuser selectByPriaryKey(Long id) {
        Cpsuser user = cpsuserMapper.selectByPrimaryKey(id);
        return user;
    }

    public Cpsuser findByEmail(String email) {
        logger.info("findByEmail email {}", email);
   /*     Object objectFromCache = null;
        String cacheKey = cacheClient.toKey(KEY_PREFIX_EMAIL, email);
        //  if (cacheClient.isOpenCache()) {
        if (false) {
            objectFromCache = cacheClient.getFromCache(cacheKey);
            logger.debug("get user  from cache key is: {} value is: {}", cacheKey, objectFromCache);
        }
        if (objectFromCache != null) {
            return (Cpsuser) objectFromCache;
        }
        logger.info("findByEmail email  {}  cache end ", email);*/
        Cpsuser user = null;
        try {
            List<Cpsuser> userList = cpsuserMapper.findByEmail(email);
            if (userList != null && userList.size() > 0) {
                user = userList.get(0);
            }
            logger.info("findByEmail email  {}  db end ", email);
        } catch (Exception e) {
            logger.error("findByEmail error  email  {}  message {}" + e.toString(), email, e.getMessage());
            e.printStackTrace();
        } finally {
            logger.info("findByEmail email  {}  db end finally ", email);
        }
        logger.info("findByEmail email  {}  db end  select ", email);
     /*   if (false) {
            // if (cacheClient.isOpenCache() && user != null) {
            cacheClient.putInCache(cacheKey, user);
            logger.debug("put userKey  into cache key: {} value:{}: ", cacheKey,
                    user);
        }*/
        return user;
    }

    @Override
    public Cpsuser findByPhone(String phone) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("contactphone", phone);
        List<Cpsuser> cpsuserList = cpsuserMapper.selectBySelective(map);
        if (cpsuserList != null && cpsuserList.size() > 0) {
            return cpsuserList.get(0);
        }
        return null;
    }

    @Override
    public int insert(Cpsuser record) {
        if (record.getPasswd() != null && !record.getPasswd().equals("")) {
            record.setPasswd(SecurityUtil.encryptStr(record.getPasswd(), SecurityUtil.HashType.SHA_1, true));
        }
        int i = cpsuserMapper.insert(record);
        return i;

    }

    @Override
    public int update(Cpsuser record) {
        if (!StringTools.isEmpty(record.getPasswd())) {
            record.setPasswd(SecurityUtil.encryptStr(record.getPasswd(), SecurityUtil.HashType.SHA_1, true));
        }
        Cpsuser sysUser = cpsuserMapper.selectByPrimaryKey(record.getId());
        if (sysUser != null) {
            String cacheKey = cacheClient.toKey(KEY_PREFIX_EMAIL, sysUser.getLoginname());
            cacheClient.delete(cacheKey);
        }
        record.setUpdatetime(new Date());
        return cpsuserMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        int result = -1;
        Cpsuser user = selectByPriaryKey(id);
        if (user != null) {
            result = cpsuserMapper.deleteByPrimaryKey(id);
            String cacheKey = cacheClient.toKey(KEY_PREFIX_EMAIL, user.getLoginname());
            cacheClient.delete(cacheKey);
        }
        return result;
    }
}
