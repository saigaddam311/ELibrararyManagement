package com.Controllers;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AddbookController {
	
	@RequestMapping(value="savebook" ,method=RequestMethod.GET)
	public String Addbook(com.Pojos.Addbook addbook,Model model) {
		Configuration configure = new AnnotationConfiguration().configure();
		SessionFactory factory = configure.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(addbook);
		transaction.commit();
		session.close();
		
		model.addAttribute("message", "Successfully Inserted in to Library");
		return "addbook";
	}

	
	public String fullbooks() {
		
	}
}
