package com.xworkz.bird;

import com.xworkz.bird.dao.BirdDAO;
import com.xworkz.bird.dao.BirdDAOImpl;
import com.xworkz.bird.entity.BirdEntity;

public class ReadTester {

	public static void main(String[] args) {

		BirdDAO dao = new BirdDAOImpl();
		BirdEntity entity = dao.readById(3);
		System.out.println(entity);

	}

}
