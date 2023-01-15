package com.xworkz.laptop.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.laptop")
public class SnakeConfiguration {

	public SnakeConfiguration() {
		System.out.println("Registering SnakeConfiguration");
	}

	@Bean
	public String snakeName() {
		System.out.println("Registering snakeName ");
		return "Cobra";

	}

	@Bean
	public double snakeLength() {
		System.out.println("Registering snakeLength ");
		return 4.5;

	}

	@Bean
	public String snakeColor() {
		System.out.println("Registering snakeColor ");
		return "Brown";

	}

	@Bean
	public String snakeType() {
		System.out.println("Registering snakeType ");
		return "venomous";

	}

	@Bean
	public boolean snakePoisonous() {
		System.out.println("Registering snakePoisonous ");
		return true;

	}

}
