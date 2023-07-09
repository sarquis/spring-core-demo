package com.sqs.springcoredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * If I need to use outside custom packages.
 * @SpringBootApplication(scanBasePackages = { "com.sqs.springcoredemo", "com.sqs.util" })
 */
@SpringBootApplication
public class SpringcoredemoApplication {

    public static void main(String[] args) {
	SpringApplication.run(SpringcoredemoApplication.class, args);
    }

}
