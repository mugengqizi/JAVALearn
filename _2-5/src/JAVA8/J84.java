package JAVA8;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class J84 implements Runnable {
    String name;

    public J84(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("子线程" + name);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Test4 {
    public static void main(String[] args) {
        ExecutorService es = Executors.newCachedThreadPool();
        Runnable runnable1 = new J84("线程A");
        Thread thread1 = new Thread(runnable1);
        Runnable runnable2 = new J84("线程B");
        Thread thread2 = new Thread(runnable2);
        es.submit(thread1);
        es.submit(thread2);
        es.submit(() -> System.out.println(Thread.currentThread().getId() + Thread.currentThread().getName()));
        es.shutdown();
    }
}
