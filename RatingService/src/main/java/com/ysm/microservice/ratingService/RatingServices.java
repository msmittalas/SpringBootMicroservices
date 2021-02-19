package com.ysm.microservice.ratingService;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ratings")
public class RatingServices {

	@GetMapping("/{movieId}")
	public Rating getRating(@PathVariable("movieId") String movieId)
	{
		return new Rating(movieId, 4);
	}
	
	
	@GetMapping("/users/{userId}")
	public  UserRating getRatings(@PathVariable("userId")String userId)
	{
		return UserRating.builder().userRatings( List.of(
				new Rating("121",4),
				new Rating("122",4),
				new Rating("123",4)
			)).userId(userId).build();
		
	}
}
