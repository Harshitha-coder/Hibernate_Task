package com.xworkz.bird.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.bird.entity.BirdEntity;
import com.xworkz.bird.util.SFUtil;

public class BirdDAOImpl implements BirdDAO {

	@Override
	public int save(BirdEntity entity) {
		SessionFactory factory = SFUtil.getFactory();
		Session session = factory.openSession();
		int id = (int) session.save(entity);
		Transaction tx = session.beginTransaction();
		System.out.println(id);
		tx.commit();
		session.close();
		return id;
	}

	@Override
	public BirdEntity readById(int id) {
		SessionFactory factory = SFUtil.getFactory();
		Session session = factory.openSession();
		BirdEntity fromDb = session.get(BirdEntity.class, id);
		session.close();
		return fromDb;
	}

	@Override
	public void updateNameById(int id, String name) {
		SessionFactory factory = SFUtil.getFactory();
		Session session = factory.openSession();
		BirdEntity fromDb = session.get(BirdEntity.class, id);
		Transaction tx = session.beginTransaction();
		fromDb.setName(name);
		session.update(fromDb);
		tx.commit();
		System.out.println("updated name by id");
		session.close();
	}

	@Override
	public void deleteById(int id) {
		SessionFactory factory = SFUtil.getFactory();
		Session session = factory.openSession();
		BirdEntity fromDb = session.get(BirdEntity.class, id);
		Transaction tx = session.beginTransaction();
		session.delete(fromDb);
		tx.commit();
		System.out.println("deleted by id");
		session.close();

	}
}
