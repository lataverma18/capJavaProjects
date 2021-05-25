package com.example.info.controllers;

public class MovieInfo {
	private String id;
	private String name;
	private int rating;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public MovieInfo(String id, String name, int rating) {
		super();
		this.id = id;
		this.name = name;
		this.rating = rating;
	}
	public MovieInfo() {
		
	}
}
