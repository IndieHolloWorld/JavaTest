package com.string;

import java.util.Arrays;

public class StringTest {
    public static void main(String[] args) {
        String words = "你好 我的名字叫 代乾瑞 Derry";
        //打印字符串长度
        System.out.println("字符串长度：" + words.length());
        //查找“乾”的位置
        System.out.println("字符‘乾’的位置：" + words.indexOf('乾'));
        //查找“代乾瑞”的位置
        System.out.println("字符串“代乾瑞”的位置：" + words.indexOf("代乾瑞"));
        //查找“Derry”的位置
        System.out.println("字符串“Derry”的位置：" + words.indexOf("Derry"));
        //用空格把字符串拆分成字符串数组
        System.out.println("用空格拆分字符串：" + Arrays.toString(words.split(" ")));
        //截[9,12)之间的子串
        System.out.println("获取[9,12)之间的子串：" + words.substring(9, 12));
        //将字符串转化成小写
        System.out.println("转化为小写：" + words.toLowerCase());
        //获取索引为1的字符串
        System.out.println("获取索引为1的字符串："+words.charAt(1));
    }
}
