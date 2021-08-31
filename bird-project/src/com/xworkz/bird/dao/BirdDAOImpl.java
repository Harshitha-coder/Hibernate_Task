package com.xworkz.bird.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.bird.entity.BirdEntity;
import com.xworkz.bird.util.SFUtil;

public class BirdDAOImpl implements BirdDAO {

	private SessionFactory factory = SFUtil.getFactory();

	@Override
	public int save(BirdEntity entity) {
		try (Session session = factory.openSession()) {
			Transaction tx = session.beginTransaction();
			int id = (int) session.save(entity);
			System.out.println(id);
			tx.commit();
			return id;
		}
	}

	@Override
	public BirdEntity readById(int id) {
		try (Session session = factory.openSession()) {
			BirdEntity fromDb = session.get(BirdEntity.class, id);
			return fromDb;
		}

	}

	@Override
	public void updateNameById(int id, String name) {
		try (Session session = factory.openSession()) {
			Transaction tx = session.beginTransaction();
			BirdEntity fromDb = session.get(BirdEntity.class, id);
			fromDb.setName(name);
			session.update(fromDb);
			tx.commit();
		}
	}

	@Override
	public void deleteById(int id) {
		try (Session session = factory.openSession()) {
			Transaction tx = session.beginTransaction();
			BirdEntity fromDb = session.get(BirdEntity.class, id);
			session.delete(fromDb);
			tx.commit();
		}
	}
}
