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
		Station petionVille = new Station("P�tion Ville", 670, 978);
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
		
		if(option == 0) {
			enregistrerStation();
		}
		
		for(int i = 0; i < listeStation.size(); i++) {
			if(option == i+1) {
				System.out.println("\t\t\t\t===============================================");
				System.out.println("\t\t\t\t            "+(i+1)+". Station "+listeStation.get(i)+"            ");
				System.out.println("\t\t\t\t===============================================");
				System.out.println("\t\t\t\t   Capacit� en Gazoline : "+listeStation.get(i).capaciteGazoline+" Gallon(s)");
				System.out.println("\t\t\t\t   Capacit� en Diesel : "+listeStation.get(i).capaciteDiesel+" Gallon(s)");
				System.out.println("\t\t\t\t   Utilisation Gazoline : "+listeStation.get(i).utilisationGazoline+"%");
				System.out.println("\t\t\t\t   Utilisation Diesel : "+listeStation.get(i).utilisationDiesel+"%");
				System.out.println("\t\t\t\t   Quantit� Gazoline disponible : "+listeStation.get(i).quantiteGazoline+" Gallon(s)");
				System.out.println("\t\t\t\t   Quantit� Diesel disponible : "+listeStation.get(i).quantiteDiesel+" Gallon(s)");
			}
	}
	}
	
	public static void enregistrerStation() {
		String nom_new_station;
		int capacite_gazoline;
		int capacite_diesel;
		System.out.println("Entrer le nom de la station");
		Scanner sc = new Scanner(System.in);
		nom_new_station = sc.nextLine();
		System.out.println("Entrer la capacite en gazoline");
		capacite_gazoline = sc.nextInt();
		System.out.println("Entrer la capacite en diesel");
		capacite_diesel = sc.nextInt();
		
		Station newStation = new Station(nom_new_station,capacite_gazoline,capacite_diesel);
		listeStation.add(newStation);
		 System.out.println("Station enregistree avec succes");
		 
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
			
			Scanner sca = new Scanner(System.in);
			int option1 = sca.nextInt();
			
			if(option1 == 0) {
				enregistrerStation();
			}
			
			for(int i = 0; i < listeStation.size(); i++) {
				if(option1 == i+1) {
					System.out.println("\t\t\t\t===============================================");
					System.out.println("\t\t\t\t            "+(i+1)+". Station "+listeStation.get(i)+"            ");
					System.out.println("\t\t\t\t===============================================");
					System.out.println("\t\t\t\t   Capacit� en Gazoline : "+listeStation.get(i).capaciteGazoline+" Gallon(s)");
					System.out.println("\t\t\t\t   Capacit� en Diesel : "+listeStation.get(i).capaciteDiesel+" Gallon(s)");
					System.out.println("\t\t\t\t   Utilisation Gazoline : "+listeStation.get(i).utilisationGazoline+"%");
					System.out.println("\t\t\t\t   Utilisation Diesel : "+listeStation.get(i).utilisationDiesel+"%");
					System.out.println("\t\t\t\t   Quantit� Gazoline disponible : "+listeStation.get(i).quantiteGazoline+" Gallon(s)");
					System.out.println("\t\t\t\t   Quantit� Diesel disponible : "+listeStation.get(i).quantiteDiesel+" Gallon(s)");
				}
		}
	}
	
}
