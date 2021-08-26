package com.xworkz.soap.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.soap.dto.SoapDTO;

public class SoapDAOImpl implements SoapDAO {

	@Override
	public int save(SoapDTO dto) {

		Configuration configuration = createdConfiguration();
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
	private Configuration createdConfiguration() {
		Configuration configuration = new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(SoapDTO.class);
		return configuration;
	}
	@Override
	public SoapDTO readById(int pk) {
		Configuration configuration = createdConfiguration();
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		SoapDTO idFromDb=session.get(SoapDTO.class, pk);
		factory.close();
		session.close();
		return idFromDb;
	}
}
