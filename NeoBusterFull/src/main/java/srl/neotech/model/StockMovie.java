package srl.neotech.model;

import java.sql.Date;

public class StockMovie extends Movie{

	private Integer quantity;
	private Integer price;
	private Integer specialOffer;
	
	
	
	public StockMovie(Integer movie_id, String title, Integer budget, String homepage, String overview,
			Double popularity, Date release_date, Integer revenue, Integer runtime, String movie_status, String tagline,
			Double vote_average, Integer vote_count, String url_image) {
		super(movie_id, title, budget, homepage, overview, popularity, release_date, revenue, runtime, movie_status, tagline,
				vote_average, vote_count, url_image);
		
	}

	public StockMovie(Integer movie_id, String title, String url_image, Integer price,Integer specialOffer,Integer quantity) {
		super();
		this.price=price;
		this.quantity=quantity;
		this.specialOffer=specialOffer;
	}
	
	
	


	public Integer getQuantity() {
		return quantity;
	}



	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}



	public Integer getPrice() {
		return price;
	}



	public void setPrice(Integer price) {
		this.price = price;
	}



	public Integer getSpecialOffer() {
		return specialOffer;
	}



	public void setSpecialOffer(Integer specialOffer) {
		this.specialOffer = specialOffer;
	}

	
	
	
	

}
