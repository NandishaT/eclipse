package com.xworkz.bakery.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.bakery.dto.BakeryDTO;
import com.xworkz.bakery.repository.BakeryRepo;

@Service
public class BakeryServiceImpl implements BakeryService{

	@Autowired
	private BakeryRepo repo;
	
	public BakeryServiceImpl() {
	System.out.println("Created: "+this.getClass().getSimpleName());
	}
	
	@Override
	public boolean validateAndSave(BakeryDTO dto){
		boolean save=this.repo.save(dto);
		System.out.println("Repository Save:"+save);
		System.out.println("ValidateAndSave "+dto);
		return false;
	}
}
