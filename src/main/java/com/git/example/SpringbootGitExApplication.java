package com.git.example;

import com.git.example.entity.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	@GetMapping("/getUserDetails/{id}/{name}")
	public User callUser(@PathVariable int id,@PathVariable String name){
		return new User();
	}
	@GetMapping("/getUserDetails/{id}/{name}")
	public User callUser1(@PathVariable int id,@PathVariable String name){
		return new User();
	}
}
