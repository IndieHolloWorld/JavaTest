package com.cars;

public class GoodsCar extends Car{
    public int goodsNum = 0;

    public GoodsCar( int price, String name,  int goodsNum) {
        super(price, name);
        this.goodsNum = goodsNum;
    }

    @Override
    public String toString() {
        return "货车{" +
                "载重=" + goodsNum +
                ", 价格=" + price +
                ", 款型='" + name + '\'' +
                '}';
    }
}
