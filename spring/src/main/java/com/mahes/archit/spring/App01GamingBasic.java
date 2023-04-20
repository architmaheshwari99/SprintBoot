package com.mahes.archit.spring;

import com.mahes.archit.spring.game.ContraGame;
import com.mahes.archit.spring.game.GameRunner;
import com.mahes.archit.spring.game.PacManGame;

public class App01GamingBasic {

    public static void main(String[] args) {
//        var marioGame = new MarioGame();
        var contraGame = new ContraGame();
        var pacmanGame = new PacManGame(); // 1: Object Creation

        // 2: Object creation + Wiring of dependencies
//        Game is a dependency of GameRunner
        var gameRunner = new GameRunner(pacmanGame);


        gameRunner.run();
    }
}
