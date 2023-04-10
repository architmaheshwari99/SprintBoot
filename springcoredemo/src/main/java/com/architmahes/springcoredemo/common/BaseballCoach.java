package com.architmahes.springcoredemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class BaseballCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Dribble the ball";
    }
}
