package com.xworkz.laptop.thing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Engine {

	private String name;

	private String type;

	@Autowired
	@Qualifier("engineNumber")
	private int num;

	@Autowired
	@Qualifier("engineVersion")
	private double version;

	private String company;

	private int Stroke;

	public Engine(@Qualifier("engineName") String name, @Qualifier("engineType") String type,
			@Qualifier("engineCompany") String company) {
		super();
		this.name = name;
		this.type = type;
		this.company = company;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public int getNum() {
		return num;
	}

	public double getVersion() {
		return version;
	}

	public String getCompany() {
		return company;
	}

	@Autowired
	@Qualifier("engineStroke")
	public void setStroke(int Stroke) {
		this.Stroke = Stroke;
	}

	public int getStroke() {
		return Stroke;
	}

}
