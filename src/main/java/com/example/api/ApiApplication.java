package com.example.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ApiApplication {

	public static void main(String[] args) {
		
		ConfigProperties properties = new ConfigProperties();
		properties.config();
		SpringApplication.run(ApiApplication.class, args);
	}

}
