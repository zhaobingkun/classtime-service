package com.classtime.service.model;

import java.util.Date;
import java.util.List;

public class ClassTimeMain  extends BaseObject{
    private static final long serialVersionUID = 7314956568727990574L;
    private Integer id;

    //private Integer cid;
    private Integer sid;

    private String classname;

    private Integer categoryid;

    private Integer orgclassid;

    private String color;

    private String begintimeStr;

    private Date begintime;

    private String endtimeStr;

    private Date endtime;

    private Integer num;

    private Integer leavenum;

    private Integer changenum;

    private Integer makeupnum;

    private Integer extendednum;

    private Integer sumnum;

    private String classaddress;

    private String weekday;

    private String classtime;


    private List<ClassTimeChild> classTimeChildList;


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

    public Integer getLeavenum() {
        return leavenum;
    }

    public void setLeavenum(Integer leavenum) {
        this.leavenum = leavenum;
    }

    public Integer getChangenum() {
        return changenum;
    }

    public void setChangenum(Integer changenum) {
        this.changenum = changenum;
    }

    public Integer getMakeupnum() {
        return makeupnum;
    }

    public void setMakeupnum(Integer makeupnum) {
        this.makeupnum = makeupnum;
    }

    public Integer getExtendednum() {
        return extendednum;
    }

    public void setExtendednum(Integer extendednum) {
        this.extendednum = extendednum;
    }

    public String getClassaddress() {
        return classaddress;
    }

    public void setClassaddress(String classaddress) {
        this.classaddress = classaddress;
    }

    public String getWeekday() {
        return weekday;
    }

    public void setWeekday(String weekday) {
        this.weekday = weekday;
    }

    public String getClasstime() {
        return classtime;
    }

    public void setClasstime(String classtime) {
        this.classtime = classtime;
    }

    public String getBegintimeStr() {
        return begintimeStr;
    }

    public void setBegintimeStr(String begintimeStr) {
        this.begintimeStr = begintimeStr;
    }

    public String getEndtimeStr() {
        return endtimeStr;
    }

    public void setEndtimeStr(String endtimeStr) {
        this.endtimeStr = endtimeStr;
    }

    public List<ClassTimeChild> getClassTimeChildList() {
        return classTimeChildList;
    }

    public void setClassTimeChildList(List<ClassTimeChild> classTimeChildList) {
        this.classTimeChildList = classTimeChildList;
    }
}