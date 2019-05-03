package com.collection;

import java.util.ArrayList;
import java.util.List;

public class TestGeneric {
    //规定courses里面只能存放Course类型的对象
    public List<Course> courses;

    public TestGeneric() {
        this.courses = new ArrayList<>();
    }

    /**
     * 测试添加元素
     */
    public void testAdd() {
        Course cr1 = new Course("1", "数据结构");
        courses.add(cr1);
    }

    /**
     * 通过迭代器获取List元素
     */
    public void testForeach() {
        System.out.println("有如下课程可选（通过for each）：");
        for (Course cr : courses) {
            System.out.println("课程：" + cr.getId() + '.' + cr.getName());
        }
    }

    /**
     * 泛型集合可以添加泛型子类型的对象实例
     */
    public void testChild() {
        ChildCourse ccr = new ChildCourse();
        ccr.setId("2");
        ccr.setName("操作系统");
        courses.add(ccr);
    }

    /**
     * 泛型不可以是基本类型，但可以是其包装类
     */
    public void testBasicType() {
        List<Integer> list = new ArrayList<>();
        list.add(666);
        System.out.println(list.get(0));
    }

    public static void main(String[] args) {
        TestGeneric tg = new TestGeneric();
        tg.testAdd();
        tg.testChild();
        tg.testForeach();

        tg.testBasicType();
    }
}
