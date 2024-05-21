package com.jiang.designpatterns.abstractFactory.factory;

import com.jiang.designpatterns.abstractFactory.AbstractFactory;
import com.jiang.designpatterns.abstractFactory.Color;
import com.jiang.designpatterns.abstractFactory.Shape;
import com.jiang.designpatterns.abstractFactory.impl.Blue;
import com.jiang.designpatterns.abstractFactory.impl.Red;
import com.jiang.designpatterns.abstractFactory.impl.Yellow;

/**
 * 继承抽象工厂
 */
public class ColorFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType) {
        return null;
    }
    /**
     * 得到颜色
     * @param color
     * @return
     */
    public Color getColor(String color) {
        if (color == null) return null;
        if (color.equalsIgnoreCase("RED")) {
            return new Red();
        }else if (color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }else if (color.equalsIgnoreCase("YELLOW")){
            return new Yellow();
        }
        return null;
    }
}
