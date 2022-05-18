package srl.neotech.dao;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import srl.neotech.model.Movie;
import srl.neotech.repository.SearchMovieRepository;

@Component
public class SearchMovieDAO {

	@Autowired
	SearchMovieRepository searchMovieRepository;
	
		
	
	
	public List<Movie>searchMovieByTitle(String title){
		
		return searchMovieRepository.searchMovieByTitle(title);
	
	}
	
	public List<Movie>searchMovieByPerson(String person_name){
		
		return searchMovieRepository.searchMovieByPerson(person_name);
	}
	
	public List<Movie>searchMovieByGenre(String genre_name){
		
		return searchMovieRepository.searchMovieByGenre(genre_name);
	}
	
	public List<Movie>searchMovieByStockMovie(Boolean specialoffer){
		
		return searchMovieRepository.searchMovieByStockMovie(specialoffer);
	}
	
	public List<Movie>searchMovieByLatest(Date dateArrived){
		
		return searchMovieRepository.searchMovieByLatest(dateArrived);
	}
	
	
}
