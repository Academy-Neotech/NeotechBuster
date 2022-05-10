package srl.neotech.requestresponse;


import java.util.ArrayList;

import srl.neotech.model.Movie;

public class SearchMovieByArrivalResponse extends ResponseBase {

	
	ArrayList<Movie> latestmovies = new ArrayList<Movie>();

	public ArrayList<Movie> getLatestmovies() {
		return latestmovies;
	}

	public void setLatestmovies(ArrayList<Movie> latestmovies) {
		this.latestmovies = latestmovies;
	}

	
	
	
}
