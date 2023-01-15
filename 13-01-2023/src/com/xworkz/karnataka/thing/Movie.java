package com.xworkz.karnataka.thing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Movie {

	@Autowired
	private Director director;
	@Autowired
	private CameraMan cameraMan;
	@Autowired
	private Producer producer;
	
	public Movie(){
		System.out.println("Registering Movie");
	}
	
	public void check(){
		System.out.println(this.director.hashCode()+" "+
	this.cameraMan.hashCode()+" "+
				this.producer.hashCode());
	}
}
