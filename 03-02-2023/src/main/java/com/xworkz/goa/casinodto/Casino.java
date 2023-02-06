package com.xworkz.goa.casinodto;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/crusie")
public class Casino {
	
	public Casino() {
		System.out.println("Created "+this.getClass().getSimpleName());
	}
	 
	@PostMapping
	public String onVisit(CasinoDTO dto){
		System.out.println("Running onVisit");
		System.out.println(dto);
		return "index.jsp";
	}

}
