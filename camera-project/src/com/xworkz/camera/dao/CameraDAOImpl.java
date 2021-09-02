package com.xworkz.camera.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.camera.entity.CameraEntity;
import com.xworkz.camera.util.SFUtil;

public class CameraDAOImpl implements CameraDAO {

	private SessionFactory factory = SFUtil.getFactory();
	Transaction trans = null;

	@Override
	public int save(CameraEntity entity) {
		int id = 0;
		try (Session session = factory.openSession()) {
			trans = session.beginTransaction();
			id = (int) session.save(entity);
			System.out.println(id);
			trans.commit();
		} catch (Exception e) {
			if (trans != null) {
				trans.rollback();
			}
			e.printStackTrace();
		}
		return id;
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
			trans = session.beginTransaction();
			CameraEntity en = session.get(CameraEntity.class, id);
			en.setBrand(brand);
			session.update(en);
			trans.commit();
		} catch (Exception e) {
			if (trans != null) {
				trans.rollback();
			}
			e.printStackTrace();
		}
	}

	@Override
	public void deleteById(int id) {
		try (Session session = factory.openSession()) {
			trans = session.beginTransaction();
			CameraEntity en = session.get(CameraEntity.class, id);
			session.delete(en);
			trans.commit();
		} catch (Exception e) {
			if (trans != null) {
				trans.rollback();
			}
			e.printStackTrace(); 
		}
	}

	@Override
	public void saveList(List<CameraEntity> entity) {
		try (Session session = factory.openSession()) {
			trans = session.beginTransaction();
			entity.forEach((a) -> session.save(a));
			trans.commit();
		} catch (Exception e) {
			if (trans != null) {
				trans.rollback();
			}
			e.printStackTrace();
		}
	}

	@Override
	public void deleteList(List<CameraEntity> entity) {
		try (Session session = factory.openSession()) {
			trans = session.beginTransaction();
			entity.forEach((a) -> session.delete(a));
			trans.commit();
		} catch (Exception e) {
			if (trans != null) {
				trans.rollback();
			}
			e.printStackTrace();

		}
	}
}
