package com.classtime.service.utils;

import com.classtime.service.manager.impl.ClassTimeChildManagerImpl;
import com.classtime.service.model.ClassTimeChild;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2017/2/24.
 */
@Service
public class TaskJob {

    public void job1() {
        System.out.println("begin001-search-====="+ DateUtils.formatDate(new Date(), "HH:mm:ss SSS"));
        System.out.println("tasking......");

        String checkDate=DateUtils.getDateAfter(1);

        System.out.print("checkDate===="+checkDate);
        ClassTimeChildManagerImpl classTimeChildManager = new ClassTimeChildManagerImpl();


        List<ClassTimeChild> classTimeMainList = classTimeChildManager.selectMobileByDay(checkDate);

        System.out.println(classTimeMainList.size());
    }

}
