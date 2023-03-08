package Ventes;

import java.util.ArrayList;

import Station.Station;

public class Ventes {
	private int id;
	private String station;
	private int quantiteGallonGazoline;
	private int quantiteGallonDiesel;
	private String dateVente;
	
	private static ArrayList<Ventes> listeVentes = new ArrayList<Ventes>();
	
	public Ventes(int id, String station, int quantiteGallonGazoline, int quantiteGallonDiesel, String dateVentes) {
		this.id = id;
		this.station = station;
		this.quantiteGallonGazoline = quantiteGallonGazoline;
		this.quantiteGallonDiesel = quantiteGallonDiesel;
		this.dateVente = dateVentes;
	}
}
