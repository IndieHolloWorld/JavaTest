package com.interf;

public class Test {


    public static void main(String[] args) {
        IGame iGame1 = new Telephone();
        IGame iGame2 = new Smartphone();
        IGame iGame3 = new PSP();
        iGame1.playGame();
        iGame2.playGame();
        iGame3.playGame();

        IGame iGame = new IGame() {
            @Override
            public void playGame() {
                System.out.println("使用匿名内部类实现接口");
            }
        };
        iGame.playGame();

        new IGame() {
            @Override
            public void playGame() {
                System.out.println("匿名内部类直接实现接口");
            }
        }.playGame();
    }
}
