package com.xworkz.camera.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.camera.entity.CameraEntity;
import com.xworkz.camera.util.SFUtil;

public class CameraDAOImpl implements CameraDAO {

	private SessionFactory factory = SFUtil.getFactory();

	@Override
	public int save(CameraEntity entity) {
		try (Session session = factory.openSession()) {
			Transaction tx = session.beginTransaction();
			int id = (int) session.save(entity);
			System.out.println(id);
			tx.commit();
			return id;
		}
	}

	@Override
	public CameraEntity readById(int id) {
		try (Session session = factory.openSession()) {
			CameraEntity en = session.get(CameraEntity.class, id);
			return en;
		}
	}

	@Override
	public void updateBrandById(int id, String brand) {
		try (Session session = factory.openSession()) {
			Transaction tx = session.beginTransaction();
			CameraEntity en = session.get(CameraEntity.class, id);
			en.setBrand(brand);
			session.update(en);
			tx.commit();
		}
	}

	@Override
	public void deleteById(int id) {
		try (Session session = factory.openSession()) {
			Transaction tx = session.beginTransaction();
			CameraEntity en = session.get(CameraEntity.class, id);
			session.delete(en);
			tx.commit();
		}
	}
}
