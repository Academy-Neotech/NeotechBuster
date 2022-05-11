package srl.neotech.model;

import java.sql.Date;

public class Person extends Movie{

	private Integer movie_id;
	private String person_name;
	private String title;
	
	public Person(Integer movie_id, String title, Integer budget, String homepage, String overview,
			Double popularity, Date release_date, Integer revenue, Integer runtime, String movie_status, String tagline,
			Double vote_average, Integer vote_count, String url_image) {
		super(movie_id, title, budget, homepage, overview, popularity, release_date, revenue, runtime, movie_status, tagline,
				vote_average, vote_count, url_image);
		
	}
	
	
	
	public Person(Integer movie_id, String person_name,String title) {
		super();
		this.movie_id= movie_id;
		this.person_name=person_name;
		this.title=title;
		  
	}



	public Integer getMovie_id() {
		return movie_id;
	}



	public void setMovie_id(Integer movie_id) {
		this.movie_id = movie_id;
	}



	public String getPerson_name() {
		return person_name;
	}



	public void setPerson_name(String person_name) {
		this.person_name = person_name;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}
	
	
	
	
}
