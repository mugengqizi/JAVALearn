package com.hualan.main;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/*
 在StudentsTest类的main方法里判断工程目录里是否存在 `studentList.dat` 文件，如果存在这个文件，读取文件中的所有数据，并输出到控制台，如果没有这个文件，创建这个文件，另外创建一个List，存放自己以及自己的前后左右同学，并把List写入到 `studentList.dat` 文件中去。
 */
public class StudentsTest {
    public static void main(String[] args) throws Exception {
        String path = "_12-19/studentList.dat";
        File file = new File(path);
        if (file.exists()) {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            List<Student> list = (List<Student>) ois.readObject();
            for (Student student : list) {
                System.out.println(student);
            }
        } else {
            System.out.println("文件不存在");
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            List<Student> list = new ArrayList<>();
            List<String> bobby1 = new ArrayList<>();
            bobby1.add("篮球");
            bobby1.add("乒乓球");
            bobby1.add("羽毛球");
            Student student1 = new Student("林忠", "男", 20, 1.80, new Birthday(1924, 2, 29), bobby1);
            List<String> bobby2 = new ArrayList<>();
            bobby2.add("无畏契约");
            bobby2.add("原神");
            bobby2.add("崩坏3");
            Student student2 = new Student("马少鑫", "男", 20, 1.80, new Birthday(1924, 2, 29), bobby2);
            List<Student> list2 = new ArrayList<>();
            list2.add(student1);
            list2.add(student2);
            oos.writeObject(list2);
        }
    }
}
