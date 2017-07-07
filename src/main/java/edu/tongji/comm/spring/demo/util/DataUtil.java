package edu.tongji.comm.spring.demo.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by chen on 2017/7/7.
 */
public class DataUtil {

    public static String getTime() {
        Date now = new Date( );
        SimpleDateFormat ft = new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");

        return ft.format(now);
    }

}
