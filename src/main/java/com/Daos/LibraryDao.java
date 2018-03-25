package com.Daos;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.Dbutil;
import com.Pojos.LibrarianRegister;

public class LibraryDao {
	public List<LibrarianRegister> viewLibrariansList() {
		Session session = Dbutil.getSessionFactory().openSession();
		Query query = session.createQuery("from LibrarianRegister");
		List<LibrarianRegister> list  = query.list();
		session.close();
		return list;
	}
}
