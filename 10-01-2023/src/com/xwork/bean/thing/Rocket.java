package com.xwork.bean.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Rocket {
	@Value("Indid")
	private String country;
	@Value("Chdrayana")
	private String name;
	@Value("34.6")
	private double budget;

	public Rocket() {
		System.out.println("Running Rocket");
	}

	public String getCountry() {
		return country;
	}

	public String getname() {
		return name;
	}

	public double getBudget() {
		return budget;
	}
}
