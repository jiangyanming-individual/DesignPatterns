package com.jiang.designpatterns.ProxyPattern.impl;

import com.jiang.designpatterns.ProxyPattern.Image;

import java.net.URL;

public class HighResolutionImages implements Image {

    private URL imageUrl;
    private long startTime;
    private int height;
    private int weight;

    public HighResolutionImages(URL imageUrl) {
        this.imageUrl = imageUrl;
        this.startTime = System.currentTimeMillis();
        this.height = 600;
        this.weight = 600;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    /**
     * 模拟延时
     * @return
     */
    public boolean isLoad(){
        // 模拟图片加载，延迟 3s 加载完成
        long endTime = System.currentTimeMillis();
        return  (endTime - startTime) > 2000;
    }

    @Override
    public void showImage() {
        System.out.println("Real image url: " + imageUrl);
    }
}
