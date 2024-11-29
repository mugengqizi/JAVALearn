package homework8;

import java.util.Scanner;

public class Cat {
    private String color;
    private String name;

    public Cat(String color, String name) {
        this.color = color;
        this.name = name;
    }

    public void eat() {
        System.out.println(this.name + "正在吃鱼");
    }

    public void sleep() {
        System.out.println(this.name + "正在睡觉");
    }

    public void catchMouse() {
        System.out.println(this.name + "正在抓老鼠");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入猫的颜色：");
        String color = sc.nextLine();
        System.out.print("请输入猫的名字：");
        String name = sc.nextLine();
        Cat cat = new Cat(color, name);
        System.out.println(cat);
        cat.eat();
        cat.sleep();
        cat.catchMouse();
    }
}