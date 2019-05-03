package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * 备选课程类
 */
public class ListTest {
    /**
     * 用于存放备选课程的List
     */
    private List coursesToSelect;

    public ListTest() {
        this.coursesToSelect = new ArrayList();
    }

    public List getCoursesToSelect() {
        return coursesToSelect;
    }

    public void setCoursesToSelect(List coursesToSelect) {
        this.coursesToSelect = coursesToSelect;
    }

    /***
     * 用于往coursesToSelect中添加备选课程
     */
    public void testAdd() {
        Course cr1 = new Course("1", "数据结构");
        coursesToSelect.add(cr1);
        Course temp = (Course) coursesToSelect.get(0);
        System.out.println("添加了课程：" + temp.getId() + "." + temp.getName());

        Course cr2 = new Course("2", "C语言");
        coursesToSelect.add(0, cr2);
        temp = (Course) coursesToSelect.get(0);
        System.out.println("添加了课程：" + temp.getId() + "." + temp.getName());

        //如果插入的位置大于其最大的长度，会出现数组下表越界
//        Course cr3 = new Course("3", "C语言");
//        coursesToSelect.add(4, cr3);
//        temp = (Course) coursesToSelect.get(0);
//        System.out.println("添加了课程：" + temp.getId() + "." + temp.getName());

        Course[] course = {new Course("3", "离散数学"), new Course("4", "汇编语言")};
        coursesToSelect.addAll(Arrays.asList(course));
        Course temp2 = (Course) coursesToSelect.get(2);
        Course temp3 = (Course) coursesToSelect.get(3);
        System.out.println("添加了两门课程：" + temp2.getId() + "." + temp2.getName() + "  " + temp3.getId() + "." + temp3.getName());

        Course[] course2 = {new Course("5", "高等数学"), new Course("6", "大学英语")};
        coursesToSelect.addAll(2, Arrays.asList(course2));
        Course temp4 = (Course) coursesToSelect.get(2);
        Course temp5 = (Course) coursesToSelect.get(3);
        System.out.println("添加了两门课程：" + temp4.getId() + "." + temp4.getName() + "  " + temp5.getId() + "." + temp5.getName());
    }


    /**
     * 取得List中的元素方法
     */
    public void testGet() {
        int size = coursesToSelect.size();
        System.out.println("有如下课程可选：");
        for (int i = 0; i < size; i++) {
            Course cr = (Course) coursesToSelect.get(i);
            System.out.println("课程：" + cr.getId() + '.' + cr.getName());
        }
    }

    /**
     * 通过迭代器获取List元素
     */
    public void testIterator() {
        Iterator it = coursesToSelect.iterator();
        System.out.println("有如下课程可选（通过迭代器）：");
        while (it.hasNext()) {
            Course cr = (Course) it.next();
            System.out.println("课程：" + cr.getId() + '.' + cr.getName());

        }
    }

    /**
     * 通过for each方法获取List元素
     */
    public void testForeach() {
        System.out.println("有如下课程可选（通过for each）：");
        for (Object o : coursesToSelect) {
            Course cr = (Course) o;
            System.out.println("课程：" + cr.getId() + '.' + cr.getName());

        }
    }

    /**
     * 修改List中的元素
     */
    public void testModify() {
        coursesToSelect.set(3, new Course("6", "操作系统"));
    }

    /**
     * 删除List中的元素
     */
    public void testDelete() {
        coursesToSelect.remove(3);
    }


    /**
     * 向List里面添加一些奇怪的东西
     */
    public void testType() {
        System.out.println("添加一些奇怪的东西");
        coursesToSelect.add("666");
    }

    /**
     * 测试List的contains
     */
    public void testContains() {
//        Course course = (Course) coursesToSelect.get(0);
        Course course = new Course("1", "数据结构");
        System.out.println("备选课程中是否包含：" + course.getName());
        if (coursesToSelect.contains(course)) {
            System.out.println("备选课程中包含：" + course.getName());
            System.out.println("索引位置：" + coursesToSelect.indexOf(course));
        } else {
            System.out.println("备选课程中不包含：" + course.getName());
        }


    }

    public static void main(String[] args) {
        ListTest lt = new ListTest();
        lt.testAdd();
        lt.testContains();
//        lt.testType();

//        lt.testGet();
//        lt.testIterator();
//        lt.testForeach();
//        lt.testModify();

//        lt.testForeach();
//        lt.testDelete();
//        lt.testForeach();

    }
}
