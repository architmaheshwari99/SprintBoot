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

    @Override
    public String getDailyWorkout() {
        return "Dribble the ball";
    }
}
