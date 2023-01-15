package com.xworkz.karnataka.thing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Camera {

	@Autowired
	private Lens lens;
	@Autowired
	private Battery battery;
	
	public Camera(){
		System.out.println("Registering Camera");
	}
	
	public void check(){
		System.out.println(this.lens.hashCode()+" "+this.battery.hashCode());
	}
}
