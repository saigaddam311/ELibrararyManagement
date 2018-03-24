package com.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Daos.LibraryDao;
import com.Pojos.AdminRegister;


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
		return "RegisterResult";
	}

	@RequestMapping(value = "adminNewRegistrationButton")
	public String adminNewRegistrationButton() {
		return "AdminRegister";
	}

	@RequestMapping(value = "adminForgotPasswordButton")
	public String adminForgotPasswordButton() {
		return "";
	}

	/*------------------------------*/

	/*-----Librarian Button controller-------*/

	@RequestMapping(value = "librarianLoginButton")
	public String librarianLoginButton() {
		return "";
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

}
