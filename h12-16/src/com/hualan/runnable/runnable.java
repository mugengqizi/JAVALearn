package com.hualan.runnable;

public class runnable implements Runnable {
    private int count = 1000;
    Object lock = new Object();

    public void run() {
        while (count > 0) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (lock) {
                if (count <= 0) return;
                System.out.println(Thread.currentThread().getName() + "卖出一张票，当前剩余" + --count + "张票");
            }
        }
    }
}
