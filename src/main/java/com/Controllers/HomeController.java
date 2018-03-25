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

import com.Daos.DbUtil;
import com.Daos.LibraryDao;
import com.Pojos.AdminRegister;
import com.Pojos.LibrarianRegister;


@Controller
public class HomeController {

	@Autowired
	LibraryDao dao;

	/*-----home jsp controller-------*/
	@RequestMapping(value = "adminbutton")
	public String adminbutton() {
		return "adminLogin";
	}

	@RequestMapping(value = "librarianButton")
	public String librarianButton() {
		return "librarianLogin";
	}
	/*------------------------------*/

	/*-----ADMIN Button controller-------*/
	@RequestMapping(value = "adminLoginButton")
	public String adminLoginButton(AdminRegister register,Model model) {
		if (register.getUsername().isEmpty() || register.getPassword().isEmpty()) {

			model.addAttribute("message", "Username and password must be given!!!");
			return "adminLogin";
		} else {

			List<AdminRegister> list = dao.loginLogic(register);
		if (list != null & list.size() >= 1) {

			AdminRegister reg = list.get(0);
						
		} else {
			model.addAttribute("message", "Username and password entered not corectly!!!");
			return "adminLogin";
		}
		}
		return "AdminHome";
	}

	@RequestMapping(value = "adminNewRegistrationButton")
	public String adminNewRegistrationButton() {
		return "AdminRegister";
	}

	@RequestMapping(value = "adminForgotPasswordButton")
	public String adminForgotPasswordButton() {
		return "ForgotPassword";
	}

	/*------------------------------*/

	/*-----Librarian Button controller-------*/

	@RequestMapping(value = "librarianLoginButton")
	public String librarianLoginButton(LibrarianRegister register,Model model) {
		if (register.getLibrarianEmail().isEmpty() || register.getLibrarianPassword().isEmpty()) {

			model.addAttribute("message", "Username and password must be given!!!");
			return "librarianLogin";
		} else {

			List<LibrarianRegister> list = dao.librarianLoginLogic(register);
		if (list != null & list.size() >= 1) {

			LibrarianRegister reg = list.get(0);
						
		} else {
			model.addAttribute("message", "Username and password entered not corectly!!!");
			return "librarianLogin";
		}
		}
		return "RegisterResult";
	}


	@RequestMapping(value = "librarianForgotPasswordButton")
	public String librarianForgotPasswordButton() {
		return "";
	}
	/*------------------------------*/

	/*-----Admin Register Logic controller-------*/

	@RequestMapping(value = "adminRegisterLogic", method = RequestMethod.POST)
	public String adminRegisterLogic(AdminRegister register) {
		dao.adminRegistraionLogic(register);
		return "RegisterResult";
	}

	/*------------------------------*/
	/*------------admin forgot password logic------------------*/

	@RequestMapping(value = "forgotPassword")
	public String forgotPassword(@RequestParam("emailid")String emailid,@RequestParam("newpassword")String newpwd,Model model) {
		Session s = DbUtil.getSessionFactory().openSession();
		Query updateQuery = s.createQuery("update AdminRegister set password = :pwd where emailid = :emailid");
		updateQuery.setParameter("pwd", newpwd);
		updateQuery.setParameter("emailid", emailid);
		int executeUpdate = updateQuery.executeUpdate();
		s.beginTransaction().commit();
		
		model.addAttribute("message", "Updated Successfully!!!");
		return "ForgotPassword";
	}
	
	@RequestMapping(value = "forgotLoginButton")
	public String loginButton() {
		return "adminLogin";
	}


	/*------------------------------*/

	@RequestMapping(value = "addLibrarian")
	public String addLibrarian() {
		return "RegisterLibrarian";
	}

	@RequestMapping(value="registerLibrarian", method = RequestMethod.POST)
	public String registerLibrarian(LibrarianRegister librarianRegister) {
		Session openSession = DbUtil.getSessionFactory().openSession();
		openSession.save(librarianRegister);
		openSession.beginTransaction().commit();
		openSession.close();
		return "LibrarianRegisterResult";
	}
	
	@RequestMapping(value="viewLibrarian")
	public String viewLibrarian(Model model) {
		model.addAttribute("librarianDetails", dao.viewLibrariansList());
		return "FetchLibrarian";
	}
	
	@RequestMapping(value="deleteLibrarian", method = RequestMethod.POST)
	public String deleteLibrarian(@RequestParam("librarianId") int id, Model model) {
		Session session = DbUtil.getSessionFactory().openSession();
		session.beginTransaction();
		org.hibernate.Query deleteQuery = session.createQuery("delete from LibrarianRegister where librarianId=:id");
		deleteQuery.setParameter("id", id);
		deleteQuery.executeUpdate();
		session.getTransaction().commit();
		model.addAttribute("librarianDetails", dao.viewLibrariansList());
		return "FetchLibrarian";
	}
	
	@RequestMapping(value="editLibrarian", method = RequestMethod.POST)
	public String editLibrarian(@RequestParam("librarianId") int id, Model model) {

		Session session = DbUtil.getSessionFactory().openSession();
		Query editQuery = session.createQuery("from LibrarianRegister where librarianId=?");

		editQuery.setParameter(0, id);
		List<LibrarianRegister> list = editQuery.list();
		session.close();
		model.addAttribute("LibrarianDetails", list.get(0));
		return "UpdateLibrarian";
	}
	
	@RequestMapping(value = "updateLibrarian", method = RequestMethod.POST)
	public String updateLibrarian(LibrarianRegister librarianRegister, Model model) {
		Session session = DbUtil.getSessionFactory().openSession();
		Transaction beginTransaction = session.beginTransaction();
		session.update(librarianRegister);
		beginTransaction.commit();
		model.addAttribute("librarianDetails", dao.viewLibrariansList());
		session.close();
		return "LibrarianRegisterResult";	
	}
	
	@RequestMapping(value = "logout")
	public String logout(Model model) {
		return "HOME";
	}
}

