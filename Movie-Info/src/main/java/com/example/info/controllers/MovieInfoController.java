package com.example.info.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping("/infos")
public class MovieInfoController {
	@Autowired
	RestTemplate rtemp;
	
	@GetMapping("/{id}")
	@HystrixCommand(fallbackMethod ="getMovieInfoFallBack" )
	public MovieInfo getMovieInfo(@PathVariable("id") String id)
	{
		Movie m=rtemp.getForObject("http://movie-catalog-service/catalogs/"+id,Movie.class);
		Rating r=rtemp.getForObject("http://movie-rating-service/ratings/"+id,Rating.class);
		return new MovieInfo(id,m.getMovieName(),r.getRating());
		
	}
	public MovieInfo getMovieInfoFallBack(@PathVariable("id") String id)
	{
		return new MovieInfo(id,null,0); 
	}
}
