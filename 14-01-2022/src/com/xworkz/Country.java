package com.xworkz;

//import java.security.KeyStore.Entry;
import java.util.*;
import java.util.Map;
import java.util.Map.Entry;

import javax.naming.ldap.SortKey;

public class Country {

	public static void main(String[] args) {
		
		Map<String,String> countries=new HashMap<String,String>();
		countries.put("Albania", "Bajram Begaj");
        countries.put("Algeria", "Abdelmadjid Tebboune");
        countries.put("Angola", "Joao Lourenço");
        countries.put("Argentina", "Alberto Fernandez");
        countries.put("Armenia", "Vahagn Khachaturyan");
        countries.put("Austria", "Alexander Van der Bellen");
        countries.put("Azerbaijan", "Ilham Aliyev");
        countries.put("Bangladesh", "Abdul Hamid");
        countries.put("Barbados", " Dame Sandra Mason");
        countries.put("Belarus", "Alexander Lukashenko");
        countries.put(" Benin", "Patrice Talon");
        countries.put("Bolivia", "Luis Arce");
        countries.put("Botswana", "Mokgweetsi Masisi");
        countries.put("Brazil", "Luiz Inacio Lula da Silva");
        countries.put("Bulgaria", "Rumen Radev");
        countries.put("Burundi", "Evariste Ndayishimiye");
        countries.put("Cameroon", "Paul Biya");
        countries.put("Cape Verde", "Jose Maria Neves");
        countries.put("Chad", "Mahamat Deby");
        countries.put("Chile", "Gabriel Boric");

        System.out.println(countries.size());
        System.out.println("Before sorting");
       Collection<Entry<String,String>> entries=countries.entrySet();
       //System.out.println(entries);
       entries.forEach(e -> System.out.println(e.getKey() + ":" + e.getValue()));
       
       System.out.println("-------sort by keys-------------------");
       countries.entrySet()
       .stream()
       .sorted(Map.Entry.<String, String> comparingByKey())
       .forEach((country)->System.out.println(country.getKey()+":"+country.getValue()));
       
       countries.forEach((key, value) -> {

			if (key.length() > 10) {
				countries.replace(key, "mee");
				System.out.println(key + " : " + value);
			}
		});

       
        
	}

}
