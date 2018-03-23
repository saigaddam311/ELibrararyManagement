package com.Controllers;

import org.hibernate.classic.Session;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Dbutil.Dbutil;
import com.Pojos.LibrarianRegister;

@Controller
public class HomeController {

	@RequestMapping(value = "addLibrarian")
	public String addLibrarian() {
		return "RegisterLibrarian";
	}

	@RequestMapping(value="registerLibrarian", method = RequestMethod.POST)
	public String registerLibrarian(LibrarianRegister librarianRegister) {
		System.out.println("Entered into RegisterLibrarian Controller");
		Session openSession = Dbutil.getSessionFactory().openSession();
		openSession.save(librarianRegister);
		openSession.beginTransaction().commit();
		openSession.close();
		return "LibrarianRegisterResult";
	}
}
