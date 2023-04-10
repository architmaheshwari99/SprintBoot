package com.architmahes.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//spring.main.lazy_initialization=true in application.properties for global scope
@Component
public class BaseballCoach implements Coach{

    @PostConstruct
    public void startUpStuff(){
        System.out.println("DO start up stuff "+ getClass().getSimpleName());
    }

    @PreDestroy
    public void cleanUpStuff(){
        System.out.println("DO clean up stuff "+ getClass().getSimpleName());
    }


    @Override
    public String getDailyWorkout() {
        return "Dribble the ball";
    }
}
