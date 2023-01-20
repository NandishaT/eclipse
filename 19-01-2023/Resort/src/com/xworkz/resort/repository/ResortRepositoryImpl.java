package com.xworkz.resort.repository;

import org.springframework.stereotype.Component;

import com.xworkz.resort.DTO.ResortDTO;

@Component
public class ResortRepositoryImpl implements ResortRepository{

	@Override
	public boolean save(ResortDTO dto){
		System.out.println("Save method in ResortRepositoryImpl");
	return true;
	}
}
