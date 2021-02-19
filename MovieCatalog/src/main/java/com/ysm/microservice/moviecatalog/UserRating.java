package com.ysm.microservice.moviecatalog;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor@NoArgsConstructor
public class UserRating {

	
	List<Rating> userRatings;
	String userId;
	
}
