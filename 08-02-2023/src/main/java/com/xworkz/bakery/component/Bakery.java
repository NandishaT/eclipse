package com.xworkz.bakery.component;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class Bakery {

	public Bakery() {
		System.out.println("Created "+this.getClass().getSimpleName());
	}
	
	@PostMapping("/name")
	public String onName(Model model){
		System.out.println("Running onName");
		model.addAttribute("name","Asha");
		return "index.jsp";
	}
	
	@PostMapping("/owner")
	public String onOwner(Model model){
		System.out.println("Running onOwner");
		model.addAttribute("owner","Arun");
		return "index.jsp";
	}
	
	@PostMapping("/wife")
	public String onWife(Model model){
		System.out.println("Running onWife");
		model.addAttribute("wife","Asha");
		return "index.jsp";
	}
	
	@PostMapping("/married")
	public String onMarried(Model model){
		System.out.println("Running onMarried");
		model.addAttribute("married",false);
		return "index.jsp";
	}
	
	@PostMapping("/famous")
	public String onFamous(Model model){
		System.out.println("Running onFamous");
		model.addAttribute("famous","mysorepak");
		return "index.jsp";
	}
	
	@PostMapping("/since")
	public String onSince(Model model){
		System.out.println("Running onSince");
		model.addAttribute("since",2);
		return "index.jsp";
	}
}

