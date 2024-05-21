package com.jiang.designpatterns.abstractFactory.factory;

import com.jiang.designpatterns.abstractFactory.AbstractFactory;
import com.jiang.designpatterns.abstractFactory.Color;
import com.jiang.designpatterns.abstractFactory.Shape;
import com.jiang.designpatterns.abstractFactory.impl.Circle;
import com.jiang.designpatterns.abstractFactory.impl.Rectangle;
import com.jiang.designpatterns.abstractFactory.impl.Square;

/**
 * 继承抽象工厂
 */
public class ShapeFacroty extends AbstractFactory {

    public Shape getShape(String shapeType) {
        if (shapeType == null) return null;
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        }else if (shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }else if (shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
    @Override
    public Color getColor(String color) {
        return null;
    }
}
