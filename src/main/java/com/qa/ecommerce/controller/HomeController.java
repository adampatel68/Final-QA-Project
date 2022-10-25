package com.qa.ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String home() {
		return "home"; // This is the name of the JSP file
	}

	@RequestMapping("/RegistrationPage")
	public String RegistrationPage() {
		return "RegistrationPage";
	}

}