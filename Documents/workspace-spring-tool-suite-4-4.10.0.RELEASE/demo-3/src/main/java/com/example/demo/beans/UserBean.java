package com.example.demo.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class UserBean {
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	@Value("${uid}")
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	@Value("${uname}")
	public void setName(String name) {
		this.name = name;
	}
}