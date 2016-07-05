package com.classtime.service.beans;

/**
 * Created by zhaobk on 2014/9/26.
 */
public class JsonResult {
    /**
     * 标示：1 成功 ； 非1为失败； 99: 数据库异常；88 网络异常； 66:对象不存在 ；55: 用户未登录；-1 未知错误 ；
     */
    public static final int OBJECT_NOT_EXIST = 66;
    public static final int SUCCESS = 1;
    public static final int USER_NOT_LOGIN = 55;
    public static final int DB_ERROR = 99;
    public static final int NET_ERROR = 88;
    public static final int UNKNOWN_ERROR = -1;
    private int rf;
    /**
     * 成功提示内容，或失败原因
     */
    private String rc;
    /**
     * 返回对象
     */
    private Object rv;

    public JsonResult(int rf, String rc, Object rv) {
        this.rf = rf;
        this.rc = rc;
        this.rv = rv;
    }

    public int getRf() {
        return rf;
    }

    public void setRf(int rf) {
        this.rf = rf;
    }

    public String getRc() {
        return rc;
    }

    public void setRc(String rc) {
        this.rc = rc;
    }

    public Object getRv() {
        return rv;
    }

    public void setRv(Object rv) {
        this.rv = rv;
    }

}
