package com.jiang.designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 组合类：
 */
public class Composite extends Component {
    //属性
    private List<Component> children;
    //构造方法
    public Composite(String name) {
        super(name);
        this.children=new ArrayList<>();
    }

    @Override
    void print(int level) {
        for (int i = 0; i < level; i++) {
            System.out.print("--");
        }
        System.out.println("composite: " + name);
        //层次遍历：
        for (Component child : children) {
            child.print(level + 1);
        }
    }

    @Override
    public void add(Component component) {
        children.add(component);
    }
    @Override
    public void remove(Component component) {
        children.remove(component);
    }
}
