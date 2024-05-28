package com.jiang.designpatterns.ProxyPattern;

import com.jiang.designpatterns.ProxyPattern.impl.HighResolutionImages;
import com.jiang.designpatterns.ProxyPattern.impl.ImageProxy;
import java.net.MalformedURLException;
import java.net.URL;

public class Client {
    public static void main(String[] args) throws MalformedURLException {

        String url="https://www.bing.com/images/search?q=%E5%9B%BE%E7%89%87&id=12C124DC967D5E7D824B0A904492491E21DA5038&FORM=IQFRBA";
        URL imgageUrl = new URL(url);
        HighResolutionImages highResolutionImages = new HighResolutionImages(imgageUrl);
        //代理对象
        ImageProxy imageProxy = new ImageProxy(highResolutionImages);
        imageProxy.showImage();
    }
}
