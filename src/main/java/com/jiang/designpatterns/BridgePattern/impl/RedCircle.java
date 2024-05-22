package com.jiang.designpatterns.BridgePattern.impl;
import com.jiang.designpatterns.BridgePattern.DrawAPI;

/**
 * DrawAPI实现类
 */
public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int x, int y, int radius) {
        System.out.println("实现了红色的：radius: " + radius + ";"+ "x: " + x +";"+ "y: " + y);
    }

}
