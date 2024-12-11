package com.hualan.main;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Tom", "CoreJava");
        map.put("Jone", "Oracle");
        map.put("Susan", "Oracle");
        map.put("Jerry", "JDBC");
        map.put("Jim", "Unix");
        map.put("Kevin", "JSP");
        map.put("Lucy", "JSP");
        System.out.println(map);
        System.out.println("=====================================");
        System.out.println("增加Allen教JDBC");
        map.put("Allen", "JDBC");
        System.out.println(map);
        System.out.println("=====================================");
        System.out.println(" Lucy 改为教 CoreJava");
        map.replace("Lucy", "CoreJava");
        System.out.println(map);
        System.out.println("=====================================");
        for (String key : map.keySet()) {
            System.out.println(key + "老师教的课为：" + map.get(key));
        }
        System.out.println("=====================================");
        System.out.println("输出所有授课课程是JSP的老师");
        for (String key2 : map.keySet()) {
            if (map.get(key2).equals("JSP")) {
                System.out.println(key2 + " ");
            }
        }
    }
}
