package homework9;

import java.util.Scanner;

public class Shape {
    private Point p1;

    public Shape() {
    }

    public Shape(Point p1) {
        this.p1 = p1;
    }

    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public void perimeter() {
    }

    public void area() {
    }

    public Point center() {
        return this.p1;
    }
}

class Rectangle1 extends Shape {
    private double width;
    private double height;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Rectangle1() {
    }

    public Rectangle1(Point p1, double width, double height) {
        super(p1);
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
        Point p1 = new Point(getP1().getX() + width / 2, getP1().getY() - height / 2);
        return p1;
    }

    public boolean isIntersect(Rectangle1 rect) {
        Point p1 = this.center();
        Point p2 = rect.center();
        double centerHeight = Math.abs(p1.getY() - p2.getY());
        double centerWidth = Math.abs(p1.getX() - p2.getX());
        return centerWidth < (this.width + rect.getWidth()) / 2 || centerHeight < (this.height + rect.height) / 2;
    }
}

class Square extends Shape {
    private double side;

    public Square() {
    }

    public Square(Point p1, double side) {
        super(p1);
        this.side = side;
    }

    public void area() {
        System.out.println("正方形的面积是：" + this.side * this.side);
    }

    public void perimeter() {
        System.out.println("正方形的周长为：" + 4 * side);
    }

    public Point center() {
        Point p1 = new Point(getP1().getX() + side / 2, getP1().getY() - side / 2);
        return p1;
    }
}

class Circle1 extends Shape {
    private double r;
    private static final double pai = 3.1415926;

    public Circle1() {
    }

    public Circle1(Point p1, double r) {
        super(p1);
        this.r = r;
    }

    public void area() {
        System.out.println("圆形形的面积是：" + pai * this.r * this.r);
    }

    public void perimeter() {
        System.out.println("圆形的周长为：" + 2 * pai * this.r);
    }
}

class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("输入开始的点：");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        Shape s1 = new Shape(new Point(x1, y1));
        System.out.println(" ");
        //测试矩形
        System.out.println("=======矩形=======");
        System.out.print("请输入矩形的宽：");
        double width = sc.nextDouble();
        System.out.println(" ");
        System.out.print("请输入矩形的高：");
        double height = sc.nextDouble();
        Rectangle1 r1 = new Rectangle1(s1.getP1(), width, height);
        r1.area();
        r1.perimeter();
        System.out.println("矩形的中心点为：" + r1.center());
        System.out.println("=======正方形======");
        System.out.print("请输入正方形的边长：");
        double side = sc.nextDouble();
        Square square = new Square(s1.getP1(), side);
        square.area();
        square.perimeter();
        System.out.println("正方形的中心点为：" + square.center());
        System.out.println("=======圆形=======");
        System.out.print("请输入圆形的半径：");
        double r = sc.nextDouble();
        Circle1 c1 = new Circle1(s1.getP1(), r);
        c1.area();
        c1.perimeter();
    }
}