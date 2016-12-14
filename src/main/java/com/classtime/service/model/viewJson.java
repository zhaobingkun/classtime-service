package com.classtime.service.model;

/**
 * Created by Administrator on 2016/12/13.
 */

public class viewJson {

    private  String start;
    private String end;
    private String error;
    private String  issort;
    private Object [][] events;



    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }



    public String getIssort() {
        return issort;
    }

    public void setIssort(String issort) {
        this.issort = issort;
    }


    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }


    public Object[][] getEvents() {
        return events;
    }

    public void setEvents(Object[][] events) {
        this.events = events;
    }
}
