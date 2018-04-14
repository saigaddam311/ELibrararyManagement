package com.Daos;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class DbUtil {

	final static Logger logger = Logger.getLogger(DbUtil.class);
	public static SessionFactory getSessionFactory() {
		logger.info("Entered into getSessionFactory method");
		SessionFactory buildSessionFactory = null;
		try {
			Configuration configure = new AnnotationConfiguration().configure();
			buildSessionFactory = configure.buildSessionFactory();			
		} catch(Exception e) {
			logger.error("Exception occured while preparing a session object", e);
			throw new RuntimeException("Database connection issue");
		}
		logger.info("Exit from getSessionFactory method");
		return buildSessionFactory;
	}
}
