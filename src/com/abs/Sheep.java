package com.abs;


public class Sheep extends Animal{
    @Override
    public void eat() {
        System.out.println("羊在吃草");
    }

    @Override
    public void drink() {
        System.out.println("羊在喝水");
    }
}
