package srl.neotech.dao.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import srl.neotech.model.Genre;

@Repository
public class GenereRepository {

	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;
	
	

	
	public List<Genre>getListGenre(){
		MapSqlParameterSource parameterSource=new MapSqlParameterSource();
		String query="select * from genre g  order by g.genre_name;";
		return jdbcTemplate.query(query, parameterSource, 
				(rs, rowNum)-> new Genre(rs.getInt("genre_id"), rs.getString("genre_name"))
				);
	}
	
	
	
	
}
