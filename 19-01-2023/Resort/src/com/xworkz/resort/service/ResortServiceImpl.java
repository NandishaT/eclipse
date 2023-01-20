package com.xworkz.resort.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.resort.DTO.ResortDTO;
import com.xworkz.resort.repository.ResortRepository;

@Component
public class ResortServiceImpl implements ResortService{

	@Autowired
	private Validator validator;
	@Autowired
	private ResortRepository resortRepo;
	
	@Override
	public boolean validateAndSave(ResortDTO dto){
		System.out.println("validateAndSave in ResortServiceImpl");
		System.out.println("DTO passed "+dto);
		
		
		Set<ConstraintViolation<ResortDTO>> violation =this.validator.validate(dto);
		if(!violation.isEmpty()){
			System.out.println("Error");
			violation.forEach(ele->System.out.println(ele.getMessage()));
			return false;
		}
		else{
			System.out.println("DTO valid");
			boolean saved=resortRepo.save(dto);
			System.out.println("Saved :"+dto);
            return saved;
		}
	}
}
