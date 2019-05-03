package com.exception;

/**
 * 功能描述
 *test1()喝大了
 *test2()调用test1(),捕获“喝大了”异常，并且包装成运行时异常，继续抛出
 *main方法，调用test2()，尝试捕获test2()抛出的异常
 */
public class ChainTest {

    public static void main(String[] args) {
        ChainTest ct=new ChainTest();
        try {
            ct.test2();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void test1() throws DrunkException{
        throw new DrunkException("喝车别开酒！");
    }

    public void test2(){
        try {
            test1();
        } catch (DrunkException e) {
            RuntimeException newExc = new RuntimeException("司机一滴酒，亲人两行泪！");
            newExc.initCause(e);//newExc异常是因为e异常
            throw newExc;
        }
    }
}
