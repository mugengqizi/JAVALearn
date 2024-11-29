package day29;

public class fa {
    private int a;

    public void setA(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public static void say() {
        System.out.println("fa");
    }

    public void long1() {
        System.out.println("dir  fa");
    }
}

class son extends fa {
    private int b;

    public static void say() {
        System.out.println("son");
        fa.say();
    }

    public void long1() {
        System.out.println("dir son");
    }
}

class Test {
    public static void main(String[] args) {
        char[] arr = new char[3];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
