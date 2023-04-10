package com.architmahes.springcoredemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

//spring.main.lazy_initialization=true in application.properties for global scope
@Component
public class BaseballCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Dribble the ball";
    }
}
