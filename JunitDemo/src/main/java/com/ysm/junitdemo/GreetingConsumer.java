package com.ysm.junitdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.Data;
import lombok.NoArgsConstructor;

@Service
@Data@NoArgsConstructor
public class GreetingConsumer {

	
	@Autowired
	GreetingService service;
	
	
	public String getInfo()
	{
		
		service.hello();
		return service.getMessage();
	}
	
	
}
