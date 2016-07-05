package com.classtime.service.model;

import java.util.Date;

public class ClassTimeMain  extends BaseObject{
    private static final long serialVersionUID = 7314956568727990574L;
    private Integer id;

    //private Integer cid;
    private Integer sid;

    private String classname;

    private Integer categoryid;

    private Integer orgclassid;

    private String color;

    private Date begintime;

    private Date endtime;

    private Integer num;

    private Integer sumnum;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

/*    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }*/

    public Date getBegintime() {
        return begintime;
    }

    public void setBegintime(Date begintime) {
        this.begintime = begintime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getSumnum() {
        return sumnum;
    }

    public void setSumnum(Integer sumnum) {
        this.sumnum = sumnum;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getOrgclassid() {
        return orgclassid;
    }

    public void setOrgclassid(Integer orgclassid) {
        this.orgclassid = orgclassid;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public Integer getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(Integer categoryid) {
        this.categoryid = categoryid;
    }
}