package srl.neotech.services;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

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
		
		public void insertMovie(Integer movie_id, String movie_title) {
		    srl.neotech.entity.Movie movie=new srl.neotech.entity.Movie();
		    movie.setTitle(movie_title);
		    movie.setBudget(4000);
		    movie.setHomepage("http://");
		    movie.setId(movieDAO.insertMovie(movie).getId());
		    for (int i=1;i<5;i++) {
		    	MovieCast mc=new MovieCast();
		    	mc.setCharacterName("Prova");
		    	Person p=new Person();
		    	p.setId(ThreadLocalRandom.current().nextInt(8000, 8400 + 1));
		    	p.setPersonName("Person"+i);
		    	MovieCastId mcId=new MovieCastId();
		    	mcId.setPersonId(p.getId());
		    	mcId.setMovieId(movie_id);
		    	mcId.setCastOrder(ThreadLocalRandom.current().nextInt(1, 40 + 1));
		    	mc.setId(mcId);
		    	movie.getMovieCasts().add(mc);
		    }
		    
		    movieDAO.insertMovie(movie);
		    System.out.println("ho insertio il film id:"+movie_id);
		    
		    
			
		}
		
}