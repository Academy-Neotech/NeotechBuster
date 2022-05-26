package srl.neotech.dao;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.github.dozermapper.core.DozerBeanMapperBuilder;
import com.github.dozermapper.core.Mapper;

import srl.neotech.entity.Movie;
import srl.neotech.entity.MovieCrew;
import srl.neotech.entity.Person;
import srl.neotech.mapper.DozerMapper;
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
			srl.neotech.model.Movie movie = DozerMapper.getInstance().map(entity,srl.neotech.model.Movie.class);
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
				//...................mapper.............obj di partenza...classe di destinazione
				Attore attoreMappato=DozerMapper.getInstance().map(person,Attore.class);
			    listaAttori.add(attoreMappato);	
			}

			return listaAttori;
		}
		
		
		public Movie insertMovie(Movie movie) {
			return movieJPaRepository.saveAndFlush(movie);
		}
		
		
		public void deleteFilm(Integer movieId) {
			
		  	
			
		}
		

//		public List<Movie> searchMovieByLanguage(String language){
//			List<Movie> entity=movieJPaRepository.getMoviesByLanguage(language);
//			List<Movie> movie = GlobalMapper.INSTANCE.movieToLanguage(entity);
//			return movie;
		
		}

	
	

