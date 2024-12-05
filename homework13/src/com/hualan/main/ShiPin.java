package com.hualan.main;

import java.util.Scanner;

public class ShiPin {
    public static void main(String[] args) {
        System.out.print("请输入一个文件名：");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] str2 = {".avi", ".mp4", ".mpg", ".mpeg", ".wmv", ".mov", ".rmvb", ".swf", ".flv", ".ram" };
        boolean flag = false;
        for (int i = 0; i < str2.length; i++) {
            if (str.endsWith(str2[i])) {
                flag = true;
                break;
            }
        }
        if (flag == true) {
            System.out.println(str + "是视频文件");
        } else System.out.println(str + "不是视频文件");
    }
}
