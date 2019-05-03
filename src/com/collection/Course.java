package com.collection;

import java.util.Objects;

/**
 * 课程类
 */
public class Course {
    private String id;
    private String name;

    public Course() {

    }

    public Course(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        //如果这个这两对象内存地址相同，成立！
        if (this == obj)
            return true;
        //如果来者为空，不成立！
        if (obj == null)
            return false;
        //如果来者不是Course的实例，不成立！
        if (!(obj instanceof Course))
            return false;
        //可以确定这个obj是自家人，所以可以强制转换
        Course course = (Course) obj;
        if (this.name == null) {
            //如果两个对象的name值都为空，成立！否则不成立！
            if (course.name == null)
                return true;
            else
                return false;
        } else {
            //如果两个对象的name都不为空，并且值都相同，成立！
            //PS:这里的name是String类型的，而String类重写了equals方法
            //   所以这里用equals可以直接比较两个String的值
            if (this.name.equals(course.name))
                return true;
            else
                return false;
        }

    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
