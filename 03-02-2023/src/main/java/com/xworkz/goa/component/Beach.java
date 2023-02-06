package com.xworkz.goa.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/beach")
public class Beach {

	public Beach() {
		System.out.println("Created "+this.getClass().getSimpleName());
	}
	
	@PostMapping
	public String onVisit(@RequestParam String name,@RequestParam String location,@RequestParam String clean,@RequestParam String game){
	System.out.println("Running onVisit");
	System.out.println("Beach Name: "+name);
	System.out.println("Location: "+location);
	System.out.println("Clean: "+clean);
   System.out.println("Games: "+game);
    return "beach.jsp";
	}
}