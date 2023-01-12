package com.xwork.bean.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Season {
	private String name;
	private double duration;
	private String startingmonth;

	public Season() {
		System.out.println("Running season");
	}

	public String getName() {
		return name;
	}

	@Value("Winter")
	public void setName(String name) {
		this.name = name;
	}

	public double getDuration() {
		return duration;
	}

	@Value("4")
	public void setDuration(double duration) {
		this.duration = duration;
	}

	public String getStartingMonth() {
		return startingmonth;
	}

	@Value("oct")
	public void setStatringMonth(String startingMonth) {
		this.startingmonth = startingMonth;
	}
}
