package srl.neotech.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import srl.neotech.dao.repository.RegisterRepository;
import srl.neotech.model.UserDetail;

@Component

public class RegisterDAO {

	@Autowired
	RegisterRepository registerRepository;

	
	public void addUser(UserDetail userDetail) {
		
		registerRepository.addUser(userDetail);
		
	}
}
