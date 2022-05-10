package srl.neotech.model;

public class Person{

	private Integer movie_id;
	private String person_name;
	
	
	
	public Person(Integer movie_id, String person_name) {
		super();
		this.movie_id= movie_id;
		this.person_name=person_name;
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
	
	
	
	
}
