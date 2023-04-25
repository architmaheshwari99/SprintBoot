package com.mahes.archit.spring.game;

public class ContraGame implements GamingConsole{

    public void up() {
        System.out.println("up");
    }

    public void down() {
        System.out.println("sit");
    }

    public void left() {
        System.out.println("back");
    }

    public void right() {
        System.out.println("shoot");
    }
}
