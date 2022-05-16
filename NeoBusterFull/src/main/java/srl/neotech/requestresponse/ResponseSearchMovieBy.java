package srl.neotech.requestresponse;

import java.util.ArrayList;

import srl.neotech.model.Genre;
import srl.neotech.model.LatestMovie;
import srl.neotech.model.Movie;
import srl.neotech.model.Person;
import srl.neotech.model.StockMovie;

public class ResponseSearchMovieBy extends ResponseBase{

	private ArrayList<Movie>movies=new ArrayList<Movie>();

	public ArrayList<Movie> getMovies() {
		return movies;
	}
	public void setMovies(ArrayList<Movie> movies) {
		this.movies = movies;
	}

	
	
	
}
