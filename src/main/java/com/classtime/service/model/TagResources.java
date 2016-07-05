package com.classtime.service.model;

public class TagResources extends BaseObject {
    private Long id;
    private Long tagid;
    private Long resourcesid;
    private int sortnum;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTagid() {
        return tagid;
    }

    public void setTagid(Long tagid) {
        this.tagid = tagid;
    }

    public Long getResourcesid() {
        return resourcesid;
    }

    public void setResourcesid(Long resourcesid) {
        this.resourcesid = resourcesid;
    }

    public int getSortnum() {
        return sortnum;
    }

    public void setSortnum(int sortnum) {
        this.sortnum = sortnum;
    }

}