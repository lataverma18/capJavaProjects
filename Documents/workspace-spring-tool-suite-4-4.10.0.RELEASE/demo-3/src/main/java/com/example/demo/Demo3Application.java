package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;

import com.example.demo.beans.UserBean;

@SpringBootApplication
@PropertySource("classpath:/application.properties")
public class Demo3Application {

	public static void main(String[] args) {
		ApplicationContext ac=SpringApplication.run(Demo3Application.class, args);
		UserBean ub=(UserBean)ac.getBean("userBean");
		System.out.println(ub.getId()+"\t"+ub.getName());
	}
}
