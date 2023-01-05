package xworkz.com;

import java.util.ArrayList;
import java.util.Collection;

public class AirportRunner {

	public static void main(String[] args) {
		
		Collection<AirportDTO> dto = new ArrayList<AirportDTO>();
		
		AirportDTO dto1 =new AirportDTO("Kempegowda International Airport","Bengalore","BGH", "India");
		AirportDTO dto2 =new AirportDTO("Mysore International Airport","Mysore","MYS", "India");
		AirportDTO dto3 =new AirportDTO("Dubai International Airport","Dubai","DUB", "UAE");
		AirportDTO dto4 =new AirportDTO("RajivGandi International Airport","Hyderbad","HYD", "India");
		AirportDTO dto5 =new AirportDTO("IndriaGandi International Airport","Delhi","DEL", "India");
	
		dto.add(dto1);
		dto.add(dto3);
		dto.add(dto4);
		dto.add(dto2);
		dto.add(dto5);
		
	
		boolean equals = dto.equals(dto1);
		System.out.println("equals : " + equals);
		System.out.println("equals : " + dto.equals(dto2));
		System.out.println("equals : " + dto.equals(dto3));
		System.out.println("equals : " + dto.equals(dto4));

		
		boolean contains = dto.contains(dto);
		System.out.println("dto.contains(dto) : " + contains);
		System.out.println("dto.contains(dt4) : " + dto.contains(dto4));
		System.out.println("dto.contains(dto3) : " + dto.contains(dto3));
		System.out.println("dto.contains(dto2) : " + dto.contains(dto2));
		System.out.println("dto.contains(dto1) : " + dto.contains(dto1));
	}
}
