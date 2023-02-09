package com.xworkz.bakery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.bakery.dto.BakeryDTO;
import com.xworkz.bakery.service.BakeryService;

@Controller
@RequestMapping("/bakery")
public class BakeryController {

	@Autowired
	private BakeryService bakeryService;
	
	public BakeryController() {
		System.out.println("Created: "+this.getClass().getSimpleName());
	}
	
	@PostMapping
	public String onBakery(BakeryDTO dto,Model model){
		System.out.println("Running OnBakery"+dto);
		model.addAttribute("Name:",dto.getName());
		model.addAttribute("Owner:",dto.getOwnerName());
		model.addAttribute("Wife:",dto.getWifeName());
		model.addAttribute("Married",dto.isMarried());
		model.addAttribute("FomousFor:",dto.getSince());
		model.addAttribute("Since",dto.getSince());
		Boolean save=this.bakeryService.validateAndSave(dto);
		return "index.jsp";
	}
}
