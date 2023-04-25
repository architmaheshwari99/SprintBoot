package com.mahes.archit.spring.game;

public class MarioGame implements GamingConsole{

    public void up() {
        System.out.println("Jump");
    }

    public void down() {
        System.out.println("Hole");
    }

    public void left() {
        System.out.println("Left");
    }

    public void right() {
        System.out.println("right");
    }
}
