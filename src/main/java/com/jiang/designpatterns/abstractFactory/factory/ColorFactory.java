package com.jiang.designpatterns.factoryPattern.factory;

import com.jiang.designpatterns.factoryPattern.AbstractFactory;
import com.jiang.designpatterns.factoryPattern.Color;
import com.jiang.designpatterns.factoryPattern.Shape;
import com.jiang.designpatterns.factoryPattern.impl.Blue;
import com.jiang.designpatterns.factoryPattern.impl.Red;
import com.jiang.designpatterns.factoryPattern.impl.Yellow;

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
        }else {
            return new Yellow();
        }
    }
}
