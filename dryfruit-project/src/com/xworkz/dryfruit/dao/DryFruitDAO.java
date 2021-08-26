package com.xworkz.dryfruit.dao;

import com.xworkz.dryfruit.dto.DryFruitDTO;

public interface DryFruitDAO {

	int save(DryFruitDTO dto);

	DryFruitDTO readById(int pk);
}
