package com.hualan.bean;

import java.util.Objects;

public class RaceInfo {
    String raceNumber;
    Integer year;
    String place;
    String winner;

    public RaceInfo() {
    }

    public RaceInfo(String raceNumber, Integer year, String place, String winner) {
        this.raceNumber = raceNumber;
        this.year = year;
        this.place = place;
        this.winner = winner;
    }

    public String getRaceNumber() {
        return raceNumber;
    }

    public void setRaceNumber(String raceNumber) {
        this.raceNumber = raceNumber;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

    @Override
    public String toString() {
        return "RaceInfo{" +
                "届数='" + raceNumber + '\'' +
                ", 举办年份=" + year +
                ", 举办地点='" + place + '\'' +
                ", 冠军='" + winner + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RaceInfo raceInfo = (RaceInfo) o;
        return Objects.equals(raceNumber, raceInfo.raceNumber) && Objects.equals(year, raceInfo.year) && Objects.equals(place, raceInfo.place) && Objects.equals(winner, raceInfo.winner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(raceNumber, year, place, winner);
    }
}
