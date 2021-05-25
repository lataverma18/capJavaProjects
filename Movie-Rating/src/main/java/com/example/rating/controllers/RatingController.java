package com.example.rating.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("ratings")
public class RatingController {
	List<Rating> lrating=new ArrayList<Rating>();
	public RatingController()
	{
		lrating.add(new Rating("m01",4));
		lrating.add(new Rating("m02",3));
		lrating.add(new Rating("m03",5));
		lrating.add(new Rating("m04",4));
		lrating.add(new Rating("m05",5));
	}
	
	@GetMapping("/{id}")
	public Rating getRatingById(@PathVariable("id") String id)
	{
		return lrating.stream().filter(obj->obj.getMovieId().equals(id)).findFirst().get();
	}
}
