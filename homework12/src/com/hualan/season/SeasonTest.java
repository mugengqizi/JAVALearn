package com.hualan.season;

public class SeasonTest {
    public static void main(String[] args) {
        Season season = Season.SPRING;
        switch (season) {
            case SPRING -> System.out.println("春天");
            case SUMMER -> System.out.println("夏天");
            case AUTUMN -> System.out.println("秋天");
            case WINTER -> System.out.println("冬天");
        }
    }
}

enum Season {
    SPRING, SUMMER, AUTUMN, WINTER;
}
