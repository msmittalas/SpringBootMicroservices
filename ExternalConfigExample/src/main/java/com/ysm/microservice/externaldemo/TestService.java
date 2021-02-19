package com.ysm.microservice.externaldemo;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("test")
public class TestService implements ServiceInterface{

	
	public String getMesg()
	{
		
		return "Test MSg";
	}
}
