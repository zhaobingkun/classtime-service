package com.classtime.service.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by Administrator on 2016/6/13.
 */

public class WeekDayUtil {

    /**
     * 输入一个日期的时间段，以及相应的星期数，获得这些星期的日期
     */
    private static Map weekNumberMap = new HashMap();
    static {
        weekNumberMap.put(0,1);
        weekNumberMap.put(1,2);
        weekNumberMap.put(2,3);
        weekNumberMap.put(3,4);
        weekNumberMap.put(4,5);
        weekNumberMap.put(5,6);
        weekNumberMap.put(6,7);
    }


    public static List getDates(String dateFrom, String dateEnd, List weekDays,int num) {
        long time;
        long perDayMilSec = 24L * 60 * 60 * 1000;
        List dateList = new ArrayList();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        // 需要查询的星期系数
        String strWeekNumber = weekForNum(weekDays);
      //  System.out.println("strWeekNumber="+strWeekNumber);
        try {
            dateFrom = sdf.format(sdf.parse(dateFrom).getTime() - perDayMilSec);
            int i=0;
            while (i<num) {
                time = sdf.parse(dateFrom).getTime();
                time = time + perDayMilSec;
                Date date = new Date(time);
                dateFrom = sdf.format(date);

                System.out.println("dateFrom="+dateFrom);

               // if (dateFrom.compareTo(dateEnd) <= 0) {
                    // 查询的某一时间的星期系数
                    Integer weekDay = dayForWeek(date);
                    // 判断当期日期的星期系数是否是需要查询的
                    if (strWeekNumber.contains(weekDay.toString())) {
                        dateList.add(dateFrom);
                        i++;
                    }
               // } else {
               //     break;
               // }


            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return dateList;
    }


    // 等到当期时间的周系数。星期日：1，星期一：2，星期二：3，星期三：4，星期四：5，星期五：6，星期六：7
    public static Integer dayForWeek(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.DAY_OF_WEEK);
    }


    /**
     * 得到对应星期的系数 0：1，星期
     */
    public static String weekForNum(List weekDays) {
// 返回结果为组合的星期系数
        String weekNumber = "";

        for(int i=0;i<weekDays.size();i++){
            int weekDay = (Integer)weekDays.get(i);
            weekNumber = weekNumber + "" + getWeekNum(weekDay).toString();
           // System.out.println(weekNumber);
        }



       for (Object weekDay : weekDays) {
            weekNumber = weekNumber + "" + getWeekNum((Integer)weekDay).toString();
            //System.out.println(weekNumber);
        }

      //  System.out.println(weekNumber);
        return weekNumber;


    }


    // 将星期转换为对应的系数 0,星期日; 1,星期一; 2....
    public static Integer getWeekNum(int strWeek) {
        //System.out.println("getWeekNum=" + (Integer) weekNumberMap.get(strWeek));
        return (Integer)weekNumberMap.get(strWeek);
    }


    public static void main(String[] args) {



       // String str = "http://www.e-picclife.com/ECPL/onlineShop/online_trip.jsp";

       // String regEx = "^http://www.e-picclife.com/ECPL/onlineShop/.*$";
     /*   String str = "http://www.e-picclife.com/ECPL/onlineShop/online_trip.pdf";
        String regEx= "^.*?\\.(zip|doc|docx|pdf)$";

        // 编译正则表达式
        Pattern pattern = Pattern.compile(regEx);
        // 忽略大小写的写法
        Pattern pat = Pattern.compile(regEx, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pat.matcher(str);
        // 字符串是否与正则表达式相匹配
        boolean rs = matcher.matches();
        System.out.println(rs);
*/

        //输出从2015-01-01到2015-01-21之间的所有星期一和星期二的日期。

        List daysOfOneWeek = new ArrayList();
        daysOfOneWeek.add(6);  //周六
        daysOfOneWeek.add(0);  //周日

        List daysNeedBookList = getDates("2016-01-01", "2016-07-21", daysOfOneWeek,48);

        for(int i=0;i<daysNeedBookList.size();i++){
            String s=daysNeedBookList.get(i).toString();
            System.out.println(s);
        }



        //System.out.println(MD5.sign("115.28.222.93", "qicheyitiao20160707", ""));

       /* Random ran=new Random();
        String tmpRan ="2";// ran.nextInt(9999)+"";

        System.out.println("tmpRan="+tmpRan);
        System.out.println("tmpRan.length()="+tmpRan.length());
        String snoRan=tmpRan;
        if(tmpRan.length()<4){
            for(int i=0;i<(4-tmpRan.length());i++){
                tmpRan = "0"+tmpRan;
            }
        }

        System.out.println("tmpRan="+tmpRan);*/

    }
}
