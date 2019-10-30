package com.ramya.assignment;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main 
{
	public static void main(String[] args)
	{
		ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("sample.xml");
		Customer customer=(Customer) context.getBean("c1");
		System.out.println(customer);
		context.close();
	}
}
