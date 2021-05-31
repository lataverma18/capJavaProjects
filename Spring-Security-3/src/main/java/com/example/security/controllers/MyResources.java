package com.example.security.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyResources {
	@GetMapping("/greet")
	public String greet()
	{
		return "Hello Everyone!!!";
	}
	
	@GetMapping("/user")
	public String user()
	{
		return "Hello User!!!";
	}

	@GetMapping("/admin")
	public String admin()
	{
		return "Hello Admin!!!";
	}
}
