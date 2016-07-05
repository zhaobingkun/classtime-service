package com.classtime.service.model;

import java.util.List;

public class Area extends BaseObject {


    private static final long serialVersionUID = 2998704000118886250L;
    private Long id;

    private Long parentid;

    private String name;

    private String enname;

    private String areadesc;

    private List<Area> listArea;
    private Float longitude;
    private Float latitude;
    private String details;

    private String ext1;
    private String ext2;

    private String letter;
    private Long asid;

    private Long currency;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getParentid() {
        return parentid;
    }

    public void setParentid(Long parentid) {
        this.parentid = parentid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getEnname() {
        return enname;
    }

    public void setEnname(String enname) {
        this.enname = enname == null ? null : enname.trim();
    }

    public String getAreadesc() {
        return areadesc;
    }

    public void setAreadesc(String areadesc) {
        this.areadesc = areadesc;
    }

    public List<Area> getListArea() {
        return listArea;
    }

    public void setListArea(List<Area> listArea) {
        this.listArea = listArea;
    }

    public Float getLongitude() {
        return longitude;
    }

    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

    public Float getLatitude() {
        return latitude;
    }

    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    public String getExt1() {
        return ext1;
    }

    public void setExt1(String ext1) {
        this.ext1 = ext1;
    }

    public String getExt2() {
        return ext2;
    }

    public void setExt2(String ext2) {
        this.ext2 = ext2;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getLetter() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }

    public Long getAsid() {
        return asid;
    }

    public void setAsid(Long asid) {
        this.asid = asid;
    }

    public Long getCurrency() {
        return currency;
    }

    public void setCurrency(Long currency) {
        this.currency = currency;
    }
}