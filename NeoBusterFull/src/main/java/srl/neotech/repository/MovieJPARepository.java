package srl.neotech.repository;

import java.util.List;

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
	@Query("select p from Person p join fetch  p.movieCasts mc where mc.movie.title= :titolo")
	public List<Person>   getPersonsFromMovieTitle (String titolo);
	
	
	
	
	
}
