package com.hualan.bean;

import java.io.*;
import java.util.Scanner;

/*
在RectangleTest类的main方法里判断工程目录里是否存在 `rectangle.dat` 文件，如果存在这个文件，读取文件中的数据，并输出到控制台。如果没有这个文件，创建这个文件，创建一个Rectangle对象(矩形的坐标，宽，高从控制台输入)。并把创建的Rectangle对象写入文件 `rectangle.dat` 文件中。
 */
public class RectangleTest {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String path = "_12-19/rectangle.dat";
        File file = new File(path);
        if (file.exists()) {
            InputStream is = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(is);
            Rectangle rectangle = (Rectangle) ois.readObject();
            System.out.println(rectangle);
        } else {
            System.out.println("文件不存在，创建文件");
            System.out.print("请输入矩形的坐标：");
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            Point point = new Point(x, y);
            System.out.print("请输入矩形的宽：");
            double width = scanner.nextDouble();
            System.out.print("请输入矩形的高：");
            double height = scanner.nextDouble();
            Rectangle rectangle = new Rectangle(point, width, height);
            FileOutputStream fo = new FileOutputStream(file);
            ObjectOutputStream oo = new ObjectOutputStream(fo);
            oo.writeObject(rectangle);
        }

    }
}
