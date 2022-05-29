package srl.neotech.controllers;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javax.servlet.http.HttpServletResponse;
import javax.validation.ConstraintViolationException;
import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.Length;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonBackReference;

import srl.neotech.entity.MovieCrew;
import srl.neotech.model.Attore;
import srl.neotech.model.ErrorMessage;
import srl.neotech.model.Movie;
import srl.neotech.requestresponse.GetMovieByLanguageRequest;
import srl.neotech.requestresponse.ResponseBase;
import srl.neotech.requestresponse.SearchMovieByArrivalResponse;
import srl.neotech.requestresponse.SearchMovieByOfferResponse;
import srl.neotech.services.MovieService;

@RestController
@Validated
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
	
	/*TODO  in JPAHibernate
	 * 
	 *    getMoviesFromLanguageCode  V
	 *    
	 *    getMoviesFromProductionCompany   V
	 *    
	 *    getMoviesSpecialOffer         V
	 *    
	 *    getMoviesLatestArrival        V
	 *    
	 *    getMovieswithGenderUnspecified    V
	 *    
	 *    getMoviesFromKeywordName      V
	 *    
	 *   
	 *   insert e update
	 *   
	 *   
	 */
	
	
	
	
	
	@ResponseBody 
	@JsonBackReference
	@GetMapping (value = "/api/getMoviesFromLanguageCode", produces=MediaType.APPLICATION_JSON_VALUE) 
	public 	ResponseBase getMoviesFromLanguageCode(@RequestParam("language_code")  @Length(min = 2,message="errore lunghezza minima non rispettata") String languageCode,@RequestParam("num_pagina") @Min(1) @Max(100) Integer numPagina) {
	ResponseBase resp=new ResponseBase();
		try {
			List<Movie>movieList=null;		
			movieList=movieService.getMoviesFromLanguageCode(languageCode,numPagina);
			resp.setSimpleData(movieList);
		}catch(javax.validation.ConstraintViolationException e) {
			resp.setDescr(e.getMessage());
			resp.setCode("KO");
		}
		catch (Exception e) {
			e.printStackTrace();
			resp.setCode("KO");
		}
	return resp;
	}
	
	@ResponseBody 
	@GetMapping (value = "/api/getMoviesFromLatestArrival", produces=MediaType.APPLICATION_JSON_VALUE) 
	public ResponseBase getMoviesFromLatestArrival(@RequestParam("specialOffer")String dataArrived) {
		ResponseBase reBase=new ResponseBase();
	
		try {
			List<Movie>movieList=movieService.getMoviesFromLatestArrival(dataArrived);
			reBase.setSimpleData(movieList);
			reBase.setCode("OK");
		} catch (Exception e) {
			reBase.setCode("KO");
			reBase.setDescr(e.getMessage());
			e.printStackTrace();
		}
		
		
	
	return reBase; 
	}
	
	
	@ResponseBody 
	@GetMapping (value = "/api/getMoviesFromGenderUnspecifed", produces=MediaType.APPLICATION_JSON_VALUE) 
	public ResponseBase getMoviesFromGenderUnspecifed(@RequestParam("Unspecifed")String gender) {
		ResponseBase reBase=new ResponseBase();
	
	try {
		List<Movie>movieList=movieService.getMoviesFromGenderUnspecified(gender);
		reBase.setSimpleData(movieList);
		reBase.setCode("OK");
	} catch (Exception e) {
		reBase.setCode("KO");
		reBase.setDescr(e.getMessage());
		e.printStackTrace();
	}
		
	return reBase;	
	
	}
	
	

	@ResponseBody 
	@GetMapping (value = "/api/getMoviesFromKeywordName", produces=MediaType.APPLICATION_JSON_VALUE) 
	public ResponseBase getMoviesFromKeywordName(@RequestParam("keywordName")String keywordName) {
		ResponseBase reBase=new ResponseBase();
	
	
		try {
			List<Movie>movieList=movieService.getMoviesFromKeywordName(keywordName);
			reBase.setSimpleData(movieList);
			reBase.setCode("OK");
		} catch (Exception e) {
			reBase.setCode("KO");
			reBase.setDescr(e.getMessage());
			e.printStackTrace();
		}
		
		
	return reBase;
	}
	
	@ResponseBody
	@GetMapping (value = "/api/insertPerson", produces=MediaType.APPLICATION_JSON_VALUE) 
	public ResponseBase insertPerson(@RequestParam("person_id")Integer person_id,@RequestParam("person_name") String person_name) {
		ResponseBase base=new ResponseBase();
		
		try {
			movieService.insertPerson(person_id, person_name);
			base.setCode("OK");
		} catch (Exception e) {
			base.setCode("KO");
			base.setDescr(e.getMessage());
			e.printStackTrace();
		}
		
		return base;
	}
	
	
	
	
	
	
	
	
	
	
	@ResponseBody 
	@JsonBackReference
	@PostMapping (value = "/api/getMoviesFromLanguageCode", produces=MediaType.APPLICATION_JSON_VALUE) 
	public 	ResponseBase getMoviesFromLanguageCodePOST(@Valid @RequestBody GetMovieByLanguageRequest request) {
		ResponseBase resp=new ResponseBase();
		
		try {
			List<Movie>movieList=null;		
			movieList=movieService.getMoviesFromLanguageCode(request.getLanguageCode(),request.getNumPagina());
			resp.setSimpleData(movieList);
		}catch(javax.validation.ConstraintViolationException e) {
			resp.setDescr(e.getMessage());
			resp.setCode("KO");
		}
		catch (Exception e) {
			e.printStackTrace();
			resp.setCode("KO");
		}
	return resp;
	}

	@ResponseBody 
	@GetMapping (value = "/api/insertFilm", produces=MediaType.APPLICATION_JSON_VALUE) 
	public ResponseBase insertFilm(@RequestParam("movie_id")Integer movie_id, @RequestParam("movie_title")String movie_title, BindingResult errors) {
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
}



