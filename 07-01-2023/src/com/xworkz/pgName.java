package com.xworkz;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class pgName {

	public static void main(String[] args) {
		Map<String,Integer> map = 
				new HashMap<String,Integer>();
		map.put("venkateshwara", 5000);
		map.put("Abhi", 5500);
		map.put("boyspg", 5500);
		map.put("Amit", 5800);
		map.put("vijay", 56500);
		map.put("rahul", 6000);
		map.put("ravi", 5800);
		map.put("rohit", 5070);
		map.put("xyz", 6500);
		map.put("sdfj", 6000);
		
		
		System.out.println("Loop keys==========");
		Set<String> keys = map.keySet();
		keys.forEach(e -> System.out.println(e));

		System.out.println("\nLoop values=========");
		Collection<Integer> values = map.values();
		values.forEach(e -> System.out.println(e));

		for(Map.Entry m:map.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
	}

	
}
