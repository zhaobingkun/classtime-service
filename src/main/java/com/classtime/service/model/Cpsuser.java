package com.classtime.service.model;

import java.util.Date;

public class Cpsuser extends BaseObject {

    private static final long serialVersionUID = -4206182452603869487L;
    public static int CPSUSER_STATUS_NEW = 0;//新用户，未激
    public static int CPSUSER_STATUS_CHECK = 1;//验证
    public static int CPSUSER_STATUS_ACT = 1;//资料完成填写
    public static int CPSUSER_STATUS_OK = 2;//审核通过
    private Long id;

    private String nickname;

    private String loginname;

    private String passwd;

    private String email;
    private int status;
    private Date registertime;
    private String validatecode;
    private String contactphone;
    private int isorg;

    private Date updatetime;
    private Boolean ischeck;

    private String ext1;
    private String randomcode;

    private int sendstatus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname == null ? null : loginname.trim();
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd == null ? null : passwd.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getRegistertime() {
        return registertime;
    }

    public void setRegistertime(Date registertime) {
        this.registertime = registertime;
    }

    public String getValidatecode() {
        return validatecode;
    }

    public void setValidatecode(String validatecode) {
        this.validatecode = validatecode;
    }

    public String getContactphone() {
        return contactphone;
    }

    public void setContactphone(String contactphone) {
        this.contactphone = contactphone == null ? null : contactphone.trim();
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Boolean getIscheck() {
        return ischeck;
    }

    public void setIscheck(Boolean ischeck) {
        this.ischeck = ischeck;
    }

    public String getExt1() {
        return ext1;
    }

    public void setExt1(String ext1) {
        this.ext1 = ext1;
    }

    public String getRandomcode() {
        return randomcode;
    }

    public void setRandomcode(String randomcode) {
        this.randomcode = randomcode;
    }

    public int getIsorg() {
        return isorg;
    }

    public void setIsorg(int isorg) {
        this.isorg = isorg;
    }

    public int getSendstatus() {
        return sendstatus;
    }

    public void setSendstatus(int sendstatus) {
        this.sendstatus = sendstatus;
    }
}