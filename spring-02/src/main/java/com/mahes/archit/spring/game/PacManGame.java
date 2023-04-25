package com.mahes.archit.spring.game;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PacManGame implements GamingConsole{
    @Override
    public void up() {
        System.out.println("Hello");
    }

    @Override
    public void down() {
        System.out.println("World");

    }

    @Override
    public void left() {

    }

    @Override
    public void right() {

    }
}
