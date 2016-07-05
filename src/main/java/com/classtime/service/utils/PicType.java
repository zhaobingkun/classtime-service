package com.classtime.service.utils;

/**
 * Created by Administrator on 2015/9/9.
 */
public enum PicType {
    //type标记：1：封面，2：地图，0：普通
    COVER(1),MAP(2),PIC(0);
    private int nCode;

     PicType(int _nCode) {
         this.nCode = _nCode;
    }

    public String toValue() {
        return String.valueOf(this.nCode);
    }

    public static void main(String[] args) {
        System.out.println(PicType.COVER.toValue());
        System.out.println(PicType.COVER);
    }

}
