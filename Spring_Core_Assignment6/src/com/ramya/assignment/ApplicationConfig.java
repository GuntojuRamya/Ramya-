package com.ramya.assignment;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages="com.ramya.assignment")
@PropertySource(value="dbconfig.properties")
public class ApplicationConfig 
{

}
