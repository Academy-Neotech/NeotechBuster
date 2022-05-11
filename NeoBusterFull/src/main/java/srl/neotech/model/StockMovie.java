package srl.neotech.model;

import java.sql.Date;

public class StockMovie  extends Movie {

	private Integer quantity;
	private Integer price;
	private Integer specialOffer;
	
	
//stock movie and latest movie are two type of section who implements the methods of movies , like person or genre, so if i check this two section, 
//the research will be search movie from stock movie with multiple section like : search movie from stock movie with person, or stock movie with title 
//or simply stock movie , so i guess its correct.Under i try to implements this type of think other to extends the movie class
	
	
	
	
	
	
	
	public StockMovie(Integer movie_id, String title, Integer budget, String homepage, String overview,
			Double popularity, Date release_date, Integer revenue, Integer runtime, String movie_status, String tagline,
			Double vote_average, Integer vote_count, String url_image) {
		super(movie_id, title, budget, homepage, overview, popularity, release_date, revenue, runtime, movie_status, tagline,
				vote_average, vote_count, url_image);
		
	}

	public StockMovie(Integer genre_id,String genre_name) {
		super (genre_id, genre_name);
		}
	
	
	public StockMovie(Integer movie_id, String title, String url_image, Integer price,Integer specialOffer,Integer quantity,String genre_name) {
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
