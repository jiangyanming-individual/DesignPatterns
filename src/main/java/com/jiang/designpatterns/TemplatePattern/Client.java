package com.jiang.designpatterns.TemplatePattern;

import com.jiang.designpatterns.TemplatePattern.impl.Cricket;
import com.jiang.designpatterns.TemplatePattern.impl.Football;

public class Client {
    public static void main(String[] args) {

        Cricket cricket = new Cricket();
        cricket.play();

        System.out.println();
        Football football = new Football();
        football.play();
    }
}
