package com.example.demo;

import org.hibernate.validator.internal.metadata.raw.BeanConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import model.Tarantula;

@SpringBootApplication
public class TarantulaTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TarantulaTrackerApplication.class, args);
		
	}

}
