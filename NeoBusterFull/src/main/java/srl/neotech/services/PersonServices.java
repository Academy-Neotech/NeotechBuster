package srl.neotech.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import srl.neotech.dao.PersonDAO;
import srl.neotech.dao.SearchMovieDAO;
import srl.neotech.model.Movie;
import srl.neotech.model.Person;

@Service
public class PersonServices {

	@Autowired
	PersonDAO personDAO;
	
	
	
	public ArrayList<Person>searchPersonByName(String person_name){
		List<Person>listMovieByPerson=personDAO.searchPersonByName(person_name);
		ArrayList<Person>listOfPersonToController=new ArrayList<Person>();
		listOfPersonToController.addAll(listMovieByPerson);
		return listOfPersonToController;
	}
	
	
	
}
