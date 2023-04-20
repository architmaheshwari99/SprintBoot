package com.mahes.archit.spring;

import com.mahes.archit.spring.game.ContraGame;
import com.mahes.archit.spring.game.GameRunner;
import com.mahes.archit.spring.game.MarioGame;
import com.mahes.archit.spring.game.PacManGame;

public class AppGamingBasic {

    public static void main(String[] args) {
//        var marioGame = new MarioGame();
        var contraGame = new ContraGame();
        var pacmanGame = new PacManGame();

        var gameRunner = new GameRunner(pacmanGame);

        gameRunner.run();
    }
}
