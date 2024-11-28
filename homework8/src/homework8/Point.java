package homework8;

import java.util.Scanner;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void printPointInfo() {
        System.out.println("(" + this.x + "," + this.y + ")");
    }

    public double distanceTo(Point P) {
        return Math.sqrt((P.x - this.x) * (P.x - this.x) + (P.y - this.y) * (P.y - this.y));
    }
}

class Test5 {
    public static void main(String[] args) {
        System.out.println("请第一个输入点的坐标：");
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        Point p1 = new Point(x1, y1);
        System.out.println("请第二个输入点的坐标：");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        Point p2 = new Point(x2, y2);
        System.out.println("第一个点的信息为：");
        p1.printPointInfo();
        System.out.println("第二个点的信息为：");
        p2.printPointInfo();
        System.out.println("两个点的距离为：" + p1.distanceTo(p2));
    }
}