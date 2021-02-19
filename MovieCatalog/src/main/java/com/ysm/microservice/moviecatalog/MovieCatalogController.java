package com.ysm.microservice.moviecatalog;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;


@RestController
@RequestMapping("/catalog/")
public class MovieCatalogController {

	@Autowired
	private RestTemplate template;

	
	@GetMapping("{userId}")
	public List<CatalogItem> getCatalog(@PathVariable("userId") String userId)
	{
		UserRating ratings=template.getForObject("http://rating-service/ratings/users/"+userId, UserRating.class);
		List<CatalogItem> catalog=ratings.getUserRatings().stream().map((r) -> {
			Movie movie=template.getForObject("http://movie-info-service/movies/"+r.getMovieId(), Movie.class);
			return 	new CatalogItem(movie.getMovieName(), "Desc", r.getRating());
		
		}).collect(Collectors.toList());
		
		return catalog;
		
	}
}
/*
 * 
 *
			Movie movie=webClient.build()
			.get()
			.uri("http://localhost:8082/movies/"+r.getMovieId())
			.retrieve()
			.bodyToMono(Movie.class)
			.block();
			** 
 * 
 * */
 