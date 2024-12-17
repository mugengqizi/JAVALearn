package com.hualan.main;

public class CleanTest extends Thread {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 200; i++) {
                System.out.println("张三在扫地");
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 180; i++) {
                System.out.println("李四在擦玻璃");
            }
        });
        Thread t3 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("王五在洒水");
            }
        });
        Thread t4 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("赵六在擦黑板");
            }
        });
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }

    ;

}
