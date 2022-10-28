package com.qa.ecommerce.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.qa.ecommerce.pojo.IPSOwasher;
import com.qa.ecommerce.pojo.user;
import com.qa.ecommerce.repository.UserRepository;
import com.qa.ecommerce.repository.WasherRepository;

@Controller
public class UserController {

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String register(String name, String companyName, String companyContactNo, String companyEmail,
			String companyAddress, String password) throws Exception {
		// System.out.println(name + companyName + companyContactNo + companyEmail +
		// companyAddress + password);

		user user = new user(name, companyName, companyContactNo, companyEmail, companyAddress, password);

		UserRepository.save(user);

		// [LINE 14+15] FIRST WE GET ALL THE INFO FROM THE WEBPAGE
		// [LINE 18] WE MAKE A VARIABLE 'USER' AND INPUT ALL THE INFO
		// [LINE 20] WE IMPORT INFO INTO SQL WITH 'UserRepository.save()' METHOD

		return "home";
	}

	@RequestMapping("/login")
	public ModelAndView login(String companyEmail, String password, HttpSession session) throws Exception {

		user user = UserRepository.validateUserCredentials(companyEmail, password);

		if (user != null) {

			ModelAndView userLoggingIn = new ModelAndView("WelcomePage");
			userLoggingIn.addObject("userData", user);
			session.setAttribute("user", user);
			return userLoggingIn;
		} else {
			// System.out.println("inside system2");
			ModelAndView userLoggingIn = new ModelAndView("home");
			userLoggingIn.addObject("loginErrorMessage", "Incorrect Email or Password, Please Try Again");
			return userLoggingIn;
		}

	}

	@RequestMapping("/userProfile")
	public String UserProfile(HttpSession session) {
		user user = (user) session.getAttribute("user");
		if (user == null) {
			return "home";
		} else {
			return "userProfile";
		}
	}

	@RequestMapping("/WelcomePage")
	public String welcomePage(HttpSession session) {
		user user = (user) session.getAttribute("user");
		if (user == null) {
			return "home";
		} else {
			return "WelcomePage";
		}
	}

	@RequestMapping("/contactUs")
	public String ContactUs(HttpSession session) {
		user user = (user) session.getAttribute("user");
		if (user == null) {
			return "home";
		} else {
			return "contactUs";
		}
	}

	@RequestMapping("/NewPandS")
	public ModelAndView NewPandS(HttpSession session) throws Exception {
//		user user = (user) session.getAttribute("user");
//		if (user == null) {
//			return "home";
//		} else {
		// session.setAttribute("user", user);

		ModelAndView NewPandS = new ModelAndView("/NewPandS");	
		List<IPSOwasher> AllWashers = WasherRepository.getAllwashers();
		NewPandS.addObject("allWashers", AllWashers); 
		// NewPandS.addObject("user", user);
		return NewPandS;
		
	}

	@RequestMapping("/logOut")
	public String logOut(HttpSession session) {
		session.invalidate();
		return "home";
	}
}