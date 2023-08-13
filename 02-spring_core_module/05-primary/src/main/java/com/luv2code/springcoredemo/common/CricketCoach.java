package com.luv2code.springcoredemo.common;

import org.springframework.stereotype.Component;

// makes this class as spring bean and avaiable for dependency injection
@Component
public class CricketCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Practice Fast Bowling for 15 minutes ";
    }
}
