package com.hualan.util;

class Dog<T> {
    T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public <K> void show(K k) {
        System.out.println("sss");
    }
}

public class Fan {
    public static void main(String[] args) {
        Dog<Integer> linzhong = new Dog<>();
        linzhong.setT(100);
        System.out.println(linzhong.getT());
        linzhong.show("11");
    }
}
