package com.abs;


public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫在吃肉");
    }

    @Override
    public void drink() {
        System.out.println("猫在喝水");
    }
}
