package srl.neotech.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import srl.neotech.entity.Movie;
import srl.neotech.entity.MovieCrew;

public interface MovieJPARepository extends JpaRepository<Movie, Integer>{
	
	
	@Query("select m from MovieEntity m where m.budget = :budget")
	public Movie getMovieByBudget(@Param("budget") Integer budget);

	@Query("select m from Movie_CrewEntity m where m.id.movieId = :id")
	public List<MovieCrew> getTest(@Param("id") Integer id);
	
	
}
