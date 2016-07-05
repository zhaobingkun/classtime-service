package com.classtime.service.beans;

/**
 * 网站类别枚举类
 * <p/>
 * //categroy 1：地区，2：活动：3：负责人：4：酒店，5：交通：
 * 6：活动扩展：7：酒店扩展：21：行程; 31:tag;
 */
public enum CateBean {
    AREA(1l), ACTIVITY(2l), ASSISTANCE(3l), HOTEL(4l), TRANSFER(5l),
    ACTIVITY_EXTRA(6l), HOTEL_EXTRA(7l), PLAN(21l), TAG(31l);

    Long cateid;

    CateBean(Long cateid) {
        this.cateid = cateid;
    }

    public Long getCateid() {
        return cateid;
    }

}
