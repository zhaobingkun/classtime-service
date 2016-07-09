package com.classtime.service.model;

import java.util.Date;
import java.util.List;

public class Student  extends BaseObject{
    private static final long serialVersionUID = -4888712186769684697L;
    private Integer id;

    private Integer uid;

    private String name;

    private Integer sex;

    private String address;

    private String school;

    private Date old;

    private String sno;

    private List<ClassTimeMain> classTimeMainList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public Date getOld() {
        return old;
    }

    public void setOld(Date old) {
        this.old = old;
    }

    public List<ClassTimeMain> getClassTimeMainList() {
        return classTimeMainList;
    }

    public void setClassTimeMainList(List<ClassTimeMain> classTimeMainList) {
        this.classTimeMainList = classTimeMainList;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }
}