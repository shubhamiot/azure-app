package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AzureWebAppApplication {
	
	@GetMapping("/message")
	public String getMessage()
	{
		return "Hello";
	}
	

	@GetMapping("/message1")
	public String getMessage1()
	{
		return "Hello1";
	}

	@GetMapping("/message2")
	public String getMessage2()
	{
		return "Hello2";
	}

	@GetMapping("/message3")
	public String getMessage3()
	{
		return "Hello3";
	}

	public static void main(String[] args) {
		SpringApplication.run(AzureWebAppApplication.class, args);
	}

}
