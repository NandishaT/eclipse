package xworkz.com;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class WeaponRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
	WeaponDTO dto1 = new WeaponDTO("anthrax", "Egypt ", LocalDate.of(1769, 02, 23), 200D, WeaponType.Biologicalweaponry);
	WeaponDTO dto2 = new WeaponDTO("depth charge", "British", LocalDate.of(1916, 01, 01), 183D, WeaponType.Bombs);
	WeaponDTO dto3 = new WeaponDTO("nerve gas", "Germany", LocalDate.of(1938, 04, 21), 43D, WeaponType.Chemicalweaponry);
	WeaponDTO dto4 = new WeaponDTO("plague", "Europe ", LocalDate.of(1351, 8, 31), 556D, WeaponType.Biologicalweaponry);
	WeaponDTO dto5 = new WeaponDTO("dirty bomb", "Iraq", LocalDate.of(1987, 01, 01), 63D, WeaponType.Bombs);
	WeaponDTO dto6 = new WeaponDTO("antiaircraft gun", "U.S. Army's", LocalDate.of(1910, 02, 12), 455D, WeaponType.Atillery);
	WeaponDTO dto7 = new WeaponDTO("lewisite", "America's", LocalDate.of(1918, 11, 9), 183D, WeaponType.Chemicalweaponry);
	WeaponDTO dto8 = new WeaponDTO("shrapnel","British ",LocalDate.of(1996, 04, 03), 150D, WeaponType.Bombs);
	WeaponDTO dto9 = new WeaponDTO("mortar", "North Korea", LocalDate.of(1824,12, 11), 650D, WeaponType.Atillery);
	WeaponDTO dto10 = new WeaponDTO("Q fever", "Australia", LocalDate.of(1935, 03, 24), 45D, WeaponType.Biologicalweaponry);
	WeaponDTO dto11 = new WeaponDTO("Panzerfaust", "Australia", LocalDate.of(1943, 11, 13), 345D, WeaponType.Atillery);
	WeaponDTO dto12 = new WeaponDTO("hydrogen cyanide", "French", LocalDate.of(1994, 7, 18), 249D, WeaponType.Chemicalweaponry);
	WeaponDTO dto13 = new WeaponDTO("Panzerschreck", "Germany", LocalDate.of(1943, 02, 22), 170D, WeaponType.Atillery);
	WeaponDTO dto14 = new WeaponDTO("ricin", "Germany", LocalDate.of(1888, 07, 14), 222D, WeaponType.Biologicalweaponry);
	WeaponDTO dto15 = new WeaponDTO("diphosgene", "Germany", LocalDate.of(1916, 05, 05), 643D, WeaponType.Chemicalweaponry);
	WeaponDTO dto16 = new WeaponDTO("Paris Gun", "German", LocalDate.of(1918, 04, 21), 852D, WeaponType.Atillery);
	WeaponDTO dto17 = new WeaponDTO("smallpox", "China ", LocalDate.of(1796, 03, 21), 214D, WeaponType.Biologicalweaponry);
	WeaponDTO dto18 = new WeaponDTO("grenade", "China", LocalDate.of(1915, 06, 30), 32D, WeaponType.Bombs);
	WeaponDTO dto19 = new WeaponDTO("adamsite", "Germany", LocalDate.of(1918, 07, 24), 312D, WeaponType.Chemicalweaponry);
	WeaponDTO dto20 = new WeaponDTO("mine", "French", LocalDate.of(1960, 06, 04), 214D, WeaponType.Bombs);
	
		Collection<WeaponDTO> dto = new ArrayList<WeaponDTO>();
		
		
		dto.add(dto12);
		dto.add(dto11);
		dto.add(dto6);
		dto.add(dto9);
		dto.add(dto5);
		dto.add(dto12);
		dto.add(dto3);
		dto.add(dto14);
		dto.add(dto1);
		dto.add(dto20);
		dto.add(dto18);
		dto.add(dto4);
		dto.add(dto17);
		dto.add(dto15);
		dto.add(dto2);
		dto.add(dto10);
		dto.add(dto8);
		dto.add(dto7);
		dto.add(dto16);
		dto.add(dto19);
		dto.add(dto13);
		
		System.out.println(dto);

        System.out.println(" -------price greater than 500D---------");
        for(WeaponDTO WeaponDTO:dto){
        	if(WeaponDTO.getPrice()>500D)
        	{
        		System.out.println("Price is greaterthan 500D :"+WeaponDTO.getPrice());
        	}
        }
        
        System.out.println("------Weapons MadeBy and MadeOn----------");
        for(WeaponDTO WeaponDTO:dto)
        {
        	System.out.println("Weapons MadeBY :"+WeaponDTO.getMadeBy()+"      "+" Weapons MadeOn :"+WeaponDTO.getMadeOn());
        }
   
        System.out.println("-------Sort by Name in desc-----------");
		dto.stream()
		.sorted()
		.forEach(e -> System.out.println(e));
		
		System.out.println("-------Sort by MadeBy---------");
		dto
		.stream()
		.sorted((a1, a2) -> a1.getMadeBy().compareTo(a2.getMadeBy()))
		.forEach(e -> System.out.println(e));
       
	
		System.out.println("-------Sort by MadeOn-----------");
		Comparator<WeaponDTO> comparator = (a1, a2) -> a1.getMadeOn().compareTo(a2.getMadeOn());
		dto.stream()
		.sorted(comparator)
		.forEach(e -> System.out.println(e));
		

		System.out.println("----------Sort by name & madeon in asc----------");
		dto.stream()
		.sorted()
		.sorted((a1, a2) -> a2.getMadeOn().compareTo(a1.getMadeOn()))
		.forEach(e -> System.out.println(e));
		
		System.out.println("----------Sort by name & madeon in desc----------");
		dto.stream()
		.sorted()
		.sorted((a1, a2) -> a1.getMadeOn().compareTo(a2.getMadeOn()))
		.forEach(e -> System.out.println(e));
		
	}
}
