package com.jiang.designpatterns.abstractFactory;

public class AbsatractFactoryDemo {
    /**
     * 客户端调用; 通过工厂模式去生产品
     * @param args
     */
    public static void main(String[] args) {

        //抽象工厂生成器：
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        Shape circle = shapeFactory.getShape("circle");
        circle.draw();
        Shape rectangle = shapeFactory.getShape("rectangle");
        rectangle.draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
        Color red = colorFactory.getColor("RED");
        red.write();
        Color blue = colorFactory.getColor("BLUE");
        blue.write();
    }
}
