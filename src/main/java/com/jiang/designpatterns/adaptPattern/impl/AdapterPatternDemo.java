package com.jiang.designpatterns.adaptPattern.impl;

public class AdapterPatternDemo {

    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("MP3","青花瓷.mp3");
        audioPlayer.play("VLC","hai.vlc");
        audioPlayer.play("MP4","西游记.MP4");
        audioPlayer.play("WEB","file.web");
    }
}
