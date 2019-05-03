package com.date;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest {
    public static void main(String[] args) {
        //获取Calendar对象
        Calendar c = Calendar.getInstance();
        //Calendar类转化为Date类
        Date date = c.getTime();
        //获取毫秒数
        long time = c.getTimeInMillis();
        System.out.println("当前时间：" + date);
        System.out.println("时间毫秒数：" + time);
    }
}
