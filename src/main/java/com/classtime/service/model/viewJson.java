package com.classtime.service.model;

import java.util.Date;
/**
 * Created by Administrator on 2016/12/13.
 */

public class viewJson {

    private  Date start;
    private Date end;
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





    public Object[][] getEvents() {
        return events;
    }

    public void setEvents(Object[][] events) {
        this.events = events;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }
}
