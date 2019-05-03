package com.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        //创建Date对象，表示当前时间
        Date d = new Date();
        //创建SimpleDateFormat对象，指定日期格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //调用format方法格式化Date对象
        String today = sdf.format(d);
        //调用parse方法将字符串转化为日期
        Date date = new Date();
        try {
            date = sdf.parse("2019-05-02 11:03:23");
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println(today);
        System.out.println(date);
    }
}
