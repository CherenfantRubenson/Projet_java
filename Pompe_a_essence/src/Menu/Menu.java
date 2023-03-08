package Menu;
import Station.Station;
import Commandes.Commandes;

import java.util.Scanner;

import Approvisionnements.Approvisionnements;
import Ventes.Ventes;


public class Menu {
	public static void afficherMenu() {
		System.out.println("\t\t\t\t\t=========================================");
		System.out.println("\t\t\t\t\t====               Menu              ====");
		System.out.println("\t\t\t\t\t=========================================");
		System.out.println();
		System.out.println("\t\t\t\t\t1. Stations");
		System.out.println("\t\t\t\t\t2. Commandes");
		System.out.println("\t\t\t\t\t3. Lancer Approvisionnement");
		System.out.println("\t\t\t\t\t4. Ventes");
		
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		switch (option) {
	    case 1:
	    	Station stations = new Station(null, option, option);
	    	stations.afficherNomsStations();
	        break;
	    case 2:
	        Commandes commandes = new Commandes();
	        commandes.afficherCommandes();
	        break;
	    case 3:
	        Approvisionnements approvisionnements = new Approvisionnements();
	        approvisionnements.afficherApprovisionnements();
	        break;
	    case 4:
	        Ventes ventes = new Ventes();
	        ventes.afficherVentes();
	        break;
	    default:
	        System.out.println("Vous faites un mauvais choix");
	        break;
	}
	}
}
