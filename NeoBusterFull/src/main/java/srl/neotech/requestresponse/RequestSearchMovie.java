package srl.neotech.requestresponse;

import srl.neotech.model.Genre;
import srl.neotech.model.Movie;
import srl.neotech.model.Person;

public class RequestSearchMovie {

	private String movie;
	private String person;
	private String genre;
	
	
	
	public String getMovie() {
		return movie;
	}
	public void setMovie(String movie) {
		this.movie = movie;
	}
	public String getPerson() {
		return person;
	}
	public void setPerson(String person) {
		this.person = person;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}

	
	
}
