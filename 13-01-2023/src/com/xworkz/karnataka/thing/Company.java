package com.xworkz.karnataka.thing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Company {

	@Autowired
	private Location location;
	
	public Company(){
		System.out.println("Created company");
	}
	
	public void check(){
		System.out.println(this.location.hashCode());
	}
}
