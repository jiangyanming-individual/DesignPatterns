package com.jiang.designpatterns.TemplatePattern.impl;

import com.jiang.designpatterns.TemplatePattern.Game;

public class Football extends Game {
    @Override
    public void inintGame() {
        System.out.println("Football Game init");
    }

    @Override
    public void startGame() {
        System.out.println("Football Game started");
    }

    @Override
    public void endGame() {
        System.out.println("Football Game end");
    }
}
