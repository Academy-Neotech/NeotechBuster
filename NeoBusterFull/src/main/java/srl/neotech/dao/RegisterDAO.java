package srl.neotech.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import srl.neotech.model.UserDetail;
import srl.neotech.repository.RegisterRepository;

@Component

public class RegisterDAO {

	@Autowired
	RegisterRepository registerRepository;

	
	public void addUser(UserDetail userDetail) {
		
		registerRepository.addUser(userDetail);
		
	}
}
