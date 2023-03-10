package com.xworkz.soldier.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.soldier.dto.SoldierDTO;
import com.xworkz.soldier.repository.SoldierRepositry;

public class SoldierServiceImpl implements SoldierService{

	private SoldierRepositry SoldierRepositry;

	public SoldierServiceImpl(com.xworkz.soldier.repository.SoldierRepositry soldierRepositry){
		super();
		SoldierRepositry=soldierRepositry;
	}
	
	@Override
	public boolean validateAndSave(SoldierDTO dto) {
		System.out.println("Running validateAndSave method...");
		System.out.println("DTO passed " + dto);

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<SoldierDTO>> violation = validator.validate(dto);
		if (!violation.isEmpty()) {
			System.out.println("Error in data...");
			violation.forEach(ele -> System.out.println(ele.getMessage()));
			return false;
		} else {
			System.out.println("DTO is valid");
			boolean saved=SoldierRepositry.save(dto);
			System.out.println("saved "+dto);
			return saved;
			

		}
		
	}
	
	
}
