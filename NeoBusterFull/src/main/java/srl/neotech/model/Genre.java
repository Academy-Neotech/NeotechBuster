package srl.neotech.model;

import java.sql.Date;

public class Genre extends Movie{

	private Integer genre_id;
	private String genre_name;
	private String title;
	private Integer movie_id;
	private Genere genere;
	
	
	public Genre(Integer movie_id, String title, Integer budget, String homepage, String overview,
			Double popularity, Date release_date, Integer revenue, Integer runtime, String movie_status, String tagline,
			Double vote_average, Integer vote_count, String url_image) {
		super(movie_id, title, budget, homepage, overview, popularity, release_date, revenue, runtime, movie_status, tagline,
				vote_average, vote_count, url_image);
		
	}
	
	
	public Genre(Integer genre_id,String genre_name,String title,Integer movie_id) {
	super();
	this.genre_id=genre_id;
	this.genre_name=genre_name;
	this.title=title;
	this.movie_id=movie_id;
	}



	public Integer getGenre_id() {
		return genre_id;
	}



	public void setGenre_id(Integer genre_id) {
		this.genre_id = genre_id;
	}



	public String getGenre_name() {
		return genre_name;
	}



	public void setGenre_name(String genre_name) {
		this.genre_name = genre_name;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public Integer getMovie_id() {
		return movie_id;
	}


	public void setMovie_id(Integer movie_id) {
		this.movie_id = movie_id;
	}


	public Genere getGenere() {
		return genere;
	}


	public void setGenere(Genere genere) {
		this.genere = genere;
	}
	
	
	
	
	
}
