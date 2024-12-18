package com.hualan.main;

import java.io.*;

/*
编写代码，判断当前工程目录下是否有 `file/JavaSE/IO.txt` 文件，如果有这个文件，读取文件中的内容，打印到控制台。如果没有这个文件创建这个文件(注意：如果文件所在的文件夹也没有，也需要创建出来)，并向文件中写入"IO是InputStream和OutputStream!"。
 */
public class FileTest {
    public static void main(String[] args) throws IOException {
        File file = new File("file\\JavaSE\\IO.txt");
        if (file.exists()) {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            char[] chars = new char[1024];
            int length = 0;
            while ((length = reader.read(chars)) != -1) {
                System.out.println(new String(chars, 0, length));
            }
        } else {
            File parentFile = file.getParentFile();
            if (!parentFile.exists()) {
                parentFile.mkdirs();
            }
            file.createNewFile();
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write("IO是InputStream和OutputStream!");
            writer.flush();
            System.out.println("文件创建成功");
        }
    }
}
