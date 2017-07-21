package org.chaoxuan.zeus.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2017/7/11 0011.
 */
public class DateUtil {
   public static Date transStr2Date(String str) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS Z");
        Date d = null;
        try {
            d = format.parse(str.replace("Z", " UTC"));//注意是空格+UTC

        } catch (ParseException e) {
            e.printStackTrace();
        }
        return d;
    }
}