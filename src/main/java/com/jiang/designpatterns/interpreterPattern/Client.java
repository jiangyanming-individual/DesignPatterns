package com.jiang.designpatterns.interpreterPattern;

import com.jiang.designpatterns.interpreterPattern.impl.AndExpression;
import com.jiang.designpatterns.interpreterPattern.impl.OrExpression;
import com.jiang.designpatterns.interpreterPattern.impl.TerminalExpression;
import com.sun.org.apache.xpath.internal.operations.Or;

public class Client {


    public static  Expression buildTokenTree(){
        TerminalExpression terminalExpression1 = new TerminalExpression("A");
        TerminalExpression terminalExpression2 = new TerminalExpression("B");
        TerminalExpression terminalExpression3 = new TerminalExpression("C");
        TerminalExpression terminalExpression4 = new TerminalExpression("D");
        //B or C
        OrExpression orExpression1 = new OrExpression(terminalExpression2,terminalExpression3);
        //A or(B or C)
        OrExpression orExpression2 = new OrExpression(terminalExpression1,orExpression1);

        //D and (A or (B or C)) 构建的上下文
        return new AndExpression(terminalExpression4,orExpression2);

    }



    public static void main(String[] args) {

        Expression tree = buildTokenTree();
        String context1 = "D A";
        String context2 = "A B";

        System.out.println(tree.interpret(context1));
        System.out.println(tree.interpret(context2));

    }
}
