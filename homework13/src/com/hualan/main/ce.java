package com.hualan.main;

import java.util.Scanner;

public class ce {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("请输入一个字符串:");
            String str = sc.nextLine();
            Judge(str);
        } catch (FileFormatException e) {
            System.out.println("捕获到异常" + e.getMessage());
        }
    }

    public static void Judge(String str) {
        String[] str2 = {".avi", ".mp4", ".mpg", ".mpeg", ".wmv", ".mov", ".rmvb", ".swf", ".flv", ".ram" };
        boolean flag = false;
        for (int i = 0; i < str2.length; i++) {
            if (str.endsWith(str2[i])) {
                flag = true;
            }
        }
        if (flag) {
            System.out.println(str + "是一个视频文件");
        } else {
            throw new FileFormatException("文件格式不匹配");
        }
    }
}

class FileFormatException extends RuntimeException {
    public FileFormatException(String message) {
        super(message);
    }
}
