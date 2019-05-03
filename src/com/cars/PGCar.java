package com.cars;

public class PGCar extends Car{
    public int peopleNum = 0;
    public int goodsNum = 0;

    public PGCar(int price, String name,int peopleNum, int goodsNum) {
        super(price,name);
        this.peopleNum = peopleNum;
        this.goodsNum = goodsNum;
    }

    @Override
    public String toString() {
        return "皮卡{" +
                "载客=" + peopleNum +
                ", 载重=" + goodsNum +
                ", 价格=" + price +
                ", 款型='" + name + '\'' +
                '}';
    }
}
