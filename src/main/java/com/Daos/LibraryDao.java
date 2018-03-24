package com.Daos;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import com.Pojos.AdminRegister;

public class LibraryDao {

	public void adminRegistraionLogic(AdminRegister register) {
		
		Session openSession = DbUtil.getSessionFactory().openSession();
		openSession.save(register);
		openSession.beginTransaction().commit();
		openSession.close();
	}
	
	public List<AdminRegister> loginLogic(AdminRegister register) {
		
		Session openSession = DbUtil.getSessionFactory().openSession();
		Query createQuery = openSession.createQuery("from AdminRegister where username = :uname and password = :pwd");
		createQuery.setParameter("uname", register.getUsername());
		createQuery.setParameter("pwd",register.getPassword());
		List<AdminRegister> list = createQuery.list();
		openSession.close();
		return list;
	}
}
