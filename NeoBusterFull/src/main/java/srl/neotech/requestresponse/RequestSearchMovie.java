package srl.neotech.requestresponse;

import java.sql.Date;

public class RequestSearchMovie {

	private String title;
	private String person_name;
	private String genre_name;
	private Boolean specialoffer;
	private Date dateArrived;
	
	
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPerson_name() {
		return person_name;
	}
	public void setPerson_name(String person_name) {
		this.person_name = person_name;
	}
	
	public String getGenre_name() {
		return genre_name;
	}
	public void setGenre_name(String genre_name) {
		this.genre_name = genre_name;
	}
	
	public Boolean getSpecialoffer() {
		return specialoffer;
	}
	public void setSpecialoffer(Boolean specialoffer) {
		this.specialoffer = specialoffer;
	}
	public Date getDateArrived() {
		return dateArrived;
	}
	public void setDateArrived(Date dateArrived) {
		this.dateArrived = dateArrived;
	}
	
	
	
	
	
}
