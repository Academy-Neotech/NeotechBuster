package srl.neotech.model;

import java.sql.Date;

public class StockMovie extends Movie {

	private Integer quantity;
	private Integer price;
	private Boolean specialoffer;

	
	
	
	public StockMovie(Integer movie_id, String title, Integer budget, String homepage, String overview,
			Double popularity, Date release_date, Integer revenue, Integer runtime, String movie_status, String tagline,
			Double vote_average, Integer vote_count, String url_image) {
		super(movie_id, title, budget, homepage, overview, popularity, release_date, revenue, runtime, movie_status, tagline,
				vote_average, vote_count, url_image);
		
	}

	
	
	
	public StockMovie(Integer movie_id, String title, String url_image, Integer price,Boolean specialoffer,Integer quantity) {
		
		
		this.movie_id=movie_id;
		this.title=title;
		this.url_image=url_image;
		this.price=price;
		this.quantity=quantity;
		this.specialoffer=specialoffer;
	}
	
	
	public String getUrl_image() {
		return url_image;
	}




	public void setUrl_image(String url_image) {
		this.url_image = url_image;
	}




	public Integer getQuantity() {
		
		Integer i=new Integer(quantity);
		i.getClass().getName();
		
		if(i>5) {
		String.format("Buona",i).getClass().getName();	
	    }
		if(i<=5) {
			String.format("Scarsa",i).getClass().getName();	
		    }
		if(i==0) {
			String.format("Non Disponibile",i).getClass().getName();	
		    }
		if(i==1) {
			String.format("Ultimo Pezzo",i).getClass().getName();	
		    }
		
		return i;
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




	public Boolean getSpecialoffer() {
		return specialoffer;
	}




	public void setSpecialoffer(Boolean specialoffer) {
		this.specialoffer = specialoffer;
	}

	
	
	

}
