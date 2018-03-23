package com.Controllers;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.Daos.LibraryDao;
import com.Dbutil.Dbutil;
import com.Pojos.LibrarianRegister;

@Controller
public class HomeController {

	@Autowired
	LibraryDao libraryDao;

	@RequestMapping(value = "addLibrarian")
	public String addLibrarian() {
		return "RegisterLibrarian";
	}

	@RequestMapping(value="registerLibrarian", method = RequestMethod.POST)
	public String registerLibrarian(LibrarianRegister librarianRegister) {
		Session openSession = Dbutil.getSessionFactory().openSession();
		openSession.save(librarianRegister);
		openSession.beginTransaction().commit();
		openSession.close();
		return "LibrarianRegisterResult";
	}
	
	@RequestMapping(value="viewLibrarian")
	public String viewLibrarian(Model model) {
		model.addAttribute("librarianDetails", libraryDao.viewLibrariansList());
		return "FetchLibrarian";
	}
	
	@RequestMapping(value="deleteLibrarian", method = RequestMethod.POST)
	public String deleteLibrarian(@RequestParam("librarianId") int id, Model model) {
		Session session = Dbutil.getSessionFactory().openSession();
		session.beginTransaction();
		Query deleteQuery = session.createQuery("delete from LibrarianRegister where librarianId=:id");
		deleteQuery.setParameter("id", id);
		deleteQuery.executeUpdate();
		session.getTransaction().commit();
		model.addAttribute("librarianDetails", libraryDao.viewLibrariansList());
		return "FetchLibrarian";
	}
	
	@RequestMapping(value="editLibrarian", method = RequestMethod.POST)
	public String editLibrarian(@RequestParam("librarianId") int id, Model model) {
		Session session = Dbutil.getSessionFactory().openSession();
		Query editQuery = session.createQuery("from LibrarianRegister where librarianId=?");
		editQuery.setParameter(0, id);
		List<LibrarianRegister> list = editQuery.list();
		session.close();
		model.addAttribute("LibrarianDetails", list.get(0));
		return "UpdateLibrarian";
	}
	
	@RequestMapping(value = "updateLibrarian", method = RequestMethod.POST)
	public String updateLibrarian(LibrarianRegister librarianRegister, Model model) {
		System.out.println("Entered into Update Librarian Controller");
		Session session = Dbutil.getSessionFactory().openSession();
		Transaction beginTransaction = session.beginTransaction();
		session.update(librarianRegister);
		beginTransaction.commit();
		model.addAttribute("librarianDetails", libraryDao.viewLibrariansList());
		session.close();
		return "LibrarianRegisterResult";	
	}
}