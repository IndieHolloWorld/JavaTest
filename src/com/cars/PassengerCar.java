package com.cars;

public class PassengerCar extends Car{
    public int peopleNum = 0;

    public PassengerCar(int price,String name,int peopleNum) {
        super(price,name);
        this.peopleNum = peopleNum;
    }

    @Override
    public String toString() {
        return "客车{" +
                "载客=" + peopleNum +
                ", 价格=" + price +
                ", 款型='" + name + '\'' +
                '}';
    }
}
