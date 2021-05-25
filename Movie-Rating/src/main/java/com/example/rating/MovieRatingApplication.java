package com.example.rating;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MovieRatingApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieRatingApplication.class, args);
	}

}
