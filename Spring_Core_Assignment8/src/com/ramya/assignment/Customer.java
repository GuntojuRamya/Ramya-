package com.ramya.assignment;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Customer 
{
	String message;

	public String getMessage()
	{
		return message;
	}

	public void setMessage(String message) 
	{
		this.message = message;
	}
	@PostConstruct
	public void initialisingBean() throws Exception
	{
		System.out.println("After initialising the bean, the message is :" + message);
	}
	@PreDestroy
	public void disposableBean() throws Exception
	{
		System.out.println("Bean is successfully cleaned");
	}


	
}
