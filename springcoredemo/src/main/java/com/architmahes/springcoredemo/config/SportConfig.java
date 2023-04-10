package com.architmahes.springcoredemo.config;

import com.architmahes.springcoredemo.common.Coach;
import com.architmahes.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean("aquatic")
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
