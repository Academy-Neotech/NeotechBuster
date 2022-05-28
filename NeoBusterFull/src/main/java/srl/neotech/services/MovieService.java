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
import srl.neotech.dao.PersonDAO;
import srl.neotech.entity.MovieCast;
import srl.neotech.entity.MovieCastId;
import srl.neotech.entity.MovieCrew;
import srl.neotech.entity.Person;
import srl.neotech.mapper.DozerMapper;
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
	
		
		public List<Movie>getMoviesFromPCompany(String companyName){
			return movieDAO.getMoviesFromPCompany(companyName);
		}
		
		public List<Movie>getMoviesFromSpecialOffer(Integer specialOffer){
			return movieDAO.getMoviesFromSpecialOffer(specialOffer);
		}
		
		public List<Movie>getMoviesFromLatestArrival(String dateArrived){
			return movieDAO.getMoviesFromLatestArrival(dateArrived); 
		}
		
		public List<Movie>getMoviesFromGenderUnspecified(String gender){
			return movieDAO.getMoviesFromGenderUnspecified(gender);
		}
		
		public List<Movie>getMoviesFromKeywordName(String keywordName){
			return movieDAO.getMoviesFromKeywordName(keywordName);
		}
		
		
		
		
		public List<srl.neotech.model.Movie>getMoviesFromLanguageCode(String languageCode){
			   List<srl.neotech.entity.Movie>movies=movieDAO.getMoviesFromLanguageCode(languageCode);
			   
			   List<srl.neotech.model.Movie>listaFilm=new ArrayList<srl.neotech.model.Movie>();
			   
			   for (srl.neotech.entity.Movie movie:movies) {
				   srl.neotech.model.Movie filmMappati=DozerMapper.getInstance().map(movie,srl.neotech.model.Movie.class);
				   listaFilm.add(filmMappati);
			   }
			
			   
			   
			return listaFilm;
		}
		
		
		@Transactional
		public void insertPerson(Integer person_id,String person_name) {
			Person person=new Person();
			person.setId(person_id);
			person.setPersonName(person_name);
			
			
			srl.neotech.entity.Movie movie=movieDAO.getMovieByiD(5); 
			
			
			MovieCast cast=new MovieCast();
			cast.setCharacterName("Char test");
			
			cast.setPerson(person);
			cast.setMovie(movie);
			
			
			MovieCastId castId=new MovieCastId();
			castId.setPersonId(person.getId());
			castId.setMovieId(movie.getId());
			castId.setCastOrder(300);
			cast.setId(castId);
			
			
			person.setMovieCasts(Collections.singleton(cast));
			movie.setMovieCasts(Collections.singleton(cast));
			
			movieDAO.insertPerson(person);
			
		}
		
		
		
		
		
		
		
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
		
}