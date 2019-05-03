package com.string;

public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Derry");
        str.append(" 你好！");
        str.append(666);
        System.out.println("字符串长度：" + str.length());

        System.out.println("插入前：" + str);

        str.insert(9, "评价：");
        String s = str.toString();
        System.out.println("插入后：" + s);
    }
}
