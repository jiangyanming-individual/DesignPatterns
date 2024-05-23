package com.jiang.designpatterns.composite;

public class Client {

    public static void main(String[] args) {

        Composite root = new Composite("root");

        Leaf node1 = new Leaf("1");
        Composite node2 = new Composite("2");
        Leaf node3 = new Leaf("3");
        root.add(node1);
        root.add(node2);
        root.add(node3);


        Leaf node21 = new Leaf("21");
        Composite node22 = new Composite("22");
        node2.add(node21);
        node2.add(node22);

        Leaf leaf221 = new Leaf("221");
        node22.add(leaf221);
        root.print();
    }
}
