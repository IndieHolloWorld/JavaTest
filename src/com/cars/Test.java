package com.cars;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        //初始化租车系统

        Car audiA4 = new PassengerCar(500, "奥迪A4", 4);
        Car mazda6 = new PassengerCar(400, "马自达6", 4);
        Car kingLong = new PassengerCar(800, "金龙", 20);
        Car songHua = new GoodsCar(400, "松花江", 4);
        Car iveco = new GoodsCar(1000, "依维柯", 20);
        Car snow = new PGCar(450, "皮卡雪", 4, 2);
        Car[] cars = {audiA4, mazda6, kingLong, songHua, iveco, snow};
        //租车流程
        System.out.println("***欢迎来到嘟嘟租车系统！***");
        Scanner input = new Scanner(System.in);
        System.out.println("您确定要租车吗？（1：yes；0：no）");
        int check = input.nextInt();
        if (check == 1) {
            System.out.println("您可以租车的类型及其价目表：");
            for (int i = 1; i <= cars.length; i++) {
                System.out.print(i + ".  ");
                System.out.println(cars[i-1]);
            }
            System.out.println("请输入您需要的款型序号：");
            int kind = input.nextInt();
            System.out.println("您输入的款型是：" + cars[kind - 1]);
            System.out.println("请输入您需要租车的辆数：");
            int nums = input.nextInt();
            System.out.println("请输入您需要租车的天数：");
            int days = input.nextInt();
            System.out.println("租车总价：" + cars[kind - 1].price * nums * days);
            System.out.println("欢迎下次再来！");
        } else {
            System.out.println("欢迎下次再来！");
        }
    }
}
