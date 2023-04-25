package com.mahes.archit.spring.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;



@Configuration
@ComponentScan("com.mahes.archit.spring.game")
public class App03GamingBasic {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(App03GamingBasic.class);
        context.getBean(GamingConsole.class).up();

        context.getBean(GameRunner.class).run();
    }
}
