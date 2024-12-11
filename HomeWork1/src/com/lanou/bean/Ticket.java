package com.lanou.bean;

import java.util.Objects;

public class Ticket {
    String trainNumber;
    String startTime;
    Integer duration;
    Integer price;

    public Ticket(String trainNumber, String startTime, Integer duration, Integer price) {
        this.trainNumber = trainNumber;
        this.startTime = startTime;
        this.duration = duration;
        this.price = price;
    }

    public String getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(String trainNumber) {
        this.trainNumber = trainNumber;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "车次='" + trainNumber + '\'' +
                ", 出发时间=" + startTime +
                ", 历时(分钟)=" + duration +
                ", 票价=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return Objects.equals(trainNumber, ticket.trainNumber) && Objects.equals(startTime, ticket.startTime) && Objects.equals(duration, ticket.duration) && Objects.equals(price, ticket.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trainNumber, startTime, duration, price);
    }
}
