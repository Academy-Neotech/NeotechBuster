package srl.neotech.controllers;

import java.security.Principal;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

	
	@RequestMapping(value="/login",method = RequestMethod.GET)
	public String loginPage(Model model, @RequestParam(value = "error", required = false) String error,Principal principal) {
		String retValue="login_page";
		if (principal!=null) System.out.println(((UsernamePasswordAuthenticationToken) principal).getName());
    return retValue;
	}

	
	@RequestMapping(value="/perform_login",method = RequestMethod.GET)
	public String loginPage(Model model, Principal principal) {
		String homePage="home_page";
		if(principal != null && 
		   ((UsernamePasswordAuthenticationToken) principal).getAuthorities().stream().anyMatch(a -> a.getAuthority().equals("CUSTOMER"))) homePage="/customer/home_page";
		
		if(principal != null && 
				   ((UsernamePasswordAuthenticationToken) principal).getAuthorities().stream().anyMatch(a -> a.getAuthority().equals("MANAGER"))) homePage="/manager/home_page";
				
    return homePage;
	}
	
	@RequestMapping(value="/error",method = RequestMethod.GET)
	public String forbiddenPage(Model model, Principal principal) {
		return "error";
	}
	
	
	@RequestMapping(value="/blank",method = RequestMethod.GET)
	public String blankPage(Model model, Principal principal) {
		return "blank";
	}
	
	@RequestMapping(value="/customer/homepage",method = RequestMethod.GET)
	public String customerPage(Model model, Principal principal) {
		return "/customer/home_page";
	}

	@RequestMapping(value="/manager/homepage",method = RequestMethod.GET)
	public String managerPage(Model model, Principal principal) {
		return "/manager/home_page";
	}


	
	@RequestMapping(value="/homepage",method = RequestMethod.GET)
	public String homePage() {
		String retValue="home_page";
		return retValue;
	}
	
	
	
	
	

}
