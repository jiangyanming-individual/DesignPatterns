package com.jiang.designpatterns.factoryPattern.factory;

import com.jiang.designpatterns.factoryPattern.AbstractFactory;
import com.jiang.designpatterns.factoryPattern.Color;
import com.jiang.designpatterns.factoryPattern.Shape;
import com.jiang.designpatterns.factoryPattern.impl.Circle;
import com.jiang.designpatterns.factoryPattern.impl.Rectangle;
import com.jiang.designpatterns.factoryPattern.impl.Square;

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
        }else {
            return new Square();
        }
    }
    @Override
    public Color getColor(String color) {
        return null;
    }

}
