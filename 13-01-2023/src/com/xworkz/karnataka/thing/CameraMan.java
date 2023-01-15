package com.xworkz.karnataka.thing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CameraMan {

	@Autowired
	private Camera camera;
	
	public CameraMan(){
		System.out.println("Registering CameraMan");
	}
	
	public void check(){
		System.out.println(this.camera.hashCode());
	}
}
