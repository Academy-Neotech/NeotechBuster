package srl.neotech.controllers;

import java.security.Principal;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserViewController {

	
	@RequestMapping(value="/login",method = RequestMethod.GET)
	public String loginPage(Model model, @RequestParam(value = "error", required = false) String error,Principal principal) {
		String retValue="login";
    return retValue;
	}

	@RequestMapping(value="/register", method = RequestMethod.GET)
	public String register() {
		return "register";
	}
	
	
	@RequestMapping(value="/perform_login",method = RequestMethod.GET)
	public String loginPage(Model model, Principal principal) {
		String homePage="";
		if(principal != null && 
		   ((UsernamePasswordAuthenticationToken) principal).getAuthorities().stream().anyMatch(a -> a.getAuthority().equals("CUSTOMER"))) homePage="/customer/home";
		
		if(principal != null && 
				   ((UsernamePasswordAuthenticationToken) principal).getAuthorities().stream().anyMatch(a -> a.getAuthority().equals("MANAGER"))) homePage="/manager/home_page";
				
    return homePage;
	}
	
	
	
	@RequestMapping(value="/blank",method = RequestMethod.GET)
	public String blankPage(Model model, Principal principal) {
		return "blank";
	}
	
//	@RequestMapping(value="/customer/home",method = RequestMethod.GET)
//	public String customerPage(Model model, Principal principal) {
//		return "/customer/home";
//	}
//
//	@RequestMapping(value="/manager/home",method = RequestMethod.GET)
//	public String managerPage(Model model, Principal principal) {
//		return "/manager/home";
//	}


}
