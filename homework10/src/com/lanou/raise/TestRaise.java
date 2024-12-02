package com.lanou.raise;


class Person {
    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void raiseAnimal(Animal animal) {
        animal.eat();
    }
}

class Animal {
    private String name;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat() {
    }
}

class Cat extends Animal {
    public Cat() {
    }

    public Cat(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public void eat() {
        System.out.println("猫吃鱼");
    }

    public void catchMouse() {
        System.out.println("猫抓老鼠");
    }
}

class Dog extends Animal {
    public Dog() {
    }

    public Dog(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public void eat() {
        System.out.println("狗吃鱼骨头");
    }

    public void guardHouse() {
        System.out.println("狗看门");
    }
}

class Bird extends Animal {
    public Bird() {
    }

    public Bird(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public void eat() {
        System.out.println("鸟吃虫");
    }

    public void catchInsects() {
        System.out.println("鸟捉虫子");
    }
}

public class TestRaise {
    public static void main(String[] args) {
        //1
        Person p1 = new Person();
        System.out.println("猫：");
        p1.raiseAnimal(new Cat());
        System.out.println("狗：");
        p1.raiseAnimal(new Dog());
        System.out.println("鸟：");
        p1.raiseAnimal(new Bird());
        System.out.println("=============================");
        //2在TestRaise类的main方法里, 创建一个数组,存放2只Cat, 1只Dog, 2只Bird.
        //        数组可以定义成Animal数组, 这样就能通过多态存储不同类型的动物了.
        Animal[] animal = new Animal[5];
        Cat cat1 = new Cat("汤姆");
        Cat cat2 = new Cat("蓝猫");
        Dog dog1 = new Dog("大黄");
        Bird b1 = new Bird("布丁");
        Bird b2 = new Bird("开心");
        animal[0] = cat1;
        animal[1] = cat2;
        animal[2] = dog1;
        animal[3] = b1;
        animal[4] = b2;
        System.out.println("动物的名字为：");
        for (int i = 0; i < animal.length; i++) {
            System.out.println(animal[i].getName());
        }
        System.out.println("===============================");
        //(3) 在TestRaise类的main方法里, 遍历上述数组, 如果数组元素是Cat, 执行抓老鼠方法, 如果数组元素是Dog, 执行看门方法, 如果数组元素是Bird, 执行捉虫子方法.
        for (int i = 0; i < animal.length; i++) {
            if (animal[i] instanceof Cat) {
                ((Cat) animal[i]).catchMouse();
            } else if (animal[i] instanceof Dog) {
                ((Dog) animal[i]).guardHouse();
            } else if (animal[i] instanceof Bird) {
                ((Bird) animal[i]).catchInsects();
            }
        }
    }
}
