package com.hualan.player;

interface IPlayer {
    void play();

    void pause();

    void stop();
}

class MP3Player implements IPlayer {
    private String memorySize;

    public MP3Player() {
    }

    public MP3Player(String memorySize) {
        this.memorySize = memorySize;
    }

    public String getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(String memorySize) {
        this.memorySize = memorySize;
    }

    @Override
    public void pause() {
        System.out.println("MP3暂停");
    }

    @Override
    public void stop() {
        System.out.println("MP3停止");
    }

    @Override
    public void play() {
        System.out.println("MP3播放");
    }
}

class DVDPlayer implements IPlayer {
    @Override
    public void pause() {
        System.out.println("DVD暂停");
    }

    @Override
    public void stop() {
        System.out.println("DVD停止");
    }

    @Override
    public void play() {
        System.out.println("DVD播放");
    }
}

class TapePlayer implements IPlayer {
    @Override

    public void pause() {
        System.out.println("磁带暂停");
    }

    @Override
    public void stop() {
        System.out.println("磁带停止");
    }

    @Override
    public void play() {
        System.out.println("磁带播放");
    }
}

public class PlayerTest {
    public static void main(String[] args) {
        MP3Player mp3Player = new MP3Player("50G");
        DVDPlayer dvdPlayer = new DVDPlayer();
        TapePlayer tapePlayer = new TapePlayer();
        mp3Player.play();
        mp3Player.pause();
        mp3Player.stop();
        dvdPlayer.play();
        dvdPlayer.pause();
        dvdPlayer.stop();
        tapePlayer.play();
        tapePlayer.pause();
        tapePlayer.stop();
        
    }
}
