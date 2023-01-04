package xworkz.com;

import java.util.ArrayList;
import java.util.Collection;

public class SanitizerRunner {

	public static void main(String[] args) {
		
		Collection<SanitizerDTO> collection =  new ArrayList<SanitizerDTO>();

		SanitizerDTO dto1 = new SanitizerDTO("b12", "Sterillium", 150D, "blue");
		SanitizerDTO dto2 = new SanitizerDTO(null, "Detto", 80D, "yellow");
		SanitizerDTO dto3 = new SanitizerDTO("g34", "Sterillium", 78D, "blue");
		SanitizerDTO dto4 = new SanitizerDTO("y7i", "Savlon", 4D, null);
		SanitizerDTO dto5 = new SanitizerDTO("j56", "Lifebuoy ", 190D, "green");
		SanitizerDTO dto6 = new SanitizerDTO("b12", "Sterillium", 10D, "blue");
		SanitizerDTO dto7 = new SanitizerDTO(null, "Detto", 2D, "yellow");
		SanitizerDTO dto8 = new SanitizerDTO("g34", "Sterillium", 78D, "blue");
		SanitizerDTO dto9 = new SanitizerDTO("y7i", "Savlon", 4.5D, null);
		SanitizerDTO dto10 = new SanitizerDTO("j56", "Lifebuoy ", 190D, "green");
	
		collection.add(dto4);
		collection.add(dto5);
		collection.add(dto1);
		collection.add(dto3);
		collection.add(dto2);
		collection.add(dto6);
		collection.add(dto8);
		collection.add(dto7);
		collection.add(dto10);
		collection.add(dto9);
		
		System.out.println(collection);
		
		System.out.println(" -------- Price grater than 5 rupee ---------");
		for (SanitizerDTO sanitizerDTO : collection) {
			if (sanitizerDTO.getPrice() > 5) {
					System.out.println("Price less than 5 rupee : " + sanitizerDTO.getPrice());
				
			}
		}
		
		System.out.println(" -------- null in any property ------ ");
		for (SanitizerDTO sanitizerDTO : collection) {
			if (sanitizerDTO.getBrand() == null) {
				System.out.println("Brand is null \n" + sanitizerDTO);
			}
			if (sanitizerDTO.getId() == null) {
				System.out.println("Id is null \n" + sanitizerDTO);
			}
			
			if (sanitizerDTO.getColor() == null) {
				System.out.println("Color is null \n" + sanitizerDTO);
			}
		}
		
		
		
		System.out.println("----- maxPrice ----");
		Double maxPrice = 0D;
		for (SanitizerDTO sanitizerDTO : collection) {
			if (sanitizerDTO.getPrice() != 0) {
				System.out.println("sanitizerDTO.getPrice() : " + sanitizerDTO.getPrice());
				if (sanitizerDTO.getPrice() > maxPrice) {
					maxPrice = sanitizerDTO.getPrice();
				}
			}
		}
		System.out.println("maxPrice : " + maxPrice);

		System.out.println("--------leastPrice ------");
		//Double maxPrice;
		Double leastPrice = maxPrice;
		for (SanitizerDTO sanitizerDTO : collection) {
			if (sanitizerDTO.getPrice() != 0) {
				System.out.println("sanitizerDTO.getPrice() : " + sanitizerDTO.getPrice());
				if (sanitizerDTO.getPrice() < leastPrice) {
					leastPrice = sanitizerDTO.getPrice();
				}
			}
		}
		System.out.println("leastPrice : " + leastPrice);
		
		System.out.println("------ SecMaxPrice -------");
		Double secMaxPrice = 0D;
		for (SanitizerDTO sanitizerDTO : collection) {
			if (sanitizerDTO.getPrice() !=0) {
				System.out.println("sanitizerDTO.getPrice() : " + sanitizerDTO.getPrice());
				if (sanitizerDTO.getPrice() > secMaxPrice && sanitizerDTO.getPrice() != maxPrice) {
					secMaxPrice = sanitizerDTO.getPrice();
				}
			}
		}
		System.out.println("secMaxPrice : " + secMaxPrice);
	
	}
	
}
