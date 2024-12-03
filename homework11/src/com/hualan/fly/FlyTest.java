package com.hualan.fly;


interface IFly {
    void fly();
}

class Airplane implements IFly {
    private String name;
    private double capacity;

    public Airplane() {
    }

    public Airplane(String name, double capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public void openDoor() {
        System.out.println("飞机开门");
    }

    public void closeDoor() {
        System.out.println("飞机关门");
    }

    @Override
    public void fly() {
        System.out.println("王牌飞行员申请出战");
    }
}

class Bird implements IFly {
    private String name;
    private String Sex;

    public Bird() {
    }

    public Bird(String name, String sex) {
        this.name = name;
        Sex = sex;
    }

    public void eat() {
        System.out.println("鸟吃虫子");
    }

    public void sleep() {
        System.out.println("鸟在睡觉");
    }

    @Override
    public void fly() {
        System.out.println("小鸟起飞~ 欸~欸~欸~ 飞");
    }
}

public class FlyTest {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("库奇", 100.0);
        Bird bird = new Bird("小丑", "男");
        airplane.openDoor();
        airplane.closeDoor();
        airplane.fly();
        bird.eat();
        bird.sleep();
        bird.fly();
    }
}
