package com.classtime.service.model;

public class Tag extends BaseObject {
    public static final Long CATEID_PLAN_TAG = 1l;//行程标签1，
    public static final Long CATEID_PLAN_CATE = 0l;//行程分类0
    private Long id;
    private String name;
    //分类，行程分类0,如行程标签1，
    private Integer cateid;

    private Boolean status;

    private Integer sortnum;
    private String ext1;

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

    public Integer getCateid() {
        return cateid;
    }

    public void setCateid(Integer cateid) {
        this.cateid = cateid;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Integer getSortnum() {
        return sortnum;
    }

    public void setSortnum(Integer sortnum) {
        this.sortnum = sortnum;
    }

    public String getExt1() {
        return ext1;
    }

    public void setExt1(String ext1) {
        this.ext1 = ext1;
    }
}