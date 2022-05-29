package srl.neotech.controllers;

import java.security.Principal;
import java.sql.Date;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import srl.neotech.model.Movie;
import srl.neotech.services.MovieService;

@Controller
public class HomeViewController {
	
  @Autowired
   MovieService movieService;
  
  

	@RequestMapping (value="/", method=RequestMethod.GET)
	public String home(Principal principal) {
		
		String homePage="";
		if(principal != null && 
		   ((UsernamePasswordAuthenticationToken) principal).getAuthorities().stream().anyMatch(a -> a.getAuthority().equals("ROLE_CUSTOMER"))) homePage="/customer/home";
		
		if(principal != null && 
				   ((UsernamePasswordAuthenticationToken) principal).getAuthorities().stream().anyMatch(a -> a.getAuthority().equals("ROLE_MANAGER"))) homePage="/manager/home_page";
				
    return homePage;
	}
  
  
	@RequestMapping (value="/home", method=RequestMethod.GET)
	public String home(Model model) {
		Date oggi =new Date(System.currentTimeMillis());
		ArrayList<Movie> listaMovieUltimiArrivi=movieService.searchMovieByArrival(oggi);
		model.addAttribute("listaMoviesUltimiArrivi", listaMovieUltimiArrivi);
		
		ArrayList<Movie> listaMovieOfferteSpeciali=movieService.searchMovieByOffer();
		model.addAttribute("listaMoviesOfferteSpeciali", listaMovieOfferteSpeciali);
		return "home";
		
	}
	

	
	
}

