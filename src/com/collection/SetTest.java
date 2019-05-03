package com.collection;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
    //创建备选课程哈希集
    public Set<Course> courses = new HashSet<>();

    public Course cr1 = new Course("1", "数据结构");

    /**
     * 添加课程
     */
    public void testAdd() {
        courses.add(cr1);
        Course cr2 = new Course("2", "操作系统");
        courses.add(cr2);
    }

    /**
     * 删除课程
     */
    public void testDelete() {

        if (courses.remove(cr1)) {
            System.out.println("删除成功");
        } else {
            System.out.println("删除失败");
        }
    }


    /**
     * 遍历备选课程哈希集
     */
    public void testForeach() {
        System.out.println("可选的课程有：");
        for (Course c : courses) {
            System.out.println(c.getId() + '.' + c.getName());
        }
    }

    /**
     * 测试使用Set的contains判断元素是否存在
     */
    public void testContains() {
        Course c = new Course("2", "操作系统");
        if (courses.contains(c)) {
            System.out.println("包含！");
        } else {
            System.out.println("不包含！");
        }
    }

    public static void main(String[] args) {
        SetTest st = new SetTest();
        st.testAdd();
        st.testDelete();
        st.testForeach();
        st.testContains();
    }
}
