package srl.neotech.requestresponse;

import java.util.ArrayList;

import srl.neotech.model.Movie;

public class SearchMovieByOfferResponse extends ResponseBase {

	
	ArrayList<Movie> movieoffers = new ArrayList<Movie>();

	public ArrayList<Movie> getMovieoffers() {
		return movieoffers;
	}

	public void setMovieoffers(ArrayList<Movie> movieoffers) {
		this.movieoffers = movieoffers;
	}

	
	
	
}
