package com.xworkz.laptop.Configuration;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.laptop.thing.Gender;

@Configuration
@ComponentScan("com.xworkz.laptop")
public class GhostConfiguration {

	@Bean
	public String ghostName() {
		System.out.println("Registering ghostname ");
		return "xyz";

	}

	@Bean
	public byte ghostAge() {
		System.out.println("Registering ghostAge ");
		return 99;
	}

	@Bean
	public short ghostHeigth() {
		System.out.println("Registering ghostHeigth ");
		return 6;

	}

	@Bean
	public double ghostWeight() {
		System.out.println("Registering ghostWeight ");
		return 60;

	}

	@Bean
	public long ghostPhNo() {
		System.out.println("Registering ghostPhNo ");
		return 900000000;

	}

	@Bean
	public float ghostNoOflegs() {
		System.out.println("Registering ghostNoOflegs ");
		return 4f;

	}

	@Bean
	public int ghostNoOfHands() {
		System.out.println("Registering ghostNoOfHands ");
		return 4;

	}

	@Bean
	public boolean ghostAlive() {
		System.out.println("Registering ghostAlive ");
		return true;

	}

	@Bean
	public Gender ghostGender() {
		System.out.println("Registering ghostGender ");
		return Gender.Male;

	}

	@Bean
	public LocalDate ghostDOB() {
		System.out.println("Registering ghostDOB ");
		return LocalDate.of(2000, 12, 23);

	}

	@Bean
	public LocalDate ghostDOD() {
		System.out.println("Registering ghostDOB ");
		return LocalDate.of(2020, 12, 23);

	}

	@Bean
	public String ghostDress() {
		System.out.println("Registering ghostDress ");
		return "adfffsa";

	}

	@Bean
	public String ghostColor() {
		System.out.println("Registering ghostColor ");
		return "White";

	}

	@Bean
	public String ghostEducation() {
		System.out.println("Registering ghostEducation ");
		return "SSLC";

	}

}
