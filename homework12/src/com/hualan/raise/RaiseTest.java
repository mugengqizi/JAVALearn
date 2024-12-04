package com.hualan.raise;

public class RaiseTest {
    public static void main(String[] args) {
        Person person = new Person();
        Animal cat = new Animal() {
            @Override
            public void eat() {
                System.out.println("猫吃鱼");
            }
        };
        Animal dog = new Animal() {
            @Override
            public void eat() {
                System.out.println("狗吃骨头");
            }
        };
        Animal snake = new Animal() {
            @Override
            public void eat() {
                System.out.println("蛇吃田鼠");
            }
        };
        person.raiseAnimal(cat);
        person.raiseAnimal(dog);
        person.raiseAnimal(snake);
    }
}

interface IPet {
    void eat();
}

abstract class Animal implements IPet {
    private String name;
    private int age;
}

class Person {
    private String name;

    public void raiseAnimal(Animal animal) {
        animal.eat();
    }

    public void raisePet(IPet pet) {
        pet.eat();
    }
}