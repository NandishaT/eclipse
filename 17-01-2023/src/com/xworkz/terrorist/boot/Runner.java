package com.xworkz.terrorist.boot;

import com.xworkz.terrorist.dto.TerroristDTO;
import com.xworkz.terrorist.service.TerroristService;
import com.xworkz.terrorist.service.TerroristServiceImpl;

public class Runner {
	public static void main(String[] args) {
		TerroristDTO dto=new TerroristDTO("Neeraj", 65, "male", false, false, "Bombing", "thaliban");
		/*dto.setname("Neeraj");
		dto.setAge(23);
		System.out.println(dto);*/
		
		TerroristServiceImpl impl=new TerroristServiceImpl();
		impl.validateAndSave(dto);
		System.out.println(dto.getName());
	}

}
