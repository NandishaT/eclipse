package com.xworkz.terrorist.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.ValidatorFactory;
import javax.validation.Validator;

import com.xworkz.terrorist.dto.TerroristDTO;

public class TerroristServiceImpl  implements TerroristService{

	public TerroristServiceImpl(){
		System.out.println("Created TerroristServiceImpl using no-argu const");
	}

	@Override
	public boolean validateAndSave(TerroristDTO dto) {
	
		System.out.println("execuiting validateAndSave start");
		System.out.println("Dto passed :"+dto);
		
		ValidatorFactory factory=Validation.buildDefaultValidatorFactory();
		Validator validator= factory.getValidator();
		Set<ConstraintViolation<TerroristDTO>> constraintViolations =
				validator.validate(dto);
		if(!constraintViolations.isEmpty()){
			System.out.println("Error is there");
			constraintViolations.forEach(ele -> System.out.println(ele.getMessage()));
		}
		
		return false;
	}
	
}
