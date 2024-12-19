package com.hualan.main;

import java.io.Serializable;
import java.util.List;

public class Student implements Serializable {
    private String name;
    private String sex;
    private int age;
    private double height;
    private Birthday birthday;
    private List<String> bobby;

    public Student(String name, String sex, int age, double height, Birthday birthday, List<String> bobby) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.height = height;
        this.birthday = birthday;
        this.bobby = bobby;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Birthday getBirthday() {
        return birthday;
    }

    public void setBirthday(Birthday birthday) {
        this.birthday = birthday;
    }

    public List<String> getBobby() {
        return bobby;
    }

    public void setBobby(List<String> bobby) {
        this.bobby = bobby;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", birthday=" + birthday +
                ", bobby=" + bobby +
                '}';
    }
}
