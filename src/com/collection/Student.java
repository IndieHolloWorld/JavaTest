package com.collection;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * 学生类
 */
public class Student implements Comparable<Student>{
    private String id;
    private String name;
    private Set courses;

    @Override
    public int compareTo(Student o) {
        return this.id.compareTo(o.id);
    }

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
        this.courses = new HashSet();
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

    public Set getCourses() {
        return courses;
    }

    public void setCourses(Set courses) {
        this.courses = courses;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name);
    }


}
