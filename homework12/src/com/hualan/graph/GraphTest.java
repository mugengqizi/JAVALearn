package com.hualan.graph;

public class GraphTest {
    public static void main(String[] args) {
        Circle circle1 = new Circle(new Point(3, 3), 3);
        Circle circle2 = new Circle(new Point(2, 2), 3);
        System.out.println("圆的面积为：" + circle1.area());
        System.out.println("圆的周长为：" + circle1.perimeter());
        System.out.println("是否相交" + circle1.isIntersect(circle2));
        Rectangle rectangle = new Rectangle(new Point(0, 0), 4, 6);
        System.out.println("矩形的面积为：" + rectangle.area());
        System.out.println("矩形的周长为：" + rectangle.perimeter());
        System.out.println("矩形的中心点为：" + rectangle.center());
    }
}

abstract class Graph {
    abstract public double area();

    abstract public double perimeter();
}

final class Circle extends Graph {
    private Point center;
    private double r;
    static final double PI = 3.1415926;

    public Circle(Point center) {
        this.center = center;
    }

    public Circle(Point center, double r) {
        this.center = center;
        this.r = r;
    }

    @Override
    public double area() {
        return r * r * PI;
    }

    @Override
    public double perimeter() {
        return 2 * r * PI;
    }

    public boolean isIntersect(Circle c) {
        return this.center.distanceTo(c.center) < this.r + c.r;
    }
}

final class Rectangle extends Graph {
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

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return 2 * width + 2 * height;
    }

    public Point center() {
        Point p1 = new Point(this.startPoint.getX() + width / 2, this.startPoint.getY() - height / 2);
        return p1;
    }
}

class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void printPointInfo() {
        System.out.println("(" + this.x + "," + this.y + ")");
    }

    public double distanceTo(Point P) {
        return Math.sqrt((P.x - this.x) * (P.x - this.x) + (P.y - this.y) * (P.y - this.y));
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
