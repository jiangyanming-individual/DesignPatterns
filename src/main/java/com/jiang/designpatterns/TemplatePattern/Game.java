package com.jiang.designpatterns.TemplatePattern;

public abstract class Game {

    //初始化游戏
    public abstract void inintGame();
   //开始游戏
   public abstract void startGame();
   //结束游戏
    public abstract void endGame();

   //模板，定义为final 类型
   public final void  play(){
       inintGame();
       startGame();
       endGame();
   }
}
