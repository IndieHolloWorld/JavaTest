package com.test;
import java.util.Scanner;
/**
 * 功能描述
 *
 * @param
 * @author Derry
 * @date $
 * @return $
 */
public class ScannerTest {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("请输入你的分数：");
        int  score = input.nextInt();
        System.out.println("加分前分数："+score);
        int count = 0;
        while(score<60){
            score++;
            count++;
        }
        System.out.println("加分后分数："+score);
        System.out.println("一共加了"+count+"次！");
    }
}
