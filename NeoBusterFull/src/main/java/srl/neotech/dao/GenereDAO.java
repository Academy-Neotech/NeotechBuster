package srl.neotech.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import srl.neotech.dao.repository.GenereRepository;
import srl.neotech.model.Genre;

@Component
public class GenereDAO {

	@Autowired
	GenereRepository genereRepository;
	
	
	
	
	public List<Genre>getListGenre(){
		return genereRepository.getListGenre();
	}
	
}
