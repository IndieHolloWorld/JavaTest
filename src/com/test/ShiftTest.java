package com.test;
import java.util.Arrays;

public class ShiftTest {
    public static String hex2Str(String hex) {
        StringBuilder sb = new StringBuilder();
        String[] split = hex.split(",");
        for (String str : split) {
            int i = Integer.parseInt(str, 16);
            sb.append((char)i);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(hex2Str("6a,71,eb"));
    }
}
