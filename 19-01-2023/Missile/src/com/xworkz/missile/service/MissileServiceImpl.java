package com.xworkz.missile.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.missile.dto.MissileDTO;
import com.xworkz.missile.repository.MissileRepository;

@Component
public class MissileServiceImpl implements MissileService{

	
		@Autowired
		private Validator validator;
		@Autowired
		private MissileRepository missileRepository;
		
		@Override
		public boolean validateAndSave(MissileDTO dto){
			
		System.out.println("Started validateAndSave");
		System.out.println("DTO passed"+dto);
		
		Set<ConstraintViolation<MissileDTO>> violation = this.validator.validate(dto);
		if(!violation.isEmpty()){
			System.out.println("Error");
			violation.forEach(ele->System.out.println(ele.getMessage()));
			return false;
		}
		else{
			System.out.println("DTO Valid");
			boolean saved=missileRepository.save(dto);
			return saved;
			
		}
		
	}

}
