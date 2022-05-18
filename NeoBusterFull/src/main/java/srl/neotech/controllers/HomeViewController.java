package srl.neotech.controllers;

import java.sql.Date;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
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
  
	@RequestMapping (value="/home", method=RequestMethod.GET)
	public String home(Model model) {
		Date oggi =new Date(System.currentTimeMillis());
		ArrayList<Movie> listaMovieUltimiArrivi=movieService.searchMovieByArrival(oggi);
		model.addAttribute("listaMoviesUltimiArrivi", listaMovieUltimiArrivi);
		
		ArrayList<Movie> listaMovieOfferteSpeciali=movieService.searchMovieByOffer();
		model.addAttribute("listaMoviesOfferteSpeciali", listaMovieOfferteSpeciali);
		return "home";
		
	}
	@RequestMapping(value="/prova", method = RequestMethod.GET)
	public String prova() {
		return "prova";
		
	}
	
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String login() {
		return "login";
	
	
	}
	
	@RequestMapping(value="/register", method = RequestMethod.GET)
	public String register() {
		return "register";
	
	}
	
	@RequestMapping(value="/ricerca_film", method = RequestMethod.GET)
	public String ricerca_film() {
		return "ricerca_film";
	
	
	}
	
	@RequestMapping(value="/prenota_film", method = RequestMethod.GET)
	public String prenota_film() {
		return "prenota_film";
	
	
	}
	
	
	@RequestMapping(value="/listra_prenotazioni", method = RequestMethod.GET)
	public String lista_prenotazioni() {
		return "lista_prenotazioni";
	
	}
	
	
	@RequestMapping(value="/gestione_carta", method = RequestMethod.GET)
	public String gestione_carta() {
		return "gestione-carta";
	
	}
	
	
	
	
//	@RequestMapping(value="/listaprenotazioni", method = RequestMethod.GET)
//	public String listaprenotazioni(Model model) {
//		ListaPrenotazioniResponse response=new ListaPrenotazioniResponse();
//		
//		
//		return "lista_prenotazioni";

}

