package com.hualan.main;

import java.io.File;

/*
编写代码，遍历工程中所有.java文件的文件路径。

   > 使用递归遍历, 遍历Homework22工程。
 */
public class FileListTest {
    public static void main(String[] args) {
        listFile("_12-18");
    }

    public static void listFile(String path) {
        File file = new File(path);
        if (file.isFile()) {
            if (file.getName().endsWith("java")) {
                System.out.println(file.getAbsolutePath());
            }
        } else {
            File[] files = file.listFiles();
            if (files != null) {
                for (File f : files) {
                    listFile(f.getAbsolutePath());
                }
            }
        }
    }
}
