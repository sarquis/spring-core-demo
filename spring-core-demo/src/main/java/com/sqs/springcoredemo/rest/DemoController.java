package com.sqs.springcoredemo.rest;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sqs.springcoredemo.common.Coach;

/*
 * Field Injection Not recommended.
 *  
 * Not recommended by spring.io team. Makes the code harder to unit test.
 * 
 * @Autowired private Coach myCoach
 * 
 * Constructor Injection
 * 
 * @Autowired public DemoController(Coach theCoach) { this.myCoach = theCoach; }
 * 
 * @Autowired This anottation is optional, no need. Only need when you have more
 * than one contructor.
 * 
 * Which Injection Type sould I use?
 * 
 * Constructor Injection - Use this when you have requided dependencies. -
 * Generally recommended by the spring.io development team as first choice.
 * 
 * Setter Injection - Use this when you have optional dependencies. - If
 * dependency is not provided, your app can provide reasonable default logic.
 * 
 * 
 */
@RestController
public class DemoController {

    private Coach myCoach;
    private Coach anotherCoach;

    // @Autowired desnecessário. É automatico no construtor.
    public DemoController(@Qualifier("cricketCoach") Coach theCoach, @Qualifier("cricketCoach") Coach theAnotherCoach) {
	System.out.println("In constructor: " + getClass().getSimpleName());
	myCoach = theCoach;
	anotherCoach = theAnotherCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
	return myCoach.getDailyWorkout();
    }

    @GetMapping("/check")
    public String check() {
	return "Comparing beans: myCoach == anotherCoach, " + (myCoach == anotherCoach);
    }

}
