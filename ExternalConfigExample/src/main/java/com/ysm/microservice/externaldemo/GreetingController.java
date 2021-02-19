package com.ysm.microservice.externaldemo;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class GreetingController {

	@Value("${my.greeting}")
	String msg;
	@Value("${app.missing:default value }")
	String appName;
	@Value("${app.data.lst}")
	private List<String> data;
	@Value("#{${app.jsondata}}")
	private Map<String,String> jsonMap;
	@Autowired
	private DBProperties dbprop;
	@Autowired
	private ServiceInterface iter;
	@GetMapping
	public String getMessage()
	{
		
		return msg+"--"+appName+"  "+data+"--"+jsonMap+"----"+dbprop.getConnection()+"==="+iter.getMesg();
		
	}
}
