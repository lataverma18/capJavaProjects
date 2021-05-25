package com.example.catalog.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("catalogs")
public class MovieController {
	List<Movie> movies=new ArrayList<>();
	
	public MovieController()
	{
		movies.add(new Movie("m01","Jab We Met"));
		movies.add(new Movie("m02","3 Idiots"));
		movies.add(new Movie("m03","Radhe"));
		movies.add(new Movie("m04","Ashoka"));
		movies.add(new Movie("m05","HDDCS"));
	}
	
	@GetMapping("/{id}")
	public Movie getMovie(@PathVariable("id") String mid)
	{
		return movies.stream().filter(obj->obj.getMovieId().equals(mid)).findFirst().get();
	}
}
