package srl.neotech.dao;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

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

	
	
@Autowired
SessionFactory sessionFactory;


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
		
   
			
		@Transactional
		public Page<Movie>getMoviesFromLanguageCode(String languageCode){
			Pageable pageableRequest = PageRequest.of(1,100);
			return movieJPaRepository.getMoviesFromLanguageCode(languageCode,pageableRequest);
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

	
	

