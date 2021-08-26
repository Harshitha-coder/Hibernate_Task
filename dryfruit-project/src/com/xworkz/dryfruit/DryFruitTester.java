package com.xworkz.dryfruit;

import com.xworkz.dryfruit.dao.DryFruitDAO;
import com.xworkz.dryfruit.dao.DryFruitDAOImpl;
import com.xworkz.dryfruit.dto.DryFruitDTO;

public class DryFruitTester {

	public static void main(String[] args) {

		DryFruitDTO dto = new DryFruitDTO(2, "Cashew", "Touchestone", "African", 700.0, "ZZZ");

		DryFruitDAO dao = new DryFruitDAOImpl();

		dao.save(dto);

		DryFruitDTO id = dao.readById(2);
		System.out.println(id);

	}

}
