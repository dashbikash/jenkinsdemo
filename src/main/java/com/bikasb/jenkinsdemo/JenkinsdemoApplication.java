package com.bikasb.jenkinsdemo;

import org.springframework.web.bind.annotation.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
public class JenkinsdemoApplication {

	@GetMapping("/")
	public String index(){
		return "Hello Jenkins from springboot.";
	}

	public static void main(String[] args) {
		SpringApplication.run(JenkinsdemoApplication.class, args);
	}

}
