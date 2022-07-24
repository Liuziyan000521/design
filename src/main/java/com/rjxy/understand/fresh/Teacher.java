package com.rjxy.understand.fresh;

import com.rjxy.understand.old.Student;

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
    private static List<com.rjxy.understand.old.Student> studentList;

    public Teacher() {
    }

    public Teacher(String name, String clazz) {
        this.name = name;
        this.clazz = clazz;
    }

    static {
        studentList = new ArrayList<com.rjxy.understand.old.Student>() {{
            add(new com.rjxy.understand.old.Student("花花", 10, 589));
            add(new com.rjxy.understand.old.Student("豆豆", 12, 509));
            add(new com.rjxy.understand.old.Student("猫猫", 14, 129));
            add(new com.rjxy.understand.old.Student("皮皮", 19, 549));
            add(new com.rjxy.understand.old.Student("毛毛", 12, 389));
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

    public double clazzTotalScore() {
        double totalScore = 0;
        for (Student student : studentList) {
            totalScore += student.getGrade();
        }
        return totalScore;
    }

    public int clazzStudentCount() {
        return studentList.size();
    }

    public double clazzAverageScore() {
        return clazzTotalScore() / clazzStudentCount();
    }
}
