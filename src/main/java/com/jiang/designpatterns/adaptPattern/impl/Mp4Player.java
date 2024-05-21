package com.jiang.designpatterns.adaptPattern.impl;

import com.jiang.designpatterns.adaptPattern.AdvancedMediaPlayer;

public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        //什么都不做
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. name: " + fileName);
    }

}
