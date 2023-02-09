package com.xworkz.bakery.repository;

import com.xworkz.bakery.dto.BakeryDTO;

public interface BakeryRepo {

	boolean save(BakeryDTO bakeryDTO);
}
