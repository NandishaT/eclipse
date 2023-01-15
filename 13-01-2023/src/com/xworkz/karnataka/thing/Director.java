package com.xworkz.karnataka.thing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Director {

	@Autowired
	private Experience experience;
	
	public Director(){
		System.out.println("Registering Director");
	}
	
}