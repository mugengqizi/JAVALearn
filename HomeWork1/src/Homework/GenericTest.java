package Homework;

import java.util.Arrays;

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Person other = (Person) obj;
        return name.equals(other.name);
    }
}

class Cat {
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Cat other = (Cat) obj;
        return name.equals(other.name) && age == other.age;
    }
    
}

public class GenericTest {
    public static void main(String[] args) {
        Person[] arr = {new Person("张三"), new Person("李四"), new Person("王五")};
        Cat[] arr2 = {new Cat("花花", 2), new Cat("小白", 3), new Cat("老婆", 4)};
        ArrayUtils.printArray(arr);
        System.out.println(ArrayUtils.getIndex(arr, new Person("张三")));
        ArrayUtils.printArray(arr2);
        System.out.println(ArrayUtils.getIndex(arr2, new Cat("小白", 3)));

    }
}
// 泛型方法
class ArrayUtils {
    private ArrayUtils() {
    }

    public static <T> void printArray(T[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static <T> int getIndex(T[] arr, T t) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(t)) {
                return i;
            }
        }
        return -1;
    }

}
