package srl.neotech.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import srl.neotech.entity.Movie;
import srl.neotech.entity.MovieCrew;
import srl.neotech.entity.Person;



public interface MovieJPARepository extends JpaRepository<Movie, Integer>{
	
	
	@Query("select m from Movie m where m.budget = :budget")
	public Movie getMovieByBudget(@Param("budget") Integer budget);

	
	@Query("select m from MovieCrew m where m.id.movieId = :id")
	public List<MovieCrew> getTest(@Param("id") Integer id);
	
	
	//     HQL-------
	@Query("select p from Person p join p.movieCasts mc where mc.movie.title= :titolo")
	public List<Person>   getPersonsFromMovieTitle (String titolo);
	
	
	@Query("select m from Movie m join m.movieLanguages ml where ml.language.languageCode= :language_code")
	public Page<Movie> getMoviesFromLanguageCode(@Param ("language_code")String languageCode, Pageable pageable);
	
	
	@Query("select m from Movie m join m.productionCompanies pc where pc.companyName= :companyName")
	public List<Movie>getMoviesFromPCompany(@Param("companyName") String companyName);
	
	@Query("select m from Movie m join m.stockmovie sm where sm.specialoffer= :specialOffer")
	public List<Movie>getMoviesFromSpecialOffer(@Param("specialOffer")Integer specialoffer);
	
	@Query("select m from Movie m join m.stockmovie sm where sm.dateArrived= :date_arrived")
	public List<Movie>getMoviesFromLatestArrival(@Param("date_arrived")String dateArrived);
	
	@Query("select m from Movie m join m.movieCasts mc where mc.gender.gender= :Unspecifed")
	public List<Movie>getMoviesFromGenderUnspecified(@Param("Unspecifed")String gender);
	
	@Query("select m from Movie m join m.keywords k where k.keywordName= :keywordName")
	public List<Movie>getMoviesFromKeywordName(@Param("keywordName")String keywordName);
	
    
	
	
}
