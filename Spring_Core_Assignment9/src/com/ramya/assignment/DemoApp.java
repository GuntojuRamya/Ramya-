package com.ramya.assignment;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoApp 
{

	public static void main(String[] args)
	{
		ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("sample.xml");
		Person person=context.getBean("personBean",Person.class);
		System.out.println("Name= "+ person.getName());
		
		//closing the context object
		context.close();
	}

}
