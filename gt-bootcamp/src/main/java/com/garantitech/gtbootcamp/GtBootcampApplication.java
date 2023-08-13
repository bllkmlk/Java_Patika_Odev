package com.garantitech.gtbootcamp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GtBootcampApplication {

	public static void main(String[] args) {
		System.out.println("GT APP is Starting..");
		SpringApplication.run(GtBootcampApplication.class, args);
		System.out.println("GT APP is started");
	}
}