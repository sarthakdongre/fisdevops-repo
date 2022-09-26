package com.example.fisuserbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FisdevopsApplication {

	public static void main(String[] args) {
		SpringApplication.run(FisdevopsApplication.class, args);
	}
	
	@GetMapping("/test1")
	public String test1() {
		return "test1 is working";
	}
	@GetMapping("/test2")
	public String test2() {
		return "test2 is working";
	}
	@GetMapping("/test3")
	public String test3() {
		return "test3 is working";
	}

}
