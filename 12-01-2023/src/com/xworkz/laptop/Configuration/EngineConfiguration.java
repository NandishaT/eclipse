package com.xworkz.laptop.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.laptop")
public class EngineConfiguration {

	public EngineConfiguration() {
		System.out.println("Registering EngineConfiguration ");
	}

	@Bean
	public String engineName() {
		System.out.println("Registering engineName");
		return "Activa";
	}

	@Bean
	public String engineType() {
		System.out.println("Registering engineType");
		return "Petrol";
	}

	@Bean
	public int engineNumber() {
		System.out.println("Registering engineNumber");
		return 54235;
	}

	@Bean
	public double engineVersion() {
		System.out.println("Registering engineVersion");
		return 5.4;
	}

	@Bean
	public String engineCompany() {
		System.out.println("Registering engineCompany");
		return "Honda";
	}

	@Bean
	public int engineStroke() {
		System.out.println("Registering engineStroke");
		return 2;
	}

}
