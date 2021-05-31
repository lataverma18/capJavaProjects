package com.example.security.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@GetMapping("/greet")
	public String sayHi()
	{
		return "Hi";
	}
	
	@GetMapping("/admin")
	public String sayAdmin()
	{
		return "Hi, Admin!!!";
	}
}
