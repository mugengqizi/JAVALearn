package JAVA8;

public class J82 extends Thread {
    String name;

    public J82(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("子线程" + name);
        }
    }
}

class Test2 {
    public static void main(String[] args) {
        Thread thread1 = new J81("线程A");
        Thread thread2 = new J81("线程B");
        thread1.start();
        thread2.start();
    }
}
