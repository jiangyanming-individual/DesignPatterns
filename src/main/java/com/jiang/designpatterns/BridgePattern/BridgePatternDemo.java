package com.jiang.designpatterns.BridgePattern;

import com.jiang.designpatterns.BridgePattern.impl.Circle;
import com.jiang.designpatterns.BridgePattern.impl.GreenCircle;
import com.jiang.designpatterns.BridgePattern.impl.RedCircle;

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
