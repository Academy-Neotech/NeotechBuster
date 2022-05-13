package srl.neotech.model;

import java.sql.Date;

public class LatestMovie extends Movie{

	

	private Integer price;
	private Integer quantity;
	private Date arrival_date;

	
	
	
	
	public Date getArrival_date() {
		return arrival_date;
	}
	public void setArrival_date(Date arrival_date) {
		this.arrival_date = arrival_date;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	
	public LatestMovie(Integer movie_id, String title, Integer budget, String homepage, String overview,
			Double popularity, Date release_date, Integer revenue, Integer runtime, String movie_status, String tagline,
			Double vote_average, Integer vote_count, String url_image) {
		super(movie_id, title, budget, homepage, overview, popularity, release_date, revenue, runtime, movie_status, tagline,
				vote_average, vote_count, url_image);
		// TODO Auto-generated constructor stub
	
	}
	public LatestMovie(Integer movie_id, String title, String url_image,Integer price, Integer quantity, Date arrival_date) {
		super();
		this.price=price;
		this.quantity= quantity;
		this.arrival_date= arrival_date;
		
			
		}
	
}


