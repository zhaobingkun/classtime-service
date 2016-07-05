package com.classtime.service.model;

public class Pictemplate extends BaseObject {
    private static final long serialVersionUID = 7970244214434225448L;
    private Long id;

    private Long category;

    private String url;

    private Integer size;

    private String summary;

    private Integer type;

    private Long parentid;

    private String oldfilename;

    private String newfilename;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCategory() {
        return category;
    }

    public void setCategory(Long category) {
        this.category = category;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary == null ? null : summary.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Long getParentid() {
        return parentid;
    }

    public void setParentid(Long parentid) {
        this.parentid = parentid;
    }

    public String getOldfilename() {
        return oldfilename;
    }

    public void setOldfilename(String oldfilename) {
        this.oldfilename = oldfilename == null ? null : oldfilename.trim();
    }

    public String getNewfilename() {
        return newfilename;
    }

    public void setNewfilename(String newfilename) {
        this.newfilename = newfilename == null ? null : newfilename.trim();
    }
}