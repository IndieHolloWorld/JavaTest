package com.collection;


import java.util.*;

public class MapTest {
    public Map<String, Student> students;

    public MapTest() {
        this.students = new HashMap<>();
    }

    /**
     * 测试添加：输入学生ID，判断是否被占用
     * 若未被占用，则输入姓名，创建新对象，并添加
     */
    public void testPut() {
        //创建一个Scanner对象，用来获取学生的ID和姓名
        Scanner console = new Scanner(System.in);
        int i = 0;
        while (i < 3) {
            System.out.println("请输入学生ID：");
            String ID = console.next();
            //判断ID是否被占用
            if (students.get(ID) == null) {
                System.out.println("请输入学生姓名：");
                String name = console.next();
                Student newStudent = new Student(ID, name);
                students.put(ID, newStudent);
                System.out.println("成功添加学生：" + students.get(ID).getName());
            } else {
                System.out.println("学生ID已存在！");
            }
            i++;
        }
    }

    /**
     * 通过KeySet方法遍历Map中所有Entry
     */
    public void testKeySet() {
        Set<String> set = students.keySet();
        System.out.println("以下为Map中所有元素：");
        for (String s : set) {
            Student stu = students.get(s);
            System.out.println(stu.getId() + '.' + stu.getName());
        }
    }

    /**
     * 通过values方法返回Map中所有value的集合
     */
    public void testValues() {
        ArrayList<Student> arrayList = (ArrayList<Student>) students.values();
        System.out.println("以下为Map中所有Value的值：");
        for (Student s : arrayList) {
            System.out.println(s.getId() + '.' + s.getName());
        }
    }

    /**
     * 通过entrySet来遍历Map
     */
    public void testEntrySet() {
        Set<Map.Entry<String, Student>> hs = students.entrySet();
        System.out.println("以下是通过entrySet遍历的Map：");
        for (Map.Entry<String, Student> entry : hs) {
            Student s = entry.getValue();
            System.out.println(s.getId() + '.' + s.getName());
        }
    }


    /**
     * 通过remove方法删除元素
     */
    public void testDelete() {
        Student s = students.remove("1");
        if (s != null) {
            System.out.println("成功删除：" + s.getId() + '.' + s.getName());
        } else {
            System.out.println("删除失败！");
        }
    }

    /**
     * 通过put修改Map元素
     */
    public void testPutModify() {
        Scanner console = new Scanner(System.in);
        while (true) {
            System.out.println("请输入您要修改的元素的ID");
            String ID = console.next();
            Student s = students.get(ID);
            if (s != null) {
                System.out.println("您要修改的同学为：" + s.getId() + '.' + s.getName());
                System.out.println("请输入修改后的姓名：");
                String name = console.next();
                if (students.put(ID, new Student(ID, name)) != null) {
                    System.out.println("修改成功！");
                } else {
                    System.out.println("修改失败！");
                }
                break;
            } else {
                System.out.println("您输入的ID不存在，请重新输入");
            }
        }

    }


    /**
     * 判断Map中是否包含某个Key值或者Value值
     */
    public void testContainsKeyOrValue() {
        String ID = "1";
        String name = "Derry";
        if (students.containsKey(ID)) {
            System.out.println("根据ID查到了：" + ID + '.' + students.get(ID).getName());
        } else {
            System.out.println("根据ID查不到！");
        }

        if (students.containsValue(new Student(null, "1"))) {
            System.out.println("根据name查到了!");
        } else {
            System.out.println("根据name查不到！");
        }
    }

    public static void main(String[] args) {
        MapTest mp = new MapTest();
        mp.testPut();
//        mp.testDelete();
//        mp.testKeySet();
//        mp.testPutModify();
//        mp.testEntrySet();
        mp.testContainsKeyOrValue();
    }

}
