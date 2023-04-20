package com.mahes.archit.spring;

import com.mahes.archit.spring.game.ContraGame;
import com.mahes.archit.spring.game.GameRunner;
import com.mahes.archit.spring.game.PacManGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02GamingBasic {

    public static void main(String[] args) {

//        Launch a spring context
        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);


//        Configure the things we want Spring to manage-@Configuration
            System.out.println(context.getBean("name"));
    }
}
