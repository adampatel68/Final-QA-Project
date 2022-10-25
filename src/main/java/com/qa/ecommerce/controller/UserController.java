package com.qa.ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.qa.ecommerce.pojo.user;
import com.qa.ecommerce.repository.UserRepository;

@Controller
public class UserController {

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String register(String name, String companyName, String companyContactNo, String companyEmail,
			String companyAddress, String password) throws Exception {
		System.out.println(name + companyName + companyContactNo + companyEmail + companyAddress + password);

		user user = new user(name, companyName, companyContactNo, companyEmail, companyAddress, password);

		UserRepository.save(user);

		// [LINE 14+15] FIRST WE GET ALL THE INFO FROM THE WEBPAGE
		// [LINE 19] WE MAKE A VARIABLE 'USER' AND INPUT ALL THE INFO
		// [LINE 21] WE IMPORT INFO INTO SQL WITH 'UserRepository.save()' METHOD

		return "WelcomePage";
	}

	@RequestMapping("/login")
	public ModelAndView login(String companyEmail, String password) throws Exception {
		
		user user = UserRepository.validateUserCredentials(companyEmail, password);

		if (user != null) {

			ModelAndView userLoggingIn = new ModelAndView("WelcomePage");
			userLoggingIn.addObject("userData", user);
			return userLoggingIn;
		} else {
			System.out.println("inside system2");
			ModelAndView userLoggingIn = new ModelAndView("home");
			userLoggingIn.addObject("loginErrorMessage", "Incorrect Email or Password, Please Try Again");

			return userLoggingIn;
		}

	}

}