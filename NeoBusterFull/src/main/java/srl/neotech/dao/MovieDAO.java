package srl.neotech.dao;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import srl.neotech.model.Movie;
import srl.neotech.repository.MovieRepository;

@Component
public class MovieDAO {

	@Autowired
	MovieRepository movieRepository;

		
		public List<Movie> searchMovieByArrival (Date arrival_date){
		return movieRepository.searchMovieByArrival(arrival_date);

		
		}
		public List<Movie> searchMovieByOffer (){
			return movieRepository.searchMovieByOffer();
		
	}
	
}
	
	

