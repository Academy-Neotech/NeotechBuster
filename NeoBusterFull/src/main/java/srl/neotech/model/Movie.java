package srl.neotech.model;

import java.sql.Date;

public class Movie {

	protected Integer movie_id;
	protected String title;
    protected Integer budget;
	protected String homepage;
	protected String overview;
	protected Double popularity;
	protected Date release_date;
	protected Integer revenue;
	protected Integer runtime;
	protected String movie_status;
	protected String tagline;
	protected Double vote_average;
	protected Integer vote_count;
	protected String url_image;
	protected Integer quantity;
	protected Integer price;
	protected Date arrived_date;
	protected Boolean specialoffer;
	
	protected UserFromGoRest utenteDaGoRest;
	
	
	public Movie() {
		
	}
	
	
	



	public Movie(Integer movie_id, String title, Integer budget, String homepage, String overview, Double popularity,
			Date release_date, Integer revenue, Integer runtime, String movie_status, String tagline,
			Double vote_average, Integer vote_count, String url_image) {
		super();
		this.movie_id = movie_id;
		this.title = title;
		this.budget = budget;
		this.homepage = homepage;
		this.overview = overview;
		this.popularity = popularity;
		this.release_date = release_date;
		this.revenue = revenue;
		this.runtime = runtime;
		this.movie_status = movie_status;
		this.tagline = tagline;
		this.vote_average = vote_average;
		this.vote_count = vote_count;
		this.url_image = url_image;
	
	}

	
	public Movie(Integer movie_id, String title, String url_image,Integer price, Integer quantity, Boolean specialOffer) {
	this.movie_id= movie_id;
	this.title= title;
	this.url_image= url_image;
	this.quantity= quantity;
	this.price= price;
	this.specialoffer= specialOffer;
	}
			

	public Movie(Integer movie_id, String title,Integer quantity, Integer price) {
		this.movie_id=movie_id;
		this.title = title;
		this.price=price;
		this.quantity=quantity;
	}


	
	public Movie(Integer movie_id, String title, String url_image,Integer price, Integer quantity,Date arrival_date) {
		this.movie_id= movie_id;
		this.title= title;
		this.url_image= url_image;
		this.quantity= quantity;
		this.price= price;
		this.arrived_date= arrival_date;
				
		}
	


	public Date getArrived_date() {
		return arrived_date;
	}



	public void setArrived_date(Date arrived_date) {
		this.arrived_date = arrived_date;
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
	public Integer getBudget() {
		return budget;
	}
	public void setBudget(Integer budget) {
		this.budget = budget;
	}
	public String getHomepage() {
		return homepage;
	}
	public void setHomepage(String homepage) {
		this.homepage = homepage;
	}
	public String getOverview() {
		return overview;
	}
	public void setOverview(String overview) {
		this.overview = overview;
	}
	public Double getPopularity() {
		return popularity;
	}
	public void setPopularity(Double popularity) {
		this.popularity = popularity;
	}
	public Date getRelease_date() {
		return release_date;
	}
	public void setRelease_date(Date release_date) {
		this.release_date = release_date;
	}
	public Integer getRevenue() {
		return revenue;
	}
	public void setRevenue(Integer revenue) {
		this.revenue = revenue;
	}
	public Integer getRuntime() {
		return runtime;
	}
	public void setRuntime(Integer runtime) {
		this.runtime = runtime;
	}
	public String getMovie_status() {
		return movie_status;
	}
	public void setMovie_status(String movie_status) {
		this.movie_status = movie_status;
	}
	public String getTagline() {
		return tagline;
	}
	public void setTagline(String tagline) {
		this.tagline = tagline;
	}
	public Double getVote_average() {
		return vote_average;
	}
	public void setVote_average(Double vote_average) {
		this.vote_average = vote_average;
	}
	public Integer getVote_count() {
		return vote_count;
	}
	public void setVote_count(Integer vote_count) {
		this.vote_count = vote_count;
	}
	public String getUrl_image() {
		return url_image;
	}
    public void setUrl_image(String url_image) {
		this.url_image = url_image;
	}




	public Integer getQuantity() {
        return this.quantity;
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






	public UserFromGoRest getUtenteDaGoRest() {
		return utenteDaGoRest;
	}






	public void setUtenteDaGoRest(UserFromGoRest utenteDaGoRest) {
		this.utenteDaGoRest = utenteDaGoRest;
	}
	
	
	
	
}
