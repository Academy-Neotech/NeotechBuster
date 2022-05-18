package srl.neotech.model;

import java.sql.Date;

public class LatestMovie  extends Movie{

	private Date dateArrived;
//  private Integer movie_id;
//	private String title;
//	private String url_image;
//	
	
	
	
	public LatestMovie(Integer movie_id, String title, Integer budget, String homepage, String overview,
			Double popularity, Date release_date, Integer revenue, Integer runtime, String movie_status, String tagline,
			Double vote_average, Integer vote_count, String url_image) {
		super(movie_id, title, budget, homepage, overview, popularity, release_date, revenue, runtime, movie_status, tagline,
				vote_average, vote_count, url_image);
		
	}


	public LatestMovie(Integer movie_id, String title, String url_image, Date dateArrived) {
		
		this.movie_id=movie_id;
		this.title=title;
		this.url_image=url_image;
		this.dateArrived=dateArrived;
		
	}
	
	


	public Date getDateArrived() {
		return dateArrived;
	}


	public void setDateArrived(Date dateArrived) {
		this.dateArrived = dateArrived;
	}


	public Integer getMovie_id() {
		return movie_id;
	}


	public void setMovie_id(Integer movie_id) {
		this.movie_id = movie_id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getUrl_image() {
		return url_image;
	}


	public void setUrl_image(String url_image) {
		this.url_image = url_image;
	}

	
	
	
	
}
