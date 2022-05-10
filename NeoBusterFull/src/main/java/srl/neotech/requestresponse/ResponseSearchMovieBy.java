package srl.neotech.requestresponse;

import java.util.ArrayList;

import srl.neotech.model.Genre;
import srl.neotech.model.Movie;
import srl.neotech.model.Person;

public class ResponseSearchMovieBy extends ResponseBase{

	private ArrayList<Movie>movies=new ArrayList<Movie>();
	private ArrayList<Person>persons=new ArrayList<Person>();
	private ArrayList<Genre>genres=new ArrayList<Genre>();
	
	
	public ArrayList<Movie> getMovies() {
		return movies;
	}
	public void setMovies(ArrayList<Movie> movies) {
		this.movies = movies;
	}
	public ArrayList<Person> getPersons() {
		return persons;
	}
	public void setPersons(ArrayList<Person> persons) {
		this.persons = persons;
	}
	public ArrayList<Genre> getGenres() {
		return genres;
	}
	public void setGenres(ArrayList<Genre> genres) {
		this.genres = genres;
	}
	
	
	
	
}