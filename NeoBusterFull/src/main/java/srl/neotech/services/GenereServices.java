package srl.neotech.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import srl.neotech.dao.GenereDAO;
import srl.neotech.model.Genre;

@Service
public class GenereServices {

	@Autowired
	GenereDAO genereDAO;
	
	
	
	public List<Genre>getListGenre(){
		return genereDAO.getListGenre();
	}
	
	
	
	
}
