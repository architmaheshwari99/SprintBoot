package com.mahes.archit.spring;

import com.mahes.archit.spring.game.ContraGame;
import com.mahes.archit.spring.game.GameRunner;
import com.mahes.archit.spring.game.GamingConsole;
import com.mahes.archit.spring.game.PacManGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GameConfiguration {

    @Bean
    public GamingConsole game() {
        return new PacManGame();
    }

    @Bean
    public GameRunner gameRunner(GamingConsole game) {
        return new GameRunner(game);
    }

//    var contraGame = new ContraGame();
//    var pacmanGame = new PacManGame(); // 1: Object Creation
//
//    // 2: Object creation + Wiring of dependencies
////        Game is a dependency of GameRunner
//    var gameRunner = new GameRunner(pacmanGame);
//
//
//        gameRunner.run();


}
