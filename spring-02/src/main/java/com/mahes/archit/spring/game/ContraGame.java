package com.mahes.archit.spring.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("ContraGameQualifier")
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
