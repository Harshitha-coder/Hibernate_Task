package com.xworkz.dryfruit.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.dryfruit.dto.DryFruitDTO;

public class DryFruitDAOImpl implements DryFruitDAO {

	@Override
	public int save(DryFruitDTO dto) {

		Configuration configuration = new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(DryFruitDTO.class);
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		int id = (int) session.save(dto);
		Transaction tx = session.beginTransaction();
		System.out.println(id);
		tx.commit();
		factory.close();
		session.close();
		return id;
	}
}
