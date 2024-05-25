package com.jiang.designpatterns.interpreterPattern.impl;

import com.jiang.designpatterns.interpreterPattern.Expression;

import java.util.StringTokenizer;

public class TerminalExpression extends Expression {


    private String context=null;


    public TerminalExpression(String context) {
        this.context = context;
    }

    @Override
    public boolean interpret(String str) {

        StringTokenizer st = new StringTokenizer(str);
        while (st.hasMoreTokens()){

            String token= st.nextToken();
            if (token.equals(context)){
                return true;
            }
        }
        return false;
    }
}
