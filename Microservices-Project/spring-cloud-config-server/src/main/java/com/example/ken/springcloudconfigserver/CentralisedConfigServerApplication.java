package com.example.ken.springcloudconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class CentralisedConfigServerApplication {

	public static void main(String[] args) {

		SpringApplication.run(CentralisedConfigServerApplication.class, args);
	}

}
