package com.xworkz.karnataka.thing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Experience {

	@Autowired
	private Skill skill;
	
	public Experience(){
		System.out.println("Registering Experience");
	}
	
	public void check(){
		System.out.println(this.skill.hashCode());
	}
}
