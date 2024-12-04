package com.hualan.util;

public enum Enum {
    FRONT() {
        public void fun() {
            System.out.println(FRONT + "向前");
        }
    },
    LEFT() {
        public void fun() {
            System.out.println(LEFT + "向左");
        }
    },
    RIGHT() {
        public void fun() {
            System.out.println(RIGHT + "向右");
        }
    };

    public abstract void fun();
}

class Test {
    public static void main(String[] args) {
        Enum e1 = Enum.RIGHT;
        e1.fun();
        Direction d = Direction.FRONT;
        switch (d) {
            case FRONT:
                System.out.println("前面");
                break;
            case BEHIND:
                System.out.println("后面");
                break;
            case LEFT:
                System.out.println("左面");
                break;
            case RIGHT:
                System.out.println("右面");
                break;
            default:
                System.out.println("错误的方向");
        }
        Direction d1 = d;
        System.out.println(d1);
    }
}

enum Direction {
    FRONT, BEHIND, LEFT, RIGHT;
}
