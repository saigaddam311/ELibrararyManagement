package com.Daos;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.classic.Session;

import com.Dbutil.Dbutil;
import com.Pojos.AdminRegister;
import com.Pojos.LibrarianRegister;

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
		createQuery.setParameter("pwd", register.getPassword());
		List<AdminRegister> list = createQuery.list();
		openSession.close();
		return list;

	}

	public List<LibrarianRegister> viewLibrariansList() {
		Session session = Dbutil.getSessionFactory().openSession();
		Query query = session.createQuery("from LibrarianRegister");
		List<LibrarianRegister> list = query.list();
		session.close();
		return list;
	}

}