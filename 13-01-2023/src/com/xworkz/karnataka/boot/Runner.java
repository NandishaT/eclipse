package com.xworkz.karnataka.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.karnataka.Configuration.TaskConfiguration;
import com.xworkz.karnataka.thing.Movie;

public class Runner {
	public static void main(String[] args) {
	
		ApplicationContext contains=new AnnotationConfigApplicationContext(TaskConfiguration.class);

		System.out.println(Arrays.toString(contains.getBeanDefinitionNames()));

		Movie ref=contains.getBean(Movie.class);
		System.out.println(ref);
		ref.check();
	}

}
