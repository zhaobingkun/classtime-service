package com.classtime.service.model;

import com.classtime.service.beans.RolePermissions;

public class PermsResource extends BaseObject {
    private Long id;

    private String name;

    private String url;

    private String permission;

    private String requestmethod;

    private String resourcetype;

    private RolePermissions.Menu menu;

    private Integer listno;

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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission == null ? null : permission.trim();
    }

    public String getRequestmethod() {
        return requestmethod;
    }

    public void setRequestmethod(String requestmethod) {
        this.requestmethod = requestmethod == null ? null : requestmethod.trim();
    }

    public String getResourcetype() {
        return resourcetype;
    }

    public void setResourcetype(String resourcetype) {
        this.resourcetype = resourcetype == null ? null : resourcetype.trim();
    }

    public RolePermissions.Menu getMenu() {
        return menu;
    }

    public void setMenu(RolePermissions.Menu menu) {
        this.menu = menu;
    }

    public Integer getListno() {
        return listno;
    }

    public void setListno(Integer listno) {
        this.listno = listno;
    }
}