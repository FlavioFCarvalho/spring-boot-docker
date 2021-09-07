package com.reobonet.spring.boot.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@RestController
public class DockerApplication {
	
	@GetMapping("/message")
	public String getMessage() {
		return "Welcome to Spring Docker";
	}

	public static void main(String[] args) {
		SpringApplication.run(DockerApplication.class, args);
	}

}
