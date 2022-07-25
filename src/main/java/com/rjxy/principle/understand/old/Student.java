package com.rjxy.principle.understand.old;

/**
 * @Description Student
 * @Author 蜻蜓队长
 * @Date 2022/7/24 21:51
 * @Version 0.1
 */
public class Student {
    private String name;
    private int rank;

    private double grade;

    public Student() {

    }

    public Student(String name, int rank, double grade) {
        this.name = name;
        this.rank = rank;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getRank() {
        return rank;
    }

    public double getGrade() {
        return grade;
    }
}
