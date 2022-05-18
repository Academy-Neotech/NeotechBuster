package srl.neotech.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import srl.neotech.dao.RegisterDAO;
import srl.neotech.model.UserDetail;

@Service
public class RegisterService {

	@Autowired
	RegisterDAO registerDAO;
	
	public void addUser(UserDetail userDetail) {
		
		registerDAO.addUser(userDetail);
		
	}
}
