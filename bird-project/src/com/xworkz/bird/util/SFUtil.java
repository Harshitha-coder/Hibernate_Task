package com.xworkz.bird.util;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SFUtil {

	private static SessionFactory factory;

	public static SessionFactory getFactory() {
		return factory;
	}

	static {
		try {
			Configuration configuration = new Configuration().configure();
			factory = configuration.buildSessionFactory();
		} catch (HibernateException e) {
			e.printStackTrace();
		}

	}
}
