package com.gloire.HelloJenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloJenkinsApplication {
	@GetMapping
	public String welcome(){
		return "welcome to our first jenkins integration";
	}

	public static void main(String[] args) {
		SpringApplication.run(HelloJenkinsApplication.class, args);
	}

}
