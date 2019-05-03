package com.collection;


import java.util.*;

/**
 * 使用Collections的sort()方法对各种泛型进行排序
 */
public class CollectionsTest {
    /**
     * 用sort()对Integer泛型List进行排序
     */
    public void testIntegerSort() {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(100));
        }
        System.out.println("--------排序前--------");
        for (Integer i : list) {
            System.out.print(i.toString() + " ");
        }
        System.out.println();
        System.out.println("--------排序后--------");
        Collections.sort(list);
        for (Integer i : list) {
            System.out.print(i.toString() + " ");
        }
        System.out.println();
    }

    /**
     * 用sort()对String泛型List进行排序
     */
    public void testStringSort() {
        List<String> list = new ArrayList<>();
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("a");
        Iterator it = list.iterator();
        System.out.println("--------排序前--------");
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        Collections.sort(list);
        it = list.iterator();
        System.out.println("--------排序后--------");
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

    }

    /**
     * 用sort对Student泛型进行排序
     */

    public void testStudentSort() {
        List<Student> list = new ArrayList<>();
        list.add(new Student("3", "Sam"));
        list.add(new Student("2", "Amy"));
        list.add(new Student("1", "Lucy"));
        System.out.println("--------排序前--------");
        for (Student student : list) {
            System.out.println(student.getId() + " " + student.getName());
        }
        Collections.sort(list);
        System.out.println("--------排序后--------");
        for (Student student : list) {
            System.out.println(student.getId() + " " + student.getName());
        }
        Collections.sort(list, new StudentComparator());
        System.out.println("--------按照姓名排序后--------");
        for (Student student : list) {
            System.out.println(student.getId() + " " + student.getName());
        }

    }

    public static void main(String[] args) {
        CollectionsTest ct = new CollectionsTest();
//        ct.testIntegerSort();
//        ct.testStringSort();
        ct.testStudentSort();
    }
}
