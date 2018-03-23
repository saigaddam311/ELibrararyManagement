package com.Dbutil;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class Dbutil {

	public static SessionFactory getSessionFactory() {
		Configuration configure = new AnnotationConfiguration().configure();
		SessionFactory sf = configure.buildSessionFactory();
		return sf;
	}
}
