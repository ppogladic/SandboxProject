package org.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DbUtil {
	
	private static final SessionFactory sessionFactory;
	
	static {
		try {
			sessionFactory = new Configuration().configure().buildSessionFactory();
		} catch (Exception e) {
			throw new ExceptionInInitializerError("Could not build session factory with message: " + e.getMessage());
		}
	}
	
	public static SessionFactory getSessionfactory() {
		return sessionFactory;
	}
}
