package com.Controllers;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Pojos.Students;

@Controller
public class StudentController {
	
	@RequestMapping(value="register",method=RequestMethod.GET)
	public String register(Students students,Model model) {
		Configuration configure = new AnnotationConfiguration().configure();
		SessionFactory factory = configure.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(students);
		transaction.commit();
		session.close();
		model.addAttribute("message", "Successfully Registered");

		return "success";
	}
	
	

}
