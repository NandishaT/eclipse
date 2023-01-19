package com.xworkz.soldier.boot;

import com.xworkz.soldier.dto.SoldierDTO;
import com.xworkz.soldier.repository.SoldierRepositryImpl;
import com.xworkz.soldier.service.SoldierServiceImpl;

public class SoldierRunner {

	public static void main(String[] args) {
		SoldierDTO dto=new SoldierDTO("Sandeep", 2, "Second", "BSF", "India");
		SoldierRepositryImpl repo=new SoldierRepositryImpl();
		SoldierServiceImpl service=new SoldierServiceImpl(repo);
		service.validateAndSave(dto);
	}
}
