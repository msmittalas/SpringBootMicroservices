package com.ysm.microservice.ratingService;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data@AllArgsConstructor
public class Rating {

	String movieId;
	int rating;
	
}
