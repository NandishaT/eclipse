package com.xworkz.firstaid.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.firstaid.DTO.FirstAidDTO;
import com.xworkz.firstaid.repository.FirstAidRepository;


@Component
public class FirstAidServiceImpl implements FirstAidService{

	@Autowired
	private Validator validator;
	@Autowired
	private FirstAidRepository firstaidRepository;
	
	@Override
	public boolean validateAndSave(FirstAidDTO dto){
		
	System.out.println("Started validateAndSave");
	System.out.println("DTO passed"+dto);
	
	Set<ConstraintViolation<FirstAidDTO>> violation = this.validator.validate(dto);
	if(!violation.isEmpty()){
		System.out.println("Error");
		violation.forEach(ele->System.out.println(ele.getMessage()));
		return false;
	}
	else{
		System.out.println("DTO Valid");
		boolean saved=firstaidRepository.save(dto);
		return saved;
		
	}
	
}

}


