package com.ysm.junitdemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;

import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;



@ExtendWith(MockitoExtension.class)
public class GreetingServiceTestr  {

	
	
	GreetingService service=new GreetingService();
	
	@InjectMocks
	GreetingConsumer consumer;
	
	@Test
	public void testvoidmetho()
	{
		service=spy(GreetingService.class); 
		consumer.setService(service);
		Mockito.mockStatic(Math.class).when(Math::random).thenReturn(100);
		doNothing().when(service).hello();
			//doCallRealMethod().when(service).hello();
			//doNothing().when(service).hello();
			//Mockito.when(service.getMessage()).thenReturn("Hello");
			//assertThrows(NullPointerException.class, () ->{String msg=consumer.getInfo();});
			assertEquals("1000", consumer.getInfo());
	}
	
}
