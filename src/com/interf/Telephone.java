package com.interf;

public class Telephone extends Phone implements IGame{
    @Override
    public void call() {
        System.out.println("智障手机打电话");
    }

    @Override
    public void playGame() {
        System.out.println("智障手机玩游戏");
    }
}
