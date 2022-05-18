package srl.neotech.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import srl.neotech.model.Person;
import srl.neotech.repository.PersonRepository;

@Component
public class PersonDAO {

	@Autowired
	PersonRepository personRepository;
	
	public List<Person>searchPersonByName(String person_name){
		return personRepository.searchPersonByName(person_name);
	}
	
}
