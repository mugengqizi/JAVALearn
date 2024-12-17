package com.hualan.money;

public class Mother implements Runnable {
    private Card card;

    public Mother(Card c) {
        this.card = c;
    }

    @Override
    public void run() {
        while (true) {
            card.depositMoney();
        }
    }
}
