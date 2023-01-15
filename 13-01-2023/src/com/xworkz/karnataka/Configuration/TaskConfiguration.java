package com.xworkz.karnataka.Configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.karnataka")
public class TaskConfiguration {

	public TaskConfiguration(){
		System.out.println("Registering TaskConfiguration");
	}
}
