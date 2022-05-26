package srl.neotech.services;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import srl.neotech.dao.MovieDAO;
import srl.neotech.entity.MovieCast;
import srl.neotech.entity.MovieCastId;
import srl.neotech.entity.MovieCrew;
import srl.neotech.entity.Person;
import srl.neotech.model.Attore;
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
		
		public Movie getMovieByBudget(Integer budget){
			return movieDAO.searchMovieByBudget(budget);
		}
		
		public List<MovieCrew> movieTest(Integer id) {
		     	return movieDAO.moveCrewTest(id);
		}
		
		public List<Attore> getAttoriFromMovietitle(String title){
			return movieDAO.getAttorifromMovieTitle(title);
		}
	
		@Transactional //IUD 
		public void aggiungiCorrentista() {
			//Insert Update Delete	
			// correntisataDAO.aggiungi()
			// assegniDAO.RilasciaBlocchetto()
			//carteDiCreditoDAO.AssegnaCC() ---exception... compensare..  
			//AssicurazioneDAO.assegna().
		}
		//after
		
		
		
		@Transactional
		public void insertMovie(Integer movie_id, String movie_title) { 
			
			//entity
			srl.neotech.entity.Movie movie=new srl.neotech.entity.Movie();
		    movie.setId(movie_id);
		    movie.setTitle(movie_title);
		    movie.setBudget(4000);
		    movie.setHomepage("http://");
		    
		    
		    Person p=new Person();
		    p.setId(movie_id);
		    p.setPersonName("NomeCognome:"+movie_title);
		    
		    
		    MovieCast mc=new MovieCast();
		    mc.setCharacterName("BLABLA");
            
		    //reverse
		    mc.setMovie(movie);
            mc.setPerson(p);
            
            //key
		    MovieCastId mcId=new MovieCastId();
		    mcId.setMovieId(movie.getId());
		    mcId.setPersonId(p.getId());
		    mcId.setCastOrder(1);
		    mc.setId(mcId);
		    
		    //forward
		    movie.setMovieCasts(Collections.singleton(mc));		
		    p.setMovieCasts(Collections.singleton(mc));
		    
		    movieDAO.insertMovie(movie);
		}
		
		@Transactional
		public void deleteFilm(Integer movie_id) {
			movieDAO.deleteFilm(movie_id);
		}
		
//		public List<srl.neotech.entity.Movie> getMoviesByLanguage(String language){
//			return movieDAO.searchMovieByLanguage(language);
//		
		
		}		
		
