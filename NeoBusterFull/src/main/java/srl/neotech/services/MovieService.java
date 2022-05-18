package srl.neotech.services;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import srl.neotech.dao.MovieDAO;
import srl.neotech.model.Movie;

@Service
public class MovieService {

	@Autowired 
	MovieDAO movieDAO;
	

	
	
		public ArrayList<Movie> searchMovieByArrival (Date arrival_date){
		List <Movie> listaTornataDalDDAO = movieDAO.searchMovieByArrival(arrival_date);
		ArrayList<Movie>  listaInviataAlController = new  ArrayList<Movie>();
		listaInviataAlController.addAll(listaTornataDalDDAO);
		
		return listaInviataAlController;
		
		
}
		
		public ArrayList<Movie> searchMovieByOffer (){
			List <Movie> listaTornataDalDDAO = movieDAO.searchMovieByOffer();
			ArrayList<Movie>  listaInviataAlController = new  ArrayList<Movie>();
			listaInviataAlController.addAll(listaTornataDalDDAO);
			
			return listaInviataAlController;
		
		
		}		
		
}