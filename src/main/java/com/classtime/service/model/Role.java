package com.classtime.service.model;

import java.util.List;

public class Role extends BaseObject {
    private Long id;

    private String name;

    private String des;
    private List<PermsResource> perms;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des == null ? null : des.trim();
    }

    public List<PermsResource> getPerms() {
        return perms;
    }

    public void setPerms(List<PermsResource> perms) {
        this.perms = perms;
    }
}