package com.ysm.microservice.moviecatalog;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {

	private String id;
	private String movieName;
	
}
