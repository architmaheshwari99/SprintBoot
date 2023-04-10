package com.architmahes.springcoredemo;

import com.architmahes.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach myCoach;

//    @Autowired
//    public DemoController(Coach c){
//        myCoach = c;
//    }

//    Setter Injection
    @Autowired
    public void setCoach(Coach c){
//        public void XYZCoach(Coach c){ -> no name strictness here
        myCoach = c;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }
}
