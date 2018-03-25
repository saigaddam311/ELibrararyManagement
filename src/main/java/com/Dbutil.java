package com;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class Dbutil {

	public static SessionFactory getSessionFactory() {
		org.hibernate.cfg.Configuration configure = new AnnotationConfiguration().configure();
		SessionFactory sf = configure.buildSessionFactory();
		return sf;
	}
}
