package srl.neotech.controllers;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import srl.neotech.entity.MovieCrew;
import srl.neotech.model.Attore;
import srl.neotech.model.Movie;
import srl.neotech.requestresponse.ResponseBase;
import srl.neotech.requestresponse.SearchMovieByArrivalResponse;
import srl.neotech.requestresponse.SearchMovieByOfferResponse;
import srl.neotech.services.MovieService;

@RestController
public class MovieAPIController {


	@Autowired
	MovieService movieService;
	
	@ResponseBody 
	@GetMapping (value = "/api/getMovieByArrival", produces=MediaType.APPLICATION_JSON_VALUE) 
	public SearchMovieByArrivalResponse getMovieByArrival() {
		SearchMovieByArrivalResponse  response = new SearchMovieByArrivalResponse();
		
		try {
			
			Date oggi =new Date(System.currentTimeMillis());
			
			ArrayList<Movie> listaMovieUltimiArrivi=movieService.searchMovieByArrival(oggi);
			
			response.setLatestmovies(listaMovieUltimiArrivi);
			response.setCode("OK");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			response.setCode("KO");
			response.setDescr(e.getMessage());
		}
		
		return response;
		
	}
	
	@ResponseBody 
	@GetMapping (value = "/api/getMovieByOffer", produces=MediaType.APPLICATION_JSON_VALUE) 
	public SearchMovieByOfferResponse getMovieByOffer() {
		SearchMovieByOfferResponse  response = new SearchMovieByOfferResponse();
		
			try{
				ArrayList<Movie> listaMovieOfferteSpeciali=movieService.searchMovieByOffer();
			
			response.setMovieoffers(listaMovieOfferteSpeciali);
			response.setCode("OK");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			response.setCode("KO");
			response.setDescr(e.getMessage());
		}
		
		return response;
	}
	
	
	@ResponseBody 
	@GetMapping (value = "/api/getMovieByBudget/{budget}", produces=MediaType.APPLICATION_JSON_VALUE) 
	//--------------------------------------------------------------------Aggiungere se errore do OutpuStream
	public Movie getMovieByBudget(@PathVariable("budget") Integer budget, HttpServletResponse response) {

	Movie m=null;
	try {
		m = movieService.getMovieByBudget(budget);
		//Aggiungere se errore do OutpuStream
		response.getOutputStream().write(null, 0, response.getBufferSize());
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
	
    return m;
     
	}	
	
	@ResponseBody 
	@GetMapping (value = "/api/getTest/{id}", produces=MediaType.APPLICATION_JSON_VALUE) 
	//--------------------------------------------------------------------Aggiungere se errore do OutpuStream
	public List<MovieCrew> getTest(@PathVariable("id") Integer budget, HttpServletResponse response) {
		
		try {
			//response.getOutputStream().write(null, 0, response.getBufferSize());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return movieService.movieTest(budget);	
	}
	
	
	@ResponseBody 
	@GetMapping (value = "/api/getAttoriFromMovieTitle", produces=MediaType.APPLICATION_JSON_VALUE) 
	public ResponseBase getAttoriFromMovietitle(@RequestParam("titolo") String titolo) {
		ResponseBase response=new ResponseBase();
		
		try {
			List<Attore> attori=movieService.getAttoriFromMovietitle(titolo);
			response.setCode("OK");
			response.setSimpleData(attori);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			response.setCode("KO");
			response.setDescr(e.getMessage());
		}
		
	return response;	
	}
	
	@ResponseBody 
	@GetMapping (value = "/api/insertFilm", produces=MediaType.APPLICATION_JSON_VALUE) 
	public ResponseBase insertFilm(@RequestParam("movie_id") Integer movie_id, @RequestParam("movie_title")String movie_title) {
		ResponseBase response=new ResponseBase();
		  
		  try {
			movieService.insertMovie(movie_id, movie_title);
			response.setCode("OK");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			response.setCode("KO");
		}
		  
		  
		return response;
	}
	
	@ResponseBody 
	@GetMapping (value = "/api/deleteFilm", produces=MediaType.APPLICATION_JSON_VALUE) 
	public ResponseBase deleteFilm(@RequestParam("movie_id") Integer movie_id) {
		ResponseBase response=new ResponseBase();
		
		try {
			movieService.deleteFilm(movie_id);
			response.setCode("OK");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			response.setCode("KO");
		}
		
	return response;
	}
	
	
	
//	@ResponseBody 
//	@GetMapping (value = "/api/getMovieByLanguage/{language}", produces=MediaType.APPLICATION_JSON_VALUE) 
//	//--------------------------------------------------------------------Aggiungere se errore do OutpuStream
//	
//	public List<Movie> getMoviesByLanguage(@PathVariable("language") String language, HttpServletResponse response) {
//
//	List<srl.neotech.entity.Movie> m=null;
//	try {
//		m = movieService.getMoviesByLanguage(language);
//		//Aggiungere se errore do OutpuStream
//		response.getOutputStream().write(null, 0, response.getBufferSize());
//		
//	} catch (Exception e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}	
//	
//    return m;
//		
	}
	
	/*TODO  in JPAHibernate
	 * 
	 *    getMoviesFromLanguageCode
	 *    
	 *    getMoviesFromProductionCompany
	 *    
	 *    getMoviesSpecialOffer
	 *    
	 *    getMoviesLatestArrival
	 *    
	 *    getMovieswithGenderUnspecified
	 *    
	 *    getMoviesFromKeywordName
	 *    
	 *   
	 *    
	 */



