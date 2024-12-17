package com.hualan.task;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Task extends Thread {
    private int count = 1000;
    static Lock lock = new ReentrantLock();

    public void run() {
        while (count > 0) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            lock.lock();
            if (count <= 0) return;
            System.out.println(Thread.currentThread().getName() + "卖出一张票，当前剩余" + --count + "张票");
            lock.unlock();
        }
    }
}