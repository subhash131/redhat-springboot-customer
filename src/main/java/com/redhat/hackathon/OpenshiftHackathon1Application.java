package com.redhat.hackathon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class OpenshiftHackathon1Application {
	
	@GetMapping("/")
	public String getMessage() {
		return "Hi, Im Alive";
	}

	public static void main(String[] args) {
		SpringApplication.run(OpenshiftHackathon1Application.class, args);
	}

}
