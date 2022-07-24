package com.rjxy.copy;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.lang3.SerializationUtils;

import java.io.*;

/**
 * @Description CopyTest
 * @Author 蜻蜓队长
 * @Date 2022/7/24 0:23
 * @Version 0.1
 */
public class CopyTest {
    public static void main(String[] args) throws Exception {
        Teacher teacher = new Teacher("李四老师");
        Student student = new Student("张三", 12, teacher);
        Student cloneStudent = student.deepClone3();
        System.out.println(student);
        System.out.println(cloneStudent);

        teacher.setName("王五老师");
        System.out.println("=========修改老师信息后=========");
        System.out.println(student);
        System.out.println(cloneStudent);
    }
}

class Teacher implements Serializable {
    private String name;

    public Teacher() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                '}';
    }

}

class Student implements Serializable {
    private String name;
    private Integer id;
    private Teacher teacher;

    public Student() {
    }

    public Student(String name, Integer id, Teacher teacher) {
        this.name = name;
        this.id = id;
        this.teacher = teacher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Object deepClone() throws Exception {
        // 序列化
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);

        // 反序列化
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();
    }

    public Student deepClone2() {
        return SerializationUtils.clone(this);
    }

    public Student deepClone3() throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(objectMapper.writeValueAsString(this), Student.class);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", teacher=" + teacher +
                '}';
    }
}
