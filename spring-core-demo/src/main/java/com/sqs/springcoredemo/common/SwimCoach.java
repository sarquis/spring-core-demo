package com.sqs.springcoredemo.common;

// I'm not using a component annotation here on purpose.
// This is to show how to use a bean anotation;
public class SwimCoach implements Coach {

    public SwimCoach() {
	System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
	return "Swim 1000 meters as a warm up";
    }

}
