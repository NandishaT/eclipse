package com.xwork.bean.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xwork.bean.thing.Actor;
import com.xwork.bean.thing.Rocket;
import com.xwork.bean.thing.Season;

@Configuration
@ComponentScan("com.xwork.bean")
public class TaskConfig {

	public TaskConfig() {
		System.out.println("Created TaskConfig");
	}

	@Bean
	public Season cold() {
		System.out.println("Registering Season");
		Season season = new Season();
		return season;
	}

	@Bean
	public Rocket jacket() {
		System.out.println("Registering New Rocket");
		Rocket rocket = new Rocket();
		return rocket;
	}

	@Bean
	public Actor hero() {
		System.out.println("Registering new Actor");
		Actor actor = new Actor("Dr Puneeth raj", "Kannada", 48);
		return actor;
	}

}
