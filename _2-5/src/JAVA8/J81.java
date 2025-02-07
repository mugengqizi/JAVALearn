package JAVA8;

public class J81 extends Thread {
    String name;

    public J81(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("子线程" + name);
        }
    }
}


