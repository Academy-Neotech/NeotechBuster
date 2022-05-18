package srl.neotech.services;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import srl.neotech.dao.SearchMovieDAO;
import srl.neotech.model.Movie;

@Service
public class SearchMovieServices {

	@Autowired 
	SearchMovieDAO searchMovieDAO;
	
	
	
	public ArrayList<Movie>searchMovieByTitle(String title){
		
		List<Movie>listMovieByTitle=searchMovieDAO.searchMovieByTitle(title);
		ArrayList<Movie>listOfTitleToController=new ArrayList<Movie>();
		listOfTitleToController.addAll(listMovieByTitle);
		return listOfTitleToController;
		
	}
	
	public ArrayList<Movie>searchMovieByPerson(String person_name){
		
		List<Movie>listMovieByPerson=searchMovieDAO.searchMovieByPerson(person_name);
		ArrayList<Movie>listOfPersonToController=new ArrayList<Movie>();
		listOfPersonToController.addAll(listMovieByPerson);
		return listOfPersonToController;
	}
	
	
	public ArrayList<Movie>searchMovieByGenre(String genre_name){
		
		List<Movie>listMovieByGenre=searchMovieDAO.searchMovieByGenre(genre_name);
		ArrayList<Movie>listOfGenresToController=new ArrayList<Movie>();
		listOfGenresToController.addAll(listMovieByGenre);
		return listOfGenresToController;
	}
	
	public ArrayList<Movie>searchMovieByStockMovie(Boolean specialoffer){
		
		List<Movie>listMovieByStockMovie=searchMovieDAO.searchMovieByStockMovie(specialoffer);
		ArrayList<Movie>listOfStockToController=new ArrayList<Movie>();
		listOfStockToController.addAll(listMovieByStockMovie);
		return listOfStockToController;
	}
	
	
	//inserire logica di buisness per definire il rapporto tra la data di caricamento e la data attuale
	
	
	public ArrayList<Movie>searchMovieByLatest(Date dateArrived){
		
		List<Movie>listMovieByLatest=searchMovieDAO.searchMovieByLatest(dateArrived);
		ArrayList<Movie>listOfLatestMovieToController=new ArrayList<Movie>();
		listOfLatestMovieToController.addAll(listMovieByLatest);
		return listOfLatestMovieToController;
	}
	
	
}
