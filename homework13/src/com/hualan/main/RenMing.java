package com.hualan.main;

import java.util.Scanner;

public class RenMing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个字符串：");
        String str = sc.nextLine();
        System.out.print("请输入要查找的名字：");
        String str2 = sc.nextLine();
        if (str.contains(str2)) {
            System.out.println("班级里有" + str2);
        } else {
            System.out.println("班级里没有" + str2);
        }
    }
}
