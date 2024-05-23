package com.jiang.designpatterns.bridgePattern;

import com.jiang.designpatterns.bridgePattern.impl.Circle;
import com.jiang.designpatterns.bridgePattern.impl.GreenCircle;
import com.jiang.designpatterns.bridgePattern.impl.RedCircle;

/**
 * 测试
 *
 */
public class BridgePatternDemo {

    public static void main(String[] args) {
        Circle circle1 = new Circle(100, 100, 10, new RedCircle());
        circle1.draw();

        Circle circle2 = new Circle(100, 100, 20, new GreenCircle());
        circle2.draw();
    }
}
