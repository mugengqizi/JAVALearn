package homework9;

import java.util.Scanner;

public class Rectangle {
    private Point startPoint;
    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(Point startPoint, double width, double height) {
        this.startPoint = startPoint;
        this.width = width;
        this.height = height;
    }

    public void area() {
        System.out.println("矩形的面积是：" + this.width * this.height);
    }

    public void perimeter() {
        System.out.println("矩形的周长为：" + (2 * this.width + 2 * this.height));
    }

    //获取矩形的中心点
    public Point center() {
        Point p1 = new Point(this.startPoint.getX() + width / 2, this.startPoint.getY() - height / 2);
        return p1;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "startPoint=" + startPoint +
                ", width=" + width +
                ", height=" + height +
                '}';
    }

    public void printRectangleInfo() {
        System.out.println("矩形的信息为：" + this);
    }

    public boolean isSquare() {
        return width == height;
    }
}

class Test2 {
    public static void main(String[] args) {
        System.out.print("请输入矩形开始的点：");
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        Point startPoint = new Point(x1, y1);
        System.out.print("请输入矩形的长度：");
        double width1 = sc.nextDouble();
        System.out.print("请输入矩形的高度：");
        double height1 = sc.nextDouble();
        Rectangle R1 = new Rectangle(startPoint, width1, height1);
        R1.perimeter();
        R1.area();
        System.out.println("矩形的中心点为：" + R1.center());
        R1.printRectangleInfo();
        if (R1.isSquare()) {
            System.out.println("矩形是正方形");
        } else {
            System.out.println("矩形不是正方形");
        }
    }
}
