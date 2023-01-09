package com.xworkz;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class piCode {
	public static void main(String[] args) {

		Map<Integer, String> pincode = new HashMap<Integer, String>();
		
		pincode.put(566523, "Majestic");
		pincode.put(566465, "BasaveshwarNagar");
		pincode.put(566039, "Rajajinagar");
		pincode.put(566375, "Mumbai Central");
		pincode.put(566543, "Delhi Central");
		pincode.put(566542, "Medigeshi");
		pincode.put(566432, "Hyderbad Central");
		pincode.put(566890, "Electronic City");
		pincode.put(566540, "Vijayanagar");
		pincode.put(560035, "kormagala");

		System.out.println("Loops Keys =================");
		Set<Integer> keys = pincode.keySet();
		keys.forEach(e -> System.out.println(e));

		System.out.println("\nLoop values=============");
		Collection<String> values = pincode.values();
		values.forEach(e -> System.out.println(e));

		System.out.println("\nLoop Entries =============");
		Collection<Entry<Integer, String>> entries = pincode.entrySet();
		System.out.println(entries);
		entries.forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));
	}
}
