package JAVA8;

public class J83 implements Runnable {
    String name;

    public J83(String name) {
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

class Test3 {
    public static void main(String[] args) {
        Runnable runnable1 = new J83("线程A");
        Thread thread1 = new Thread(runnable1);
        Runnable runnable2 = new J83("线程B");
        Thread thread2 = new Thread(runnable2);
        thread1.start();
        thread2.start();
    }
}
