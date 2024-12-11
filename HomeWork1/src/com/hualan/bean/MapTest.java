package com.hualan.bean;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Tom", 20, 98, "class05"));
        list.add(new Student("Jerry", 19, 70, "class04"));
        list.add(new Student("Owen", 22, 90, "class05"));
        list.add(new Student("Jim", 20, 80, "class05"));
        list.add(new Student("Steve", 21, 66, "class06"));
        list.add(new Student("Kevin", 22, 95, "class04"));
        System.out.print("所有学生的平均年龄为：");
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println(df.format(list.stream().mapToInt(Student::getAge).average().getAsDouble()));
        System.out.println("=======================================");
        System.out.println("计算各个班级的平均成绩");
        Map<String, List> map = new HashMap<>();
        for (Student student : list) {
            if (!map.containsKey(student.getClassName())) {
                List<Student> list1 = new ArrayList<>();
                list1.add(student);
                map.put(student.getClassName(), list1);
            } else {
                map.get(student.getClassName()).add(student);
            }
        }
        for (String key : map.keySet()) {
            double sum = 0;
            List<Student> list2 = map.get(key);
            for (Student student : list2) {
                sum += student.getScore();
            }
            System.out.println(key + "班的平均成绩为：" + df.format(sum / list2.size()));
        }
    }
}
