package com.xworkz.Mvc.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.Mvc")
public class SpringBeanConfiguration {

	public SpringBeanConfiguration() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

}
 43 
