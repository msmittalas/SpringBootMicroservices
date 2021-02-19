package com.ysm.microservice.movieinfoservice;


import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/movies")
@Slf4j
public class MovieInfoController {

	@Value("${api.key}")
	private String apiKey;
	@Autowired
	private RestTemplate template;
	
	@GetMapping("/{movieId}")
	public Movie getMovieInfo(@PathVariable("movieId")String movieId)
	{
		log.info("Movie Info Service start");
		MovieSummary summary=template.getForObject("https://api.themoviedb.org/3/movie/"+movieId+"?api_key="+apiKey, MovieSummary.class);
		log.info("Movie info Service end");
		return new Movie(movieId,summary.getOriginal_title());
	}

	
}
