package com.isa;

public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println(super.age);
        System.out.println("狗吃东西");
    }
//    public Sheep(String name){
//        super.name=name;
//    }

    @Override
    public boolean equals(Object obj) {
        //判断引用地址是否相同
        if (this == obj)
            return true;
        //判断他们是不是源于同一个类
        if (getClass() == obj.getClass())
            return true;
        //判断属性值是否相同
        Dog other = (Dog)obj;
        if(age==other.age)
            return true;
        return false;
    }
}
