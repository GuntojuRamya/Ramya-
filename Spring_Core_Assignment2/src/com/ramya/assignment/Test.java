package com.ramya.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{

	public static void main(String[] args)
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("sample.xml");
		Question question=(Question) context.getBean("collection");
		System.out.println("List: "+question.getAnswer1());
		System.out.println("Set: "+question.getAnswer2());
		System.out.println("Map: "+question.getAnswer3());
		
	}

}
