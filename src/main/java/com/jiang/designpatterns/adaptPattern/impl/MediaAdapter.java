package com.jiang.designpatterns.adaptPattern.impl;

import com.jiang.designpatterns.adaptPattern.AdvancedMediaPlayer;
import com.jiang.designpatterns.adaptPattern.MediaPlayer;

/**
 * 创建实现了 MediaPlayer 接口的适配器类
 */
public class MediaAdapter implements MediaPlayer {

    //引入其他先进播放器类
    private AdvancedMediaPlayer advancedMediaPlayer;

    /**
     * 通过构造器创建其他类：构造器是在类初始化时，就被加载了
     * 在 Java 中，构造方法是一种特殊的方法，当一个类被实例化的时候，就会调用构造方法
     * @param audioType
     */
    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("VLC")){
            advancedMediaPlayer=new VlcPlayer();
        }else if (audioType.equalsIgnoreCase("MP4")){
            advancedMediaPlayer=new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("VLC")) {
            //调用方法
            advancedMediaPlayer.playVlc(fileName);
        }else if (audioType.equalsIgnoreCase("MP4")) {
            //调用方法
            advancedMediaPlayer.playMp4(fileName);
        }
    }

}
