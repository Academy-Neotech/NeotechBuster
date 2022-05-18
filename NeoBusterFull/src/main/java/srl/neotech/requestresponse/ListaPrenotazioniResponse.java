package srl.neotech.requestresponse;

import java.util.ArrayList;

import srl.neotech.model.Movie;

public class ListaPrenotazioniResponse {

	
	ArrayList<Movie> listaPrenotazioniRestituite = new ArrayList<Movie>();
	

	public ArrayList<Movie> getListaPrenotazioniRestituite() {
		return listaPrenotazioniRestituite;
	}

	public void setListaPrenotazioniRestituite(ArrayList<Movie> listaPrenotazioniRestituite) {
		this.listaPrenotazioniRestituite = listaPrenotazioniRestituite;
	}
	
	
	
}
