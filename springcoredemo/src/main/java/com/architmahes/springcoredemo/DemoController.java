package com.architmahes.springcoredemo;

import com.architmahes.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach myCoach;
    private Coach anotherCoach;

    @Autowired
    public DemoController(@Qualifier("baseballCoach") Coach c1, @Qualifier("baseballCoach") Coach c2){
        myCoach = c1;
        anotherCoach = c2;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/checkScope")
    public String checkScope(){
        return "Comparing beans: " + (myCoach==anotherCoach);
    }
}
