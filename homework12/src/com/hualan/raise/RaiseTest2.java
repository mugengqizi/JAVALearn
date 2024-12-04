package com.hualan.raise;

public class RaiseTest2 {
    public static void main(String[] args) {
        Person person = new Person();
        IPet cat = () -> System.out.println("猫吃鱼");
        IPet dog = () -> System.out.println("狗吃骨头");
        IPet snake = () -> System.out.println("蛇吃田鼠");
        person.raisePet(cat);
        person.raisePet(dog);
        person.raisePet(snake);
    }
}
