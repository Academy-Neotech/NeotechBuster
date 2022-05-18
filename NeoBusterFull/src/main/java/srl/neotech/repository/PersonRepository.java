package srl.neotech.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import srl.neotech.model.Person;

@Repository
public class PersonRepository {

	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;
	
	
	public List<Person>searchPersonByName(String person_name){
		MapSqlParameterSource parameterSource=new MapSqlParameterSource();
		parameterSource.addValue("person_name",person_name+"%");
		String query="select * from person p where p.person_name like :person_name limit 1,10";
		return jdbcTemplate.query(query, parameterSource, 
				(rs, rowNum)-> new Person(rs.getString("person_name"))
				);
	}
	
	
	
	
	
}
