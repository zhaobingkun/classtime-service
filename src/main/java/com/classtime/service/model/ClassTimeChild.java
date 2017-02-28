package com.classtime.service.model;

import java.util.Date;

public class ClassTimeChild  extends BaseObject{
    private static final long serialVersionUID = -3219013717206993967L;
    private Integer id;

    private Integer mid;

    private int sid;

    private String classname;

    private String classaddress;

    private String student;

    private Date classdatetime;

    private Date endtime;

    private String content;

    private String mobile;

    private Integer status;

    private ClassTimeMain classTimeMain;

    private int classnum;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public Date getClassdatetime() {
        return classdatetime;
    }

    public void setClassdatetime(Date classdatetime) {
        this.classdatetime = classdatetime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public ClassTimeMain getClassTimeMain() {
        return classTimeMain;
    }

    public void setClassTimeMain(ClassTimeMain classTimeMain) {
        this.classTimeMain = classTimeMain;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public String getClassaddress() {
        return classaddress;
    }

    public void setClassaddress(String classaddress) {
        this.classaddress = classaddress;
    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public int getClassnum() {
        return classnum;
    }

    public void setClassnum(int classnum) {
        this.classnum = classnum;
    }
}