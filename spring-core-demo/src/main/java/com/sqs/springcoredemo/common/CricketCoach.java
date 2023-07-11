package com.sqs.springcoredemo.common;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class CricketCoach implements Coach {

    public CricketCoach() {
	System.out.println("In constructor: " + getClass().getSimpleName());
    }

    /*
     * Bean Lifecycle Methods
     * 
     * Init: method configuration
     */
    @PostConstruct
    public void doMyStartupStuff() {
	System.out.println("In doMyStartupStuff(): " + getClass().getSimpleName());
    }

    /*
     * Bean Lifecycle Methods
     * 
     * Destroy: method configuration
     */
    @PreDestroy
    public void doMyCleanupStuff() {
	System.out.println("In doMyCleanupStuff(): " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
	return "Pratice fast bowling for 15 minutes";
    }

}
