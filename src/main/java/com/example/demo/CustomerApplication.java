package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
public class CustomerApplication {

	@GetMapping("/")
	public String getMessage() {
		return "Hi, Im Alive";
	}

	public static void main(String[] args) {
		SpringApplication.run(CustomerApplication.class, args);
	}

}
