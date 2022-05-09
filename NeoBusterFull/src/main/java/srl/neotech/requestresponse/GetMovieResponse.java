package srl.neotech.requestresponse;

import srl.neotech.model.Movie;

public class GetMovieResponse extends ResponseBase{
	
	private Movie movie;

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	
	
	

}
