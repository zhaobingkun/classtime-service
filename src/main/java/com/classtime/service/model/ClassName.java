package com.classtime.service.model;

public class ClassName extends BaseObject{
    private static final long serialVersionUID = 3858631553811254910L;
    private Integer id;

    private Integer sid;

    private String classname;

    private Integer orgclassid;

    private String color;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname == null ? null : classname.trim();
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
        this.color = color == null ? null : color.trim();
    }
}