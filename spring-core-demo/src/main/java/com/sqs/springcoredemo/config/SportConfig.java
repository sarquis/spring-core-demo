package com.sqs.springcoredemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sqs.springcoredemo.common.Coach;
import com.sqs.springcoredemo.common.SwimCoach;

/**
 * This class is for configuring Spring using our custom approach.
 */
@Configuration
public class SportConfig {

    /**
     * To configure a Bean.
     * 
     * The bean id defaults to the method name!
     * 
     * Dont need public.
     * 
     * @Bean("aquatic") for custom bean id.
     */
    @Bean
    Coach swimCoach() {
	return new SwimCoach();
    }
}
