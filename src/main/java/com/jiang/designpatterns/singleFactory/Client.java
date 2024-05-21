package com.jiang.designpatterns.singleFactory;

public class Client {

    /**
     * 客户端调用; 通过工厂模式去生产品
     * @param args
     */
    public static void main(String[] args) {
        ShapeFacroty shapeFacroty = new ShapeFacroty();
        Shape circle = shapeFacroty.getShape("circle");
        circle.draw();
        Shape rectangle = shapeFacroty.getShape("rectangle");
        rectangle.draw();
        Shape square = shapeFacroty.getShape("square");
        square.draw();
    }
}
