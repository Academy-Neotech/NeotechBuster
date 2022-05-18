package srl.neotech.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import srl.neotech.services.SearchMovieServices;

@Controller
public class SearchMovieViewcontroller {

	@Autowired
    SearchMovieServices searchMovieServices;
	
	
	@RequestMapping(value = "/customer/search_Movie",method = RequestMethod.GET)
	public String searchMovieView( Model model) {
		
   

		return "customer/search_Movie";
	}
	  
	
}

