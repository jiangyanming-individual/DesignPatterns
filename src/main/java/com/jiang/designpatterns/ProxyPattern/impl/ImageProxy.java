package com.jiang.designpatterns.ProxyPattern.impl;

import com.jiang.designpatterns.ProxyPattern.Image;

/**
 * 代理模式
 */
public class ImageProxy implements Image {

    private HighResolutionImages highResolutionImages;


    public ImageProxy(HighResolutionImages highResolutionImages) {
        this.highResolutionImages = highResolutionImages;
    }

    @Override
    public void showImage() {
        while (!highResolutionImages.isLoad()){
            try {
                System.out.println("Temp image: height: "+ highResolutionImages.getHeight()+" "+ "weight: "+ highResolutionImages.getWeight());
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        highResolutionImages.showImage();
    }
}
