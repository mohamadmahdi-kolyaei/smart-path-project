package com.example.smartpath;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SmartPathApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmartPathApplication.class, args);
	}

}
