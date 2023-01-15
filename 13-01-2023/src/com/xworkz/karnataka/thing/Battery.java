package com.xworkz.karnataka.thing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Battery {

	@Autowired
	private Capacity capacity;
	
	public Battery(){
		System.out.println("Registring Battery");
	}
	
	public void check(){
		System.out.println(this.capacity.hashCode());
	}
	
}
