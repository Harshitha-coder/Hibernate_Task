package com.xworkz.bird;

import com.xworkz.bird.dao.BirdDAO;
import com.xworkz.bird.dao.BirdDAOImpl;
import com.xworkz.bird.entity.BirdEntity;

public class SaveTester {

	public static void main(String[] args) {
		
		BirdEntity entity=new BirdEntity(3, "Swan", "Anatidae", 40, "America", 2, "Cygnus", "White", "Wild Rice","White");
		
		BirdDAO dao=new BirdDAOImpl();
		
		dao.save(entity);

	}

}
