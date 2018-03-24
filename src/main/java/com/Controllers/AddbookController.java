package com.Controllers;

import java.util.List;

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

import com.Pojos.Addbook;

@Controller
public class AddbookController {
	
	@RequestMapping(value="savebook" ,method=RequestMethod.GET)
	public String savebook(Addbook addbook,Model model) {
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

	
	@RequestMapping(value="viewbooks",method=RequestMethod.GET)
	public String fullbooks(Addbook addbook,Model model) {
		Configuration configure = new AnnotationConfiguration().configure();
		SessionFactory factory = configure.buildSessionFactory();
		Session session = factory.openSession();
		Query query = session.createQuery("from Addbook");
		List<Addbook> list = query.list();
		for (Addbook addbook2 : list) {
			System.out.println(addbook2.getAuthor());
		}
		model.addAttribute("message", list);
		return "booklist";
	}
}
