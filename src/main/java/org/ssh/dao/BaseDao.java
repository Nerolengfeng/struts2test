package org.ssh.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class BaseDao {
	private SessionFactory sessionFactory;

	public Session getSessionFactory() {
		return sessionFactory.getCurrentSession();
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
}
