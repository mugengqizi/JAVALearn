package com.hualan.money;

public class Son implements Runnable {
    private Card card;

    public Son(Card c) {
        this.card = c;
    }

    public void run() {
        while (true) {
            card.withdrawCash();
        }
    }
}
