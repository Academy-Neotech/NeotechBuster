package srl.neotech.controllers;

import java.sql.Date;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import srl.neotech.model.Movie;
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

	
	
	}	
	

