package com.hualan.money;

import com.sun.tools.javac.Main;

public class Card extends Thread {
    private double balance;

    public Card() {
        this.balance = 88;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void depositMoney() {
        synchronized (Main.class) {
            if (balance < 100) {
                balance += 2000;
                System.out.println("向银行卡中存入了2000元，当前账户余额是" + balance + "元");
            } else {
                System.out.println("已经有钱花了，等没钱的时候再存!");
                try {
                    Card.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                Main.class.notify();
                try {
                    Main.class.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            try {
                Card.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void withdrawCash() {
        synchronized (Main.class) {
            if (balance >= 100) {
                balance -= 100;
                System.out.println("从银行卡中取出了100元，当前账户余额是" + balance + "元");
               
            } else {
                System.out.println("余额不足，等有钱的时候再取!");
                Main.class.notify();
                try {
                    Main.class.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
            try {
                Card.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
