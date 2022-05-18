package srl.neotech.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import srl.neotech.model.Movie;

@Repository
public class SearchMovieRepository {

	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;
	
	
	

	public List<Movie>searchMovieByTitle(String title){
		
		
		
	    MapSqlParameterSource parameterSource=new MapSqlParameterSource();
		parameterSource.addValue("titleMovie",title+"%");
		
		String query="select m.movie_id, m.title, s.price, s.quantity from movie m, stockmovie s where m.movie_id=s.movie_id and m.movie_id=s.movie_id and  m.title like :titleMovie limit 20";
		System.out.println("prova:"+title);
		
		return jdbcTemplate.query(query, parameterSource,
				(rs, rowNum) -> new Movie(rs.getInt("movie_id"),rs.getString("title"),rs.getInt("price"),rs.getInt("quantity"))	
				);
	}

	
	
	
	
	public List<Movie>searchMovieByPerson(String person_name){
		
		MapSqlParameterSource parameterSource=new MapSqlParameterSource();
		parameterSource.addValue("person_name",person_name+"%");
		
		String query="select m.movie_id, m.title, s.price, s.quantity  from  movie m, movie_cast mc, person p , stockmovie s where m.movie_id=mc.movie_id and p.person_id=mc.person_id and m.movie_id=s.movie_id and p.person_name like :person_name limit 20";
		return jdbcTemplate.query(query, parameterSource, 
				(rs, rowNum)-> new Movie(rs.getInt("movie_id"), rs.getString("title"),rs.getInt("price"),rs.getInt("quantity"))
				);
	}
	
	
	public List<Movie>searchMovieByGenre(String genre_name){
		
		MapSqlParameterSource parameterSource=new MapSqlParameterSource();
		parameterSource.addValue("genre_name",genre_name);
		
		String query="select m.movie_id, m.title, s.price, s.quantity from movie m, movie_genres mg, genre g ,stockmovie s where m.movie_id=mg.movie_id and g.genre_id=mg.genre_id and m.movie_id=s.movie_id and g.genre_name= :genre_name limit 20;";
		return jdbcTemplate.query(query, parameterSource, 
				(rs, rowNum)-> new Movie(rs.getInt("movie_id"), rs.getString("title"),rs.getInt("price"),rs.getInt("quantity"))
				);
	}


	public List<Movie>searchMovieByStockMovie(Boolean specialoffer){
		
		MapSqlParameterSource parameterSource=new MapSqlParameterSource();
		parameterSource.addValue("specialoffer",specialoffer);
	
	    String query="select m.movie_id, m.title , s.price, s.quantity from movie m, stockmovie s where m.movie_id=s.movie_id and s.specialoffer=1 limit 20;"; 
	    return jdbcTemplate.query(query, parameterSource,
	    		(rs, rowNum) -> new Movie(rs.getInt("movie_id"),rs.getString("title"),rs.getInt("price"),rs.getInt("quantity"))
	    		);		
		
	}
	
	public List<Movie>searchMovieByLatest(Date dateArrived){
		
		MapSqlParameterSource parameterSource=new MapSqlParameterSource();
		parameterSource.addValue("datearrived", dateArrived);
		
		String query="";
		return jdbcTemplate.query(query, parameterSource,
				(rs, rowNum)-> new Movie(rs.getInt("movie_id"), rs.getString("title"),rs.getInt("price"),rs.getInt("quantity")) 
				);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
}
