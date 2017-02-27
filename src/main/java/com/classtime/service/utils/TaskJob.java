package com.classtime.service.utils;

import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by Administrator on 2017/2/24.
 */
@Service
public class TaskJob {

    public void job1() {
        System.out.println("begin001-search-====="+ DateUtils.formatDate(new Date(), "HH:mm:ss SSS"));
        System.out.println("tasking......");
    }

}
