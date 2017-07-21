package org.chaoxuan.zeus.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Yurnero
 * @data 2017/6/27
 * @description 日历工具类
 */
public class CalendarUtil {
    public static Integer getDay(Integer year, Integer month) {

        // 年换算天数
        int yearsum = 0;
        for (int i = 1900; i < year; i++) {
            if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) yearsum += 366;
            else yearsum += 365;
        }

        // 月换算天数
        int monthsum = 0;
        for (int m = 1; m < month; m++) {
            monthsum += CalendarUtil.getDaysByMonth(year, m);
        }

        // 判断这一天是周几, day 为 0 则周日
        return (yearsum + monthsum + 1) % 7;
    }

    public static int getDaysByMonth(Integer year, Integer month) {
        // 判断是否是闰年
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);

        int monthdays;
        switch (month) {
            case 2:
                monthdays = isLeapYear ? 29 : 28;
                break;
            case 4:
                monthdays = 30;
                break;
            case 6:
                monthdays = 30;
                break;
            case 9:
                monthdays = 30;
                break;
            case 11:
                monthdays = 30;
                break;
            default:
                monthdays = 31;
                break;
        }
        return monthdays;
    }

    public static String format(String pattern, Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.format(date);
    }

    public static Date parse(String pattern, String date) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.parse(date);
    }
}
