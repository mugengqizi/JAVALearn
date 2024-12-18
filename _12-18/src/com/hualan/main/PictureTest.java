package com.hualan.main;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.UUID;

/*
编写代码，把 `1.jpg`  拷贝到工程的 `upload/picture` 目录下, 文件后缀保持不变，文件名使用UUID表示

   > 需要先将素材`1.jpg`文件拖拽到工程的根目录下
   >
   > 先判断工程里是否有upload/picture文件夹，如果没有这个文件夹，使用代码创建文件夹
   >
   > 使用不带'-'连字符的UUID作为文件名，后缀还是使用原本的后缀。可以借助String的字符串截取把后缀截取出来。

 */
public class PictureTest {
    public static void main(String[] args) throws IOException {
        File file = new File(("_12-18/upload/picture"));
        if (!file.exists()) {
            file.mkdirs();
        }
        String uuid = UUID.randomUUID().toString().replace("-", "");
        String oldName = "_12-18/1.jpg";
        String newName = "_12-18/upload/picture/" + uuid + oldName.substring(oldName.lastIndexOf("."));
        File oldFile = new File(oldName);
        File newFile = new File(newName);
        Files.copy(oldFile.toPath(), newFile.toPath());
        System.out.println("文件拷贝成功，新文件名：" + newName);
    }
}
