package com.jiang.designpatterns.TemplatePattern.impl;

import com.jiang.designpatterns.TemplatePattern.Game;

public class Cricket extends Game {

    @Override
    public void inintGame() {
        System.out.println("Cricket game init");
    }

    @Override
    public void startGame() {
        System.out.println("Cricket game started");
    }

    @Override
    public void endGame() {
        System.out.println("Cricket game end");
    }
}
