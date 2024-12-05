package com.hualan.main;

import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入两个字符串：");
        String str = sc.nextLine();
        String str2 = sc.nextLine();
        if (str.length() != str2.length()) {
            System.out.println("字符串长度不等");
        } else {
            System.out.println("字符串长度相等");
        }
        if (str.equals(str2)) {
            System.out.println("字符串相等");
        } else {
            System.out.println("字符串不相等");
        }
        if (str.equalsIgnoreCase(str2)) {
            System.out.println("忽略大小写字符串相等");
        } else {
            System.out.println("忽略大小写字符串不相等");
        }
        if (str.contains(str2)) {
            System.out.println("字符串包含");
        } else {
            System.out.println("字符串不包含");
        }
        if (str.charAt(2) == (str2.charAt(2))) {
            System.out.println("字符串第三个字符相等");
        } else {
            System.out.println("字符串第三个字符不相等");
        }
        if (str.compareToIgnoreCase(str2) < 0) {
            System.out.println(str2 + "大");
        } else if (str.compareToIgnoreCase(str2) > 0) {
            System.out.println(str + "大");
        } else System.out.println("字符串相等");
        System.out.println("==========================");
        System.out.print("请输入一个字符串：");
        String str3 = sc.nextLine();
        System.out.println("转换为大写后为：" + str3.toUpperCase());

    }
}
