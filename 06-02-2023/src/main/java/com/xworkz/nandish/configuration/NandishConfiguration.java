package com.xworkz.nandish.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.nandish")
public class NandishConfiguration {

	public NandishConfiguration() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
}
