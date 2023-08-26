package com.example.ken.limitsmicroservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LimitsMicroservicesApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext ctx = SpringApplication.run(LimitsMicroservicesApplication.class, args);

		System.out.println("Spring boot limits-microservice launched");
	}

}
