package com.ken.currencyexchangeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CurrencyExchangeServiceApplication {
	public static void main(String[] args) {

		SpringApplication.run(CurrencyExchangeServiceApplication.class, args);
	    System.out.println("Currency Exchange service started");
	}

}
