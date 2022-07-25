package com.rjxy.principle.understand.old;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description Teacher
 * @Author 蜻蜓队长
 * @Date 2022/7/24 21:52
 * @Version 0.1
 */
public class Teacher {
    private String name;
    private String clazz;
    private static List<Student> studentList;

    public Teacher() {
    }

    public Teacher(String name, String clazz) {
        this.name = name;
        this.clazz = clazz;
    }

    static {
        studentList = new ArrayList<Student>() {{
            add(new Student("花花", 10, 589));
            add(new Student("豆豆", 12, 509));
            add(new Student("猫猫", 14, 129));
            add(new Student("皮皮", 19, 549));
            add(new Student("毛毛", 12, 389));
        }};
    }

    public String getName() {
        return name;
    }

    public String getClazz() {
        return clazz;
    }

    public static List<Student> getStudentList() {
        return studentList;
    }
}
