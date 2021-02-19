package com.ysm.junitdemo;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

	
	public void hello() 
	{
		String s1=null;
		
		s1.chars();
	}
	
	public String getMessage()
	{
		return Math.random()+"";
		
	}
}
