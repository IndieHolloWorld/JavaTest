package com.interf;

public class Smartphone extends Phone implements IGame{
    @Override
    public void call() {
        System.out.println("智能手机打电话");
    }

    @Override
    public void playGame() {
        System.out.println("智能手机玩游戏");
    }
}
