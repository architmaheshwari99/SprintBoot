package com.architmahes.springcoredemo.common;

public class SwimCoach implements Coach{

    public SwimCoach(){
        System.out.println(getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Swim 1k as a warmup";
    }
}
