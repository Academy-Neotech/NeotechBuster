package srl.neotech.requestresponse;

import srl.neotech.model.UserDetail;

public class RegistrationResponse extends ResponseBase {
	private UserDetail registration;

	public UserDetail getRegistration() {
		return registration;
	}

	public void setRegistration(UserDetail registration) {
		this.registration = registration;
	}	
	
}
