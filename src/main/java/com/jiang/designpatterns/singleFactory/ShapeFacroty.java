package com.jiang.designpatterns.singleFactory;


import com.jiang.designpatterns.singleFactory.impl.Circle;
import com.jiang.designpatterns.singleFactory.impl.Rectangle;
import com.jiang.designpatterns.singleFactory.impl.Square;

/**
 * 继承抽象工厂
 */
public class ShapeFacroty {

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
}
