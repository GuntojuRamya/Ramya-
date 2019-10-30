package com.ramya.assignment;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.ramya.assignment")
public class ApplicationConfigure
{
	Item item=new Item();
	@Bean(name="item1")
	public Item item1()
	{
		item.setItemName("Chocolate");
		item.setItemPrice("500");
		return item;
	}
	
	@Bean(name="item2")
	public Item item2()
	{
		return item;
	}
	
	@Bean(name="item3")
	public Item item3()
	{
		return item;
	}
}
