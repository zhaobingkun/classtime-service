package com.classtime.service.manager.impl;

import com.classtime.service.beans.RolePermissions;
import com.classtime.service.dao.SysUserMapper;
import com.classtime.service.manager.CacheClient;
import com.classtime.service.manager.SysUserManager;
import com.classtime.service.model.PermsResource;
import com.classtime.service.model.Role;
import com.classtime.service.model.SysUser;
import com.classtime.service.utils.SecurityUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * Created by zhaobk on 2014/9/15.
 */
@Service(value = "sysUserManager")
class SysUserManagerImpl implements SysUserManager {
    protected static Logger logger = LoggerFactory.getLogger(SysUserManagerImpl.class);
    private static final String KEY_PREFIX_LOGINNAME = "SysUser:loginName";
    @Autowired
    private SysUserMapper sysUserMapper;
    @Autowired
    private CacheClient cacheClient;

    public SysUser selectByPrimaryKey(Long id) {
        SysUser user = sysUserMapper.selectByPrimaryKey(id);
        return user;
    }

    public SysUser findByLoginName(String loginName) {
        Object objectFromCache = null;
        String cacheKey = cacheClient.toKey(KEY_PREFIX_LOGINNAME, loginName);
        if (cacheClient.isOpenCache()) {
            objectFromCache = cacheClient.getFromCache(cacheKey);
            logger.debug("get user  from cache key is: {} value is: {}", cacheKey, objectFromCache);
        }
        if (objectFromCache != null) {
            return (SysUser) objectFromCache;
        }

        SysUser sysUser = null;
        List<SysUser> userList = sysUserMapper.findByLoginName(loginName);
        if (userList != null && userList.size() > 0) {
            sysUser = userList.get(0);
        }
        if (cacheClient.isOpenCache()) {
            cacheClient.putInCache(cacheKey, sysUser);
            logger.debug("put userKey  into cache key: {} value:{}: ", cacheKey,
                    sysUser);
        }
        return sysUser;
    }

    @Override
    public List<SysUser> findAll() {
        return sysUserMapper.selectAll();
    }

    public List<RolePermissions> getRolePerms(Role role) {
        List<RolePermissions> rs = new ArrayList<RolePermissions>();
        Map<RolePermissions.Menu, List<PermsResource>> my = new HashMap<RolePermissions.Menu, List<PermsResource>>();
        List<PermsResource> perms = role.getPerms();
        if (null != perms) {
            for (PermsResource permsResource : perms) {
                List<PermsResource> ori = my.get(permsResource.getMenu());
                if (ori != null) {
                    my.get(permsResource.getMenu()).add(permsResource);
                    continue;
                }

                List<PermsResource> permsResources = new ArrayList<PermsResource>();
                permsResources.add(permsResource);
                my.put(permsResource.getMenu(), permsResources);
            }
        }
        for (Map.Entry<RolePermissions.Menu, List<PermsResource>> entry : my.entrySet()) {
            RolePermissions permissions = new RolePermissions();
            permissions.setType(entry.getKey());
            permissions.setPermsResources(entry.getValue());
            rs.add(permissions);
        }
        Collections.sort(rs, new Comparator<RolePermissions>() {
            public int compare(RolePermissions o1, RolePermissions o2) {
                return o1.getType().compareTo(o2.getType());
            }

            ;
        });
        return rs;
    }

    @Override
    public int insert(SysUser record) {
        record.setPasswd(SecurityUtil.encryptStr(record.getPasswd(), SecurityUtil.HashType.SHA_1, true));
        return sysUserMapper.insert(record);
    }

    @Override
    public int update(SysUser record) {
        record.setPasswd(SecurityUtil.encryptStr(record.getPasswd(), SecurityUtil.HashType.SHA_1, true));
        SysUser sysUser = sysUserMapper.selectByPrimaryKey(record.getId());
        if (sysUser != null) {
            String cacheKey = cacheClient.toKey(KEY_PREFIX_LOGINNAME, sysUser.getLoginname());
            cacheClient.delete(cacheKey);
        }
        return sysUserMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        int result = -1;
        SysUser user = selectByPrimaryKey(id);
        if (user != null) {
            result = sysUserMapper.deleteByPrimaryKey(id);
            String cacheKey = cacheClient.toKey(KEY_PREFIX_LOGINNAME, user.getLoginname());
            cacheClient.delete(cacheKey);
        }
        return result;
    }
}
