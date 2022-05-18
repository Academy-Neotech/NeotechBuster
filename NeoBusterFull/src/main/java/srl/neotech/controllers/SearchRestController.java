package srl.neotech.controllers;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import srl.neotech.model.Genre;
import srl.neotech.model.Movie;
import srl.neotech.model.Person;
import srl.neotech.requestresponse.RequestSearchMovie;
import srl.neotech.requestresponse.ResponseSearchMovieBy;
import srl.neotech.services.GenereServices;
import srl.neotech.services.PersonServices;
import srl.neotech.services.SearchMovieServices;

@RestController
public class SearchRestController {

	private static final Logger logger = LogManager.getLogger(SearchMovieViewcontroller.class);
	
	@Autowired
	SearchMovieServices searchMovieServices;
	
	@Autowired
	PersonServices personServices;
	
	@Autowired
	GenereServices genereServices;
	
	
	
	@ResponseBody
	@PostMapping(value = "/api/searchMovieBy", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseSearchMovieBy searchMovieBy(@RequestBody RequestSearchMovie request) {
		ResponseSearchMovieBy response=new ResponseSearchMovieBy();
		
	    logger.info("info zone");
	    logger.debug("debug zone");
	    
	  try {
		 
		  Date oggi=new Date(System.currentTimeMillis());
		  
		  if(request.getTitle()!=null && request.getTitle().length()>0) {
	    ArrayList<Movie>listaFilm=searchMovieServices.searchMovieByTitle(request.getTitle());
			response.setMovies(listaFilm);
		  }else if (request.getPerson_name()!=null && request.getPerson_name().length()>0) {
			  ArrayList<Movie>listaFilm=searchMovieServices.searchMovieByPerson(request.getPerson_name());
				response.setMovies(listaFilm);
		}else if (request.getGenre_name()!=null && request.getGenre_name().length()>0) {
			ArrayList<Movie>listaGeneri=searchMovieServices.searchMovieByGenre(request.getGenre_name());
			response.setMovies(listaGeneri);
		}else if(request.getSpecialoffer()!=null && request.getSpecialoffer().booleanValue()==true) {
			ArrayList<Movie>listaOfferte=searchMovieServices.searchMovieByStockMovie(request.getSpecialoffer());
			response.setMovies(listaOfferte);
		}else{
			ArrayList<Movie>listaUltimiCaricamenti=searchMovieServices.searchMovieByLatest(oggi);
			response.setMovies(listaUltimiCaricamenti);
		}
		  
		
		response.setCode("OK");
	} catch (Exception e) {
		response.setCode("KO");
		response.setDescr(e.getMessage());
		e.printStackTrace();
	}
	  
	
	return response;
	
	}
	
	
	@ResponseBody
	@GetMapping(value = "/api/autocompleteForMovies", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<String> autocompleteForMovies(@RequestParam (name="q") String testo) {
		
	
		ArrayList<String>responseMovies=new ArrayList<String>();
		
		
		ArrayList<Movie>autoTitolMovie=searchMovieServices.searchMovieByTitle(testo);
		for (Movie movie : autoTitolMovie) {
			responseMovies.add(movie.getTitle());
		}

		return responseMovies;
	}
	
	@ResponseBody
	@GetMapping(value = "/api/autocompleteForActor", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<String> autocompleteForActor(@RequestParam (name="q") String testo) {
		
	
		ArrayList<String>responseActors=new ArrayList<String>();
		
		
		ArrayList<Person>autoPersonMovie=personServices.searchPersonByName(testo);
		for (Person person : autoPersonMovie) {
			responseActors.add(person.getPerson_name());
		}

		return responseActors;
	}
	
	
	@ResponseBody
	@GetMapping(value = "/api/genereForFront", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Genre> genereForFront(){
		
	
		
		return genereServices.getListGenre();
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@ResponseBody
//	@GetMapping(value = "/api/changePages",produces = MediaType.APPLICATION_JSON_VALUE )
//	public ResponseSearchMovieBy findPages(@RequestParam("page") int page, 
//			@RequestParam("size") int size, UriComponentsBuilder uriComponentsBuilder, HttpServletResponse response ) {
//		
//		
//		
//		return response;
//	}
//	
//	
	
}
