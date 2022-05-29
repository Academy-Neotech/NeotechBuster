package srl.neotech.requestresponse;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;


import org.hibernate.validator.constraints.Length;

public class GetMovieByLanguageRequest {
	
	
	@Length(min=2, max=5)
	private String languageCode;
	
	@Min(1)
	@Max(10)
	private Integer numPagina;
	
	
	@Email
	private String email;
	
	
	
	
	public String getLanguageCode() {
		return languageCode;
	}
	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}
	public Integer getNumPagina() {
		return numPagina;
	}
	public void setNumPagina(Integer numPagina) {
		this.numPagina = numPagina;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	

}
