package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;


@SpringBootApplication

public class Demo10Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo10Application.class, args);
	}
	
	 @Bean 
	 public Docket api() 
	 { 
		 return new Docket(DocumentationType.SWAGGER_2)
	 .select()
	 .apis(RequestHandlerSelectors.basePackage("com.example.demo.controllers"))
	  .paths(PathSelectors.any()) 
	  .build();
	 }
	 
	
	 private ApiInfo apiDetails() 
	 { 
		 return new ApiInfo("My Swagger Project","Creating Docs for REST API","1.0",null,null,null,null); 
	 }
	 
}
