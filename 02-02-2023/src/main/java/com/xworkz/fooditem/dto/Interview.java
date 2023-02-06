package com.xworkz.fooditem.dto;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/pass")
public class Interview {

	public Interview() {
		System.out.println("Created "+this.getClass().getSimpleName());
	}
	
	@PostMapping
	public String onPass(InterviewDTO dto){
		System.out.println("Running onPass");
		System.out.println(dto);
		return "index.jsp";
	}
}
