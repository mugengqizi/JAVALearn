package com.hualan.bean;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
判断工程目录里是否存在 `rectangleList.dat` 文件，如果存在这个文件，读取文件中的所有数据，并输出到控制台。如果没有这个文件，创建这个文件，另外创建一个List， 存放3个Rectangle对象(矩形的坐标宽，高从控制台输入)。并把List写入文件 `rectangleList.dat` 文件中。
 */
public class RectangleTest2 {
    public static void main(String[] args) throws Exception {
        String path = "_12-19/rectangleList.dat";
        Scanner scanner = new Scanner(System.in);
        File file = new File(path);
        if (file.exists()) {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            List<Rectangle> list = (List<Rectangle>) ois.readObject();
            for (Rectangle rectangle : list) {
                System.out.println(rectangle);
            }
        } else {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            List<Rectangle> list = new ArrayList<>();
            System.out.print("请输入矩形1的坐标：");
            double x1 = scanner.nextDouble();
            double y1 = scanner.nextDouble();
            Point point1 = new Point(x1, y1);
            System.out.print("请输入矩形1的宽：");
            double width1 = scanner.nextDouble();
            System.out.print("请输入矩形1的高：");
            double height1 = scanner.nextDouble();
            Rectangle rectangle1 = new Rectangle(point1, width1, height1);
            list.add(rectangle1);
            System.out.print("请输入矩形2的坐标：");
            double x2 = scanner.nextDouble();
            double y2 = scanner.nextDouble();
            Point point2 = new Point(x2, y2);
            System.out.print("请输入矩形2的宽：");
            double width2 = scanner.nextDouble();
            System.out.print("请输入矩形2的高：");
            double height2 = scanner.nextDouble();
            Rectangle rectangle2 = new Rectangle(point2, width2, height2);
            list.add(rectangle2);
            System.out.print("请输入矩形3的坐标：");
            double x3 = scanner.nextDouble();
            double y3 = scanner.nextDouble();
            Point point3 = new Point(x3, y3);
            System.out.print("请输入矩形3的宽：");
            double width3 = scanner.nextDouble();
            System.out.print("请输入矩形3的高：");
            double height3 = scanner.nextDouble();
            Rectangle rectangle3 = new Rectangle(point3, width3, height3);
            list.add(rectangle3);
            oos.writeObject(list);
        }
    }
}
