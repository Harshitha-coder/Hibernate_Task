package com.xworkz.bird;

import com.xworkz.bird.dao.BirdDAO;
import com.xworkz.bird.dao.BirdDAOImpl;

public class DeleteTester {

	public static void main(String[] args) {

		BirdDAO dao = new BirdDAOImpl();
		dao.deleteById(3);
	}

}
