package com.xworkz.configuration;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz")
public class TreeConfig {

	@Bean
	public String laptop(){
		System.out.println("Registering laptop");
		String string= new String();
		return string;
	}
	
	@Bean
	public String chair(){
		System.out.println("Registering chair");
		String string= new String();
		return string;
	}
	
	@Bean
	public String vechile(){
		System.out.println("Registering vechile");
		String string = new String();
		return string;
	}
	
	@Bean
	public String run(){
		System.out.println("Registering run");
		String string = new String();
		return string;
	}
	
	@Bean
	public String Remote(){
		System.out.println("Registering Remote");
		String string = new String();
		return string;
	}
	
	@Bean
	public  StringBuffer bike(){
		System.out.println("Registering bike");
		StringBuffer buffer= new StringBuffer();
		return buffer;
	}
	
	@Bean
	public  StringBuffer car(){
		System.out.println("Registering car");
		StringBuffer buffer= new StringBuffer();
		return buffer;
	}
	
	@Bean
	public  StringBuffer machine(){
		System.out.println("Registering machine");
		StringBuffer buffer= new StringBuffer();
		return buffer;
	}
	
	@Bean
	public  StringBuffer bottle(){
		System.out.println("Registering bottle");
		StringBuffer buffer= new StringBuffer();
		return buffer;
	}
	
	@Bean
	public  StringBuffer bus(){
		System.out.println("Registering bus");
		StringBuffer buffer= new StringBuffer();
		return buffer;
	}
	
	@Bean
	public StringBuilder road(){
		System.out.println("Registring road");
		StringBuilder builder= new StringBuilder();
		return builder;
	}
	
	@Bean
	public StringBuilder trip(){
		System.out.println("Registring trip");
		StringBuilder builder= new StringBuilder();
		return builder;
	}
	
	@Bean
	public StringBuilder river(){
		System.out.println("Registring river");
		StringBuilder builder= new StringBuilder();
		return builder;
	}
	
	@Bean
	public StringBuilder metro(){
		System.out.println("Registring metro");
		StringBuilder builder= new StringBuilder();
		return builder;
	}
	
	@Bean
	public StringBuilder station(){
		System.out.println("Registring station");
		StringBuilder builder= new StringBuilder();
		return builder;
	}
	
	@Bean
	public Boolean mobile(){
		System.out.println("Registring mobile");
		Boolean ref=new Boolean(true);
		return ref;
	}
	
	@Bean
	public Boolean book(){
		System.out.println("Registring book");
		Boolean ref=new Boolean(false);
		return ref;
	}
	
	@Bean
	public Boolean bank(){
		System.out.println("Registring bank");
		Boolean ref=new Boolean(true);
		return ref;
	}
	
	@Bean
	public Boolean loan(){
		System.out.println("Registring loan");
		Boolean ref=new Boolean(false);
		return ref;
	}
	
	@Bean
	public Boolean gold(){
		System.out.println("Registring gold");
		Boolean ref=new Boolean(true);
		return ref;
	}
	
	@Bean
	public Double music(){
		System.out.println("Registring music");
		Double ref1 = new Double(0.0);
		return ref1;
	}
	
	@Bean
	public Double instruments(){
		System.out.println("Registring instruments");
		Double ref1 = new Double(0.0);
		return ref1;
	}
	
	@Bean
	public Double dam(){
		System.out.println("Registring dam");
		Double ref1 = new Double(0.0);
		return ref1;
	}
	
	@Bean
	public Double file(){
		System.out.println("Registring file");
		Double ref1 = new Double(0.0);
		return ref1;
	}
	
	@Bean
	public Double folder(){
		System.out.println("Registring folder");
		Double ref1 = new Double(0.0);
		return ref1;
	}
	
	@Bean
	public Collection<Integer> collect(){
		System.out.println("Registring collection");
		Collection<Integer> collection = new ArrayList<Integer>();
		collection.add(100);
		collection.add(200);
		collection.add(300);
		collection.add(400);
		collection.add(500);
		return collection;
	}
	
	@Bean
	public Map<String, Integer> pair(){
		System.out.println("Registring map");
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("Laptop", 40);
		map.put("bag", 25);
		map.put("charger", 30);
		map.put("book", 45);
		map.put("pen", 2);
		return map;
	}
}
