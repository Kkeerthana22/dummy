package com.capg.spring.boot.capstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.capg.spring.boot.capstore")
public class CapstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(CapstoreApplication.class, args);
	}
}
