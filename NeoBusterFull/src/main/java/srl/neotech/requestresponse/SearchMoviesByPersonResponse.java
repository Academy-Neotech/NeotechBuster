package srl.neotech.requestresponse;

import java.util.ArrayList;

import srl.neotech.model.Movie;

public class SearchMoviesByPersonResponse extends ResponseBase{
	
	ArrayList<Movie> movies=new ArrayList<Movie>();

	public ArrayList<Movie> getMovies() {
		return movies;
	}

	public void setMovies(ArrayList<Movie> movies) {
		this.movies = movies;
	}
	
	

}
