package com.hualan.money;

public class CardTest {
    static Object lock = new Object();

    public static void main(String[] args) {

        Card card = new Card();
        Mother m = new Mother(card);
        Thread m1 = new Thread(m);
        Son s = new Son(card);
        Thread s1 = new Thread(s);
        m1.start();
        s1.start();
    }
}
