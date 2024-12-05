package com.hualan.exception;

import java.util.Scanner;

public class ExceptionTest {
    public static void main(String[] args) {
        try {
            System.out.print("请输入一个文件名：");
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            checkVideoFile(str);
        } catch (FileFormatException e) {
            System.out.println("捕获到异常：" + e.getMessage());
        }
    }

    public static void checkVideoFile(String fileName) {
        String[] videoExtensions = {".avi", ".mp4", ".mpg", ".mpeg", ".wmv", ".mov", ".rmvb", ".swf", ".flv", ".ram" };
        boolean isVideoFile = false;
        for (String extension : videoExtensions) {
            if (fileName.endsWith(extension)) {
                isVideoFile = true;
                break;
            }
        }
        if (isVideoFile) {
            System.out.println(fileName + " 是一个视频文件");
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
