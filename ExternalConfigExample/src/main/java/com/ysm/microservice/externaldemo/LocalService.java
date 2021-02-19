package com.ysm.microservice.externaldemo;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("default")
public class LocalService implements ServiceInterface{

	
	public String getMesg()
	{
		
		return "Default MSg";
	}
}
