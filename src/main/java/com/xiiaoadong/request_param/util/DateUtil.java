package com.xiiaoadong.request_param.util;

import org.apache.commons.lang3.time.FastDateFormat;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {

    public static SimpleDateFormat S_STANDARD_DATEFORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static SimpleDateFormat S_DAY_DATEFORMAT = new SimpleDateFormat("yyyy-MM-dd");

    public static FastDateFormat STANDARD_DATEFORMAT = FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss");

    public static FastDateFormat DAY_DATEFORMAT = FastDateFormat.getInstance("yyyy-MM-dd");

    public static FastDateFormat MONTH_DATEFORMAT = FastDateFormat.getInstance("yyyy-MM");

    public static FastDateFormat YEAR_DATEFORMAT = FastDateFormat.getInstance("yyyy");


    public static Calendar getTodayCalendar() {
        Calendar c = Calendar.getInstance();
        System.out.println();
        c.setTime(new Date());
        c.set(Calendar.HOUR_OF_DAY,0);
//        c.set(Calendar.HOUR,0);
        c.set(Calendar.MINUTE,0);
        c.set(Calendar.SECOND,0);
        return c;
    }

}
