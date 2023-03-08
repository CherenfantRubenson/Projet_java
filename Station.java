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
	public Station(){
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
		Station petionVille = new Station("Petion Ville", 670, 978);
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
	 
         
	public static void enregistrerStation() {
            	 Scanner sc = new Scanner(System.in);

		 Scanner scan=new Scanner(System.in);
        System.out.print("Nom de Station:");
        String nom = sc.nextLine();
        
     
         System.out.print("capacite de Gazoline:");
         int capaciteGazo = scan.nextInt();
    
         System.out.print("capacite de Diesel:");
         int capaciteDiesel = scan.nextInt();
         System.out.print("Quantite de Gazoline:");
         int QuantiteGazo = scan.nextInt();
     
         System.out.print("Quantite de Diesel:");
         int Quantite_Diesel = scan.nextInt();
         
          Station et =new Station();
    
    System.out.println("========================================================");
    et.nomStation=nom;
    et.capaciteGazoline= capaciteGazo;
    et.capaciteDiesel = capaciteDiesel;
    et.quantiteGazoline = QuantiteGazo;
    et.quantiteDiesel= Quantite_Diesel;
    
    
   //art.add(new Stations(et.getNomStat(),et.getCapaciteGazo(),et.getCapaciteDiesel(),et.getPourcentageGazo(),et.getPourcentageDiesel(),et.getQuantite_Gazo(),et.getQuantite_Diesel()));
    //}   
     listeStation.add(et);
	}
        public static void modifierQuantiteGazoline(){
            	 Scanner sc = new Scanner(System.in);
                 System.out.println("Quelle station souhaitez-vous modifier sa quantite de gazoline?");
                 String choix=sc.nextLine();
                 System.out.println("La nouvelle quantite de gazoline de cette station ");
                 int c=sc.nextInt();
                
   
                 for(Station i:listeStation){
                     if(i.nomStation.equalsIgnoreCase(choix)){
                         i.quantiteGazoline=c;
                     }
                     break;
                 }
            
        }
        public static void modifierQuantiteDiesel(){
             Scanner sc = new Scanner(System.in);
                 System.out.println("Quelle station souhaitez-vous modifier sa quantite de diesel?");
                 String choix=sc.nextLine();
                 System.out.println("La nouvelle quantite de diesel de cette station ");
                 int c=sc.nextInt();
                             for(Station i:listeStation){
                     if(i.nomStation.equalsIgnoreCase(choix)){
                         i.quantiteDiesel=c;
                     }
                     break;
                 }
            
        }
        public static void stationMinDiesel(){
            
        }
	public static void stationMinGazoline(){
            
        }
        public static void stationMaxDiesel(){
        
        }
        public static void stationMaxGazoline(){
        
        
        }
        
        public static void afficherMenuStation() {
		System.out.println("\t\t\t\t\t=========================================");
		System.out.println("\t\t\t\t\t====               Menu              ====");
		System.out.println("\t\t\t\t\t=========================================");
		System.out.println();
		System.out.println("\t\t\t\t\t1. Modifier quantite de gazoline");
		System.out.println("\t\t\t\t\t2. Modifier quantite de diesel");
		
		
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		switch (option) {
            
	    case 1:
                Station stat = new Station(null, option, option);
	    	stat.modifierQuantiteGazoline();
//	    	Station stations = new Station(null, option, option);
//	    	stations.afficherNomsStations();
	        break;
            default:
                System.out.println("Vous faites un mauvais choix");
	        break;
                
                }
        }
}
