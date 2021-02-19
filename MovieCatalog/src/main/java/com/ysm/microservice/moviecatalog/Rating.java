package com.ysm.microservice.moviecatalog;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data@AllArgsConstructor@NoArgsConstructor
public class Rating {

	String movieId;
	int rating;
	
}
