package com.jiang.designpatterns.abstractFactory;

import com.jiang.designpatterns.abstractFactory.factory.ColorFactory;
import com.jiang.designpatterns.abstractFactory.factory.ShapeFacroty;

/**
 * 创建一个工厂生成器：
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(String factoryType) {
        if (factoryType == null) return null;

        if (factoryType.equalsIgnoreCase("SHAPE")) {
            return new ShapeFacroty();
        }else {
            return new ColorFactory();
        }
    }

}
