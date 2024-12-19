package com.hualan.bean;

import java.io.Serializable;

public class Rectangle implements Serializable {
    private Point startPoint;
    private double width;
    private double height;

    public Rectangle(Point startPoint, double width, double height) {
        this.startPoint = startPoint;
        this.width = width;
        this.height = height;
    }

    public Point getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(Point startPoint) {
        this.startPoint = startPoint;
    }

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

    @Override
    public String toString() {
        return "Rectangle{" +
                "startPoint=" + startPoint +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}

