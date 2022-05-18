package srl.neotech.controllers;

import java.security.Principal;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserViewController {
	
	@RequestMapping(value="/register", method = RequestMethod.GET)
	public String register() {
		return "register";
	}
	
	
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String login() {
		return "login";
	}
	
	@RequestMapping(value="/perform_login",method = RequestMethod.GET)
	public String loginPage(Model model, Principal principal) {
		/*
		 * String homePage="home_page"; if(principal != null &&
		 * ((UsernamePasswordAuthenticationToken)
		 * principal).getAuthorities().stream().anyMatch(a ->
		 * a.getAuthority().equals("CUSTOMER"))) homePage="/customer/home_page";
		 * 
		 * if(principal != null && ((UsernamePasswordAuthenticationToken)
		 * principal).getAuthorities().stream().anyMatch(a ->
		 * a.getAuthority().equals("MANAGER"))) homePage="/manager/home_page";
		 * 
		 * return homePage;
		 */
		return "home";
	}

}


