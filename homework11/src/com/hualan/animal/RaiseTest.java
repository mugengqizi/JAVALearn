package com.hualan.animal;


abstract class Animal {
    private String name;
    private int age;

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void eat();

    public abstract void sleep();

}

class Cat extends Animal {
    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    @Override
    public void sleep() {
        System.out.println("猫正在睡觉");
    }

    public void catchMouse() {
        System.out.println("猫抓老鼠");
    }
}

class Dog extends Animal {
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    @Override
    public void sleep() {
        System.out.println("狗正在睡觉");
    }

    public void guardHouse() {
        System.out.println("狗看门");
    }
}

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void raiseAnimal(Animal animal) {
        animal.eat();
    }
}

public class RaiseTest {
    public static void main(String[] args) {
        Person person = new Person("林忠");
        Animal cat = new Cat("加菲猫", 4);
        Animal dog = new Dog("旺财", 3);
        person.raiseAnimal(cat);
        person.raiseAnimal(dog);
    }
}