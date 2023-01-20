package com.xworkz.firstaid.repository;

import org.springframework.stereotype.Component;

import com.xworkz.firstaid.DTO.FirstAidDTO;

@Component
public class FirstAidRepositoryImpl implements FirstAidRepository{

	@Override
	public boolean save(FirstAidDTO dto) {

		System.out.println("running save method ");
		return true;
	}

}