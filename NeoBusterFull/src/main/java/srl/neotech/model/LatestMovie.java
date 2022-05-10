package srl.neotech.model;

import java.sql.Date;

public class LatestMovie  extends Movie{

	private Date dataArrived;
	
	
	
	
	public LatestMovie(Integer movie_id, String title, Integer budget, String homepage, String overview,
			Double popularity, Date release_date, Integer revenue, Integer runtime, String movie_status, String tagline,
			Double vote_average, Integer vote_count, String url_image) {
		super(movie_id, title, budget, homepage, overview, popularity, release_date, revenue, runtime, movie_status, tagline,
				vote_average, vote_count, url_image);
		
	}


	public LatestMovie(Integer movie_id, String title, String url_image, Date dataArrived) {
		super();
		this.dataArrived=dataArrived;
		
	}
	
	


	public Date getDataArrived() {
		return dataArrived;
	}




	public void setDataArrived(Date dataArrived) {
		this.dataArrived = dataArrived;
	}

	
	
	
	
}
