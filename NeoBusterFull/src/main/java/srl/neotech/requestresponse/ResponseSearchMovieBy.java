package srl.neotech.requestresponse;

import java.util.ArrayList;

import srl.neotech.model.Genre;
import srl.neotech.model.LatestMovie;
import srl.neotech.model.Movie;
import srl.neotech.model.Person;
import srl.neotech.model.StockMovie;

public class ResponseSearchMovieBy extends ResponseBase{

	private ArrayList<Movie>movies=new ArrayList<Movie>();
    
	private ArrayList<Genre>generi=new ArrayList<Genre>();
	
	private Integer page;
	
	public ArrayList<Movie> getMovies() {
		return movies;
	}
	public void setMovies(ArrayList<Movie> movies) {
		this.movies = movies;
	}
	public ArrayList<Genre> getGeneri() {
		return generi;
	}
	public void setGeneri(ArrayList<Genre> generi) {
		this.generi = generi;
	}
	public Integer getPage() {
		
		return page;
	}
	public void setPage(Integer page) {
		
		this.page = page;
		
	}

	
	
	
}
