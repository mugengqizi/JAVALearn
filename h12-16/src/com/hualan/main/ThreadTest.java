package com.hualan.main;

public class ThreadTest extends Thread implements Runnable {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i <= 200; i++) {
            System.out.println("当前的整数值是" + i);
            Thread.sleep(50);
            if (i == 66) {
                Thread task1 = new Thread(() -> {
                    for (int j = 100; j < 1000; j++) {
                        int a = j / 100;
                        int b = j / 10 % 10;
                        int c = j % 10;
                        if (a * a * a + b * b * b + c * c * c == j) {
                            System.out.print("水仙花数 " + j);
                        }
                    }
                });
                task1.start();
            }
            if (i == 99) {
                Thread task2 = new Thread(() -> {
                    for (int j = 1; j <= 9; j++) {
                        for (int k = 1; k <= j; k++) {
                            System.out.print(j + "*" + k + "=" + j * k + " ");
                        }
                        System.out.println();
                    }
                });
                task2.start();
            }
        }
    }
}
