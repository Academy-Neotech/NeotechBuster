package srl.neotech.dao;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import srl.neotech.entity.Movie;
import srl.neotech.entity.MovieCrew;
import srl.neotech.entity.Person;
import srl.neotech.mapper.GlobalMapper;
import srl.neotech.model.Attore;
import srl.neotech.repository.MovieJPARepository;
import srl.neotech.repository.MovieRepository;



@Component
public class MovieDAO {

	@Autowired
	MovieRepository movieRepository;

	@Autowired
	MovieJPARepository  movieJPaRepository;
	
	
		
		public List<srl.neotech.model.Movie> searchMovieByArrival (Date arrival_date){

		return movieRepository.searchMovieByArrival(arrival_date);

		}
		
		public List<srl.neotech.model.Movie> searchMovieByOffer (){
			return movieRepository.searchMovieByOffer();	
	}
		
		public srl.neotech.model.Movie searchMovieByBudget(Integer budget){
			srl.neotech.entity.Movie entity=movieJPaRepository.getMovieByBudget(budget);
			srl.neotech.model.Movie movie = GlobalMapper.INSTANCE.movieEntityToMovie(entity);
			return movie;
		}
		
		public List<MovieCrew> moveCrewTest(Integer id){
			List<MovieCrew> listaMovieCrew=movieJPaRepository.getTest(id);

			return listaMovieCrew;
		}
		
		
		
		
		public List<Attore> getAttorifromMovieTitle(String title){
			List<Person> persons=movieJPaRepository.getPersonsFromMovieTitle(title);
			
			List<Attore> listaAttori=new ArrayList<Attore>();
			
			for (Person person: persons) {
				Attore attoreAMano=new Attore();
				attoreAMano.setPersonName(person.getPersonName());
			    listaAttori.add(attoreAMano);	
			}

			return listaAttori;
		}
		
		
		public Movie insertMovie(Movie movie) {
			return movieJPaRepository.save(movie);
		}
		
	
}
	
	

