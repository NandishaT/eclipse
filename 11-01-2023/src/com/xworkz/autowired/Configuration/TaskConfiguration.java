package com.xworkz.autowired.Configuration;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.spring")
public class TaskConfiguration {

	public TaskConfiguration() {
		System.out.println("Created TaskConfiguration...");
	}

	@Bean
	public int number() {
		System.out.println("Registering number...");
		return 10;
	}

	@Bean
	public String name() {
		System.out.println("Registering hesaru...");
		return "SLV hardware";
	}

	@Bean
	public String gstnumber() {
		System.out.println("Registering gstnumber...");
		return "GSTIN5322";
	}

	@Bean
	public String owner() {
		System.out.println("Registering owner...");
		return "Ajay";
	}

	@Bean
	public String address() {
		System.out.println("Registering address...");
		return "Bengaluruu,560021";
	}

	@Bean
	public String electric() {
		System.out.println("Registering electric...");
		return "Spring";
	}

	@Bean
	public double vers() {
		System.out.println("Registering vers...");
		return 5.3;
	}

	@Bean
	public String laptop() {
		System.out.println("Registering laptop...");
		return "laptop";
	}

	@Bean
	public LocalDate Date() {
		System.out.println("Registering Date...");
		LocalDate ref = LocalDate.of(2000, 12, 1);
		return ref;
	}

	@Bean
	public boolean Election() {
		System.out.println("Registering Election...");
		return true;
	}

	@Bean
	public String Tree() {
		System.out.println("Registering Tree...");
		return "Tree";
	}

	@Bean
	public double sambala() {
		System.out.println("Registering sambala...");
		return 30000.0;
	}

	@Bean
	public String office() {
		System.out.println("Registering office...");
		return "TCS";
	}

	@Bean
	public double years() {
		System.out.println("Registering years...");
		return 3.5;
	}

	@Bean
	public String sisa() {
		System.out.println("Registering sisa...");
		return "Nataraja";
	}

	@Bean
	public String yavPencil() {
		System.out.println("Registering yavPencil...");
		return "Bariyodu";
	}

	@Bean
	public double rate() {
		System.out.println("Registering rate...");
		return 10;
	}

	@Bean
	public String studentName() {
		System.out.println("Registering studentName...");
		return "Virat";
	}

	@Bean
	public byte hemanth() {
		System.out.println("Registering hemanth...");
		return 12;
	}

	@Bean
	public short standard() {
		System.out.println("Registering standard...");
		return 7;
	}

	@Bean
	public int no() {
		System.out.println("Registering no...");
		return 27;
	}

	@Bean
	public long mobile() {
		System.out.println("Registering mobile...");
		return 990000000;
	}

	@Bean
	public float weight() {
		System.out.println("Registering weight...");
		return 5.2f;
	}

	@Bean
	public double cost() {
		System.out.println("Registering cost...");
		return 50;
	}

	@Bean
	public char sec() {
		System.out.println("Registering sec...");
		return 'A';
	}

	@Bean
	public boolean result() {
		System.out.println("Registering result...");
		return true;
	}

}