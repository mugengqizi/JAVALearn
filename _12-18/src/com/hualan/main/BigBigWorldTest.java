package com.hualan.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/*
创建一个BigBigWorldTest类, 在类的main方法中测试下面的功能：

   (1) 编写代码，读取 `BigBigWorld.txt` 文件中的内容，**逐行**打印到控制台中。

   > 需要先将素材`BigBigWorld.txt`文件拖拽到工程的根目录下。
   >
   > 可以借助BufferedReader实现逐行功能。
 */
public class BigBigWorldTest {
    public static void main(String[] args) throws IOException {
        File file = new File("_12-18\\BigBigWorld.txt");
        BufferedReader reader = new BufferedReader(new FileReader(file));
        char[] bytes = new char[1024];
        int length = 0;
        while ((length = reader.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0, length));
        }
    }
}
