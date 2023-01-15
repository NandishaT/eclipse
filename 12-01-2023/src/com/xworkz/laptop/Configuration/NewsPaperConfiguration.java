package com.xworkz.laptop.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.laptop")
public class NewsPaperConfiguration {

	public NewsPaperConfiguration() {
		System.out.println("Registering NewsPaperConfiguration.");
	}

	@Bean
	public int NewsPaperno() {
		System.out.println("Registering no...");
		return 03;
	}

	@Bean
	public String newsPaperName() {
		System.out.println("Registering newsPaperName ");
		return "Vijaya Karnataka";
	}

	@Bean
	public String owner() {
		System.out.println("Registering owner ");
		return "Vijay";
	}

	@Bean
	public String lang() {
		System.out.println("Registering lang ");
		return "Kannada";
	}

	@Bean
	public double rate() {
		System.out.println("Registering rate ");
		return 2.2;
	}

}
