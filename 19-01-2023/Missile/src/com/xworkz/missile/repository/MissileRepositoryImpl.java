package com.xworkz.missile.repository;

import org.springframework.stereotype.Component;

import com.xworkz.missile.dto.MissileDTO;

@Component
public class MissileRepositoryImpl implements MissileRepository{

	@Override
	public boolean save(MissileDTO dto){
		System.out.println("Save in MissileRepositoryImpl");
	    return true;
	}
}
