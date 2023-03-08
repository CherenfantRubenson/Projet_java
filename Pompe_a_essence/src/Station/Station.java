package Station;

import java.util.ArrayList;
import java.util.Scanner;

public class Station {
	private String nomStation;
	private int capaciteGazoline;
	private int capaciteDiesel;
	private int utilisationGazoline;
	private int utilisationDiesel;
	private int quantiteGazoline;
	private int quantiteDiesel;
	
	private static ArrayList<Station> listeStation = new ArrayList<Station>();
	
//	Constructeur de la classe
	public Station(String nom_station, int capacite_gazoline, int capacite_diesel) {
		this.nomStation = nom_station;
		this.capaciteGazoline = capacite_gazoline;
		this.capaciteDiesel = capacite_diesel;
		this.utilisationGazoline = 100;
		this.utilisationDiesel = 100;
		this.quantiteGazoline = 0;
		this.quantiteDiesel = 0;
	}
	
//	Liste des getters
	public String getNomStation() {
		return nomStation;
	}
	
	public int getCapaciteGazoline() {
		return capaciteGazoline;
	}
	
	public int getCapaciteDiesel() {
		return capaciteDiesel;
	}
	
	public int getUtilisationGazoline() {
		return utilisationGazoline;
	}
	
	public int getUtilisationDiesel() {
		return utilisationDiesel;
	}
	
	public int getQuantiteGazoline() {
		return quantiteGazoline;
	}
	
	public int getQuantiteDiesel() {
		return quantiteDiesel;
	}
	
	@Override
    public String toString() {
        return nomStation;
    }
	
	public int toStrin1() {
        return capaciteGazoline;
    }
	
	
//	Methode qui cree la liste des 4 stations par defaut
	public static void defaultStation() {
		Station tabarre = new Station("Tabarre", 490, 378);
		Station petionVille = new Station("Pétion Ville", 670, 978);
		Station gressier = new Station("Gressier", 170, 340);
		Station mirebalais = new Station("Mirebalais", 487, 845);
		
		listeStation.add(tabarre);
		listeStation.add(petionVille);
		listeStation.add(gressier);
		listeStation.add(mirebalais);
	}

//	Methode qui affiche les stations
	public static void afficherNomsStations() {
		defaultStation();
		System.out.println("\t\t\t\t===============================================");
		System.out.println("\t\t\t\t Tapez 0 pour Enregistrer une nouvelle station");
		System.out.println("\t\t\t\t===============================================");
		System.out.println();
		System.out.println("\t\t\t\t\t======= Liste des stations ======");
		System.out.println();
		for (int i = 0; i < listeStation.size(); i++) {
            
            System.out.println("\t\t\t\t\t\t"+(i+1)+". Station "+listeStation.get(i));
        }	
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		
		for(int i = 0; i < listeStation.size(); i++) {
			if(option == 0) {
				
			}else {
				if(option == i+1) {
					System.out.println("\t\t\t\t===============================================");
					System.out.println("\t\t\t\t            "+(i+1)+". Station "+listeStation.get(i)+"            ");
					System.out.println("\t\t\t\t===============================================");
					System.out.println("\t\t\t\t   Capacité en Gazoline : "+listeStation.get(i).capaciteGazoline+" Gallon(s)");
					System.out.println("\t\t\t\t   Capacité en Diesel : "+listeStation.get(i).capaciteDiesel+" Gallon(s)");
					System.out.println("\t\t\t\t   Utilisation Gazoline : "+listeStation.get(i).utilisationGazoline+"%");
					System.out.println("\t\t\t\t   Utilisation Diesel : "+listeStation.get(i).utilisationDiesel+"%");
					System.out.println("\t\t\t\t   Quantité Gazoline disponible : "+listeStation.get(i).quantiteGazoline+" Gallon(s)");
					System.out.println("\t\t\t\t   Quantité Diesel disponible : "+listeStation.get(i).quantiteDiesel+" Gallon(s)");
				}
			}
		}
	}
	
	public static void enregistrerStation() {
		
	}
	
}
