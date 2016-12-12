package com.classtime.service.model;

import java.util.Date;

public class ClassTimeChild  extends BaseObject{
    private static final long serialVersionUID = -3219013717206993967L;
    private Integer id;

    private Integer mid;

    private Date classdatetime;

    private Date endtime;

    private String content;

    private Integer status;

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
}