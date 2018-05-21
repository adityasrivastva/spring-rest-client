package com.aditya.techunt.rest.spring_rest_client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication(scanBasePackages= {"com.aditya.techunt"})
public class HelloWorldSpringBootApp 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(HelloWorldSpringBootApp.class, args);
    }
}
