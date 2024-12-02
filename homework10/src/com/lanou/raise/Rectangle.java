package com.lanou.raise;

import java.awt.*;

class Rectangle1 {
    private Point startPoint;
    private double width;
    private double height;

    public Rectangle1() {
    }

    public Rectangle1(Point startPoint, double width, double height) {
        this.startPoint = startPoint;
        this.width = width;
        this.height = height;
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

    //判断矩形是否相交
    public boolean isIntersect(Rectangle1 rectangle) {
        if (this.startPoint.getX() > rectangle.startPoint.getX() + rectangle.width || this.startPoint.getX() + this.width < rectangle.startPoint.getX() || this.startPoint.getY() < rectangle.startPoint.getY() - rectangle.height || this.startPoint.getY() - this.height > rectangle.startPoint.getY()) {
            return false;
        } else return true;
    }
}

public class Rectangle {
    public static void main(String[] args) {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(1, 1);
        Rectangle1 r1 = new Rectangle1(p1, 3, 3);
        Rectangle1 r2 = new Rectangle1(p2, 2, 2);
        if (r1.isIntersect(r2)) {
            System.out.println("相交");
        } else {
            System.out.println("不相交");
        }
    }
}


