package srl.neotech.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import srl.neotech.model.LatestMovie;
import srl.neotech.model.Movie;
import srl.neotech.model.StockMovie;

@Repository
public class MovieRepository {

	
	
	
	
	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;
	
	
	public List<Movie> searchMovieByArrival (Date arrival_date){
		MapSqlParameterSource params = new MapSqlParameterSource();
		params.addValue("Latest Date", arrival_date);
	//Query
			String query= "SELECT m.movie_id, m.title, m.url_image, sm.price, sm.quantity, sm.date_arrived from movie m, stockmovie sm where m.movie_id=sm.movie_id and sm.date_arrived>= CURDATE() - INTERVAL 365 DAY limit 4;";
	
	
			return jdbcTemplate.query(query,
				params,
				(rs, rowNum) ->new Movie(rs.getInt("movie_id"),rs.getString("title"),rs.getString("url_image"),rs.getInt("price"),rs.getInt("quantity"),rs.getDate("date_arrived"))
				);
	
	
	}	
	
		
	public List<Movie> searchMovieByOffer (){
		MapSqlParameterSource params = new MapSqlParameterSource();
	
	//Query
			String query= "SELECT m.movie_id, m.title, m.url_image, sm.price, sm.quantity, sm.specialoffer from movie m, stockmovie sm where m.movie_id=sm.movie_id and sm.specialoffer=1 limit 4;";
	
	
			return jdbcTemplate.query(query,
				params,
				(rs, rowNum) ->new Movie(rs.getInt("movie_id"),rs.getString("title"),rs.getString("url_image"),rs.getInt("price"),rs.getInt("quantity"),rs.getBoolean("specialoffer"))
				);
	
	
			
		
	}
	
	
}
