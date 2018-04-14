package com.Daos;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

import com.Controllers.HomeController;
import com.Pojos.AdminRegister;
import com.Pojos.LibrarianRegister;

public class LibraryDao {
	
	final static Logger logger = Logger.getLogger(LibraryDao.class);

	public void adminRegistraionLogic(AdminRegister register) {

		Session openSession = DbUtil.getSessionFactory().openSession();
		openSession.save(register);
		openSession.beginTransaction().commit();
		openSession.close();
	}

	public List<AdminRegister> loginLogic(AdminRegister register) {

		logger.info("Entered into loginLogic dao method");
		List<AdminRegister> list;
		try {
			Session openSession = DbUtil.getSessionFactory().openSession();
			Query createQuery = openSession.createQuery("from AdminRegister where username = :uname and password = :pwd");
			logger.debug("Prepared Query!!");
			createQuery.setParameter("uname", register.getUsername());
			createQuery.setParameter("pwd", register.getPassword());
			logger.debug("Place holders setting is done!!");
			list = createQuery.list();
			logger.debug("Executed query!!");
			openSession.close();
		} catch (RuntimeException e) {
			logger.error("Exception occured while getting data from Database!!", e);
			throw e;
		}
		return list;

	}

	public List<LibrarianRegister> viewLibrariansList() {
		Session session = DbUtil.getSessionFactory().openSession();
		Query query = session.createQuery("from LibrarianRegister");
		List<LibrarianRegister> list = query.list();
		session.close();
		return list;
	}
	
	public List<LibrarianRegister> librarianLoginLogic(LibrarianRegister register) {

		Session openSession = DbUtil.getSessionFactory().openSession();
		Query createQuery = openSession.createQuery("from LibrarianRegister where librarianEmail = :uname and librarianPassword = :pwd");
		createQuery.setParameter("uname", register.getLibrarianEmail());
		createQuery.setParameter("pwd", register.getLibrarianPassword());
		List<LibrarianRegister> list = createQuery.list();
		openSession.close();
		return list;

	}

}