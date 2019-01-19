package com.dbcoder.date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
* @Description:date测试类
* @author: bo.dong
* @Date: 2019-01-07 19:15:46
*/
public class DateTest {
    public static void main(String[] args) {
        Date date = new Date(1546860038000L);
        Date date1 = new Date();
        System.currentTimeMillis();
        Long l = date1.getTime() - date.getTime();
        Date dResult = new Date(l);
        System.out.println(longToDateString(l));
    }

    /**
     * @title date to string
     */
    public static String dateToString(Date date, String dateFormat) {
        String dateStr = null;
        try {
            dateStr = new SimpleDateFormat(dateFormat).format(date);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dateStr;
    }

    public static String longToDateString(Long diff){
        long days = diff / (1000 * 60 * 60 * 24);

        long hours = (diff-days*(1000 * 60 * 60 * 24))/(1000* 60 * 60);
        long minutes = (diff-days*(1000 * 60 * 60 * 24)-hours*(1000* 60 * 60))/(1000* 60);
        return ""+days+"d"+hours+"h"+minutes+"m";
    }
}
