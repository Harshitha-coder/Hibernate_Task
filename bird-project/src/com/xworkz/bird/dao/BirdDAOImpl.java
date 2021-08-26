package com.xworkz.bird.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.bird.entity.BirdEntity;

public class BirdDAOImpl implements BirdDAO {

	@Override
	public int save(BirdEntity entity) {

		Configuration configuration = new Configuration().configure().addAnnotatedClass(BirdEntity.class);
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		int id = (int) session.save(entity);
		Transaction tx = session.beginTransaction();
		System.out.println(id);
		tx.commit();
		factory.close();
		session.close();
		return id;
	}

	@Override
	public BirdEntity readById(int id) {
		Configuration configuration = new Configuration().configure().addAnnotatedClass(BirdEntity.class);
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		BirdEntity fromDb = session.get(BirdEntity.class, id);
		factory.close();
		session.close();
		return fromDb;
	}
}
