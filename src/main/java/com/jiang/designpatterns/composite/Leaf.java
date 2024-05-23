package com.jiang.designpatterns.composite;

/**
 * 叶子节点类
 */
public class Leaf extends Component {

    public Leaf(String name) {
        super(name);
    }
    //输出叶子节点：
    @Override
    void print(int level) {
        for (int i = 0; i < level; i++){
            System.out.print("--");
        }
        System.out.println("leaf: " + name);

    }
    @Override
    public void add(Component component) {
        throw new UnsupportedOperationException(); //不考虑叶子节点是组合节点
    }

    @Override
    public void remove(Component component) {
        throw new UnsupportedOperationException();//不考虑叶子节点是组合节点
    }
}
