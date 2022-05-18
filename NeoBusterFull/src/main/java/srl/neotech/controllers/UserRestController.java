package srl.neotech.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import srl.neotech.requestresponse.RegistrationRequest;
import srl.neotech.requestresponse.RegistrationResponse;
import srl.neotech.services.RegisterService;

@RestController
public class UserRestController {

	@Autowired
	RegisterService registerService;
	
	@PostMapping (value="api/addRegistration", produces = MediaType.APPLICATION_JSON_VALUE)
public RegistrationResponse addRegistration (@RequestBody RegistrationRequest request) {
		RegistrationResponse response = new RegistrationResponse();
		try {
			registerService.addUser(request.getRegistration());
			response.setCode("OK");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			response.setCode("KO");
			response.setDescr(e.getMessage());
			e.printStackTrace();
		}
		return response;
	

	}
}

