package com.git.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootGitExApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootGitExApplication.class, args);
	}

	@GetMapping("/message")
	public String print(){
		return "git Example with sprint boot";
	}
}
