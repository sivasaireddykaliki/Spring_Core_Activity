package com.luv2code.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

// makes this class as spring bean and avaiable for dependency injection
@Component
public class CricketCoach implements Coach{

    public CricketCoach() {
        System.out.println("In constructor : "+ getClass().getSimpleName());
    }


    @Override
    public String getDailyWorkout() {
        return "Practice Fast Bowling for 15 minutes ";
    }
}
