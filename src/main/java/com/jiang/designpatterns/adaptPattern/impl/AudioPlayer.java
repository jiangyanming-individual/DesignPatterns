package com.jiang.designpatterns.adaptPattern.impl;

import com.jiang.designpatterns.adaptPattern.MediaPlayer;

public class AudioPlayer implements MediaPlayer {

    private MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("MP3")){
            System.out.println("Playing mp3 file. name: " + fileName);
        }else  if (audioType.equalsIgnoreCase("VLC") || audioType.equalsIgnoreCase("MP4")){
            mediaAdapter = new MediaAdapter(audioType); //新建一个MediaPlayer类
            mediaAdapter.play(audioType,fileName);
        }else {
            System.out.println("no such file to play...");
        }
    }

}
