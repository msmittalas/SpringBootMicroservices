package com.ysm.microservice.movieinfoservice;


import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/movies")
public class MovieInfoController {

	@Value("${api.key}")
	private String apiKey;
	@Autowired
	private RestTemplate template;
	
	@GetMapping("/{movieId}")
	public Movie getMovieInfo(@PathVariable("movieId")String movieId)
	{
		MovieSummary summary=template.getForObject("https://api.themoviedb.org/3/movie/"+movieId+"?api_key="+apiKey, MovieSummary.class);
		
		return new Movie(movieId,summary.getOriginal_title());
	}

	
}
