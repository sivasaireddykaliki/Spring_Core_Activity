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

    //define our init method
    @PostConstruct
    public void doMyStartupStuff() {
        System.out.println("In doMyStartupStuff(): "+getClass().getSimpleName());
    }

    @PreDestroy
    public void doMyCleanupStuff() {
        System.out.println("In doMyCleanupStuff(): "+getClass().getSimpleName());
    }

    //define our destroy method

    @Override
    public String getDailyWorkout() {
        return "Practice Fast Bowling for 15 minutes ";
    }
}
