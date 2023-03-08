package Approvisionnements;

public class Approvisionnements {
	
	
    
    private int ID;
    private  String Station;
    private int quantitéGallonDiesel;
    private int QuantitéGallonGazoline;
    private String dateapp;

    public int getID() {
        return ID;
    }

    public String getStation() {
        return Station;
    }

    public int getQuantitéGallonDiesel() {
        return quantitéGallonDiesel;
    }

    public int getQuantitéGallonGazoline() {
        return QuantitéGallonGazoline;
    }

    public String getDateapp() {
        return dateapp;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setStation(String Station) {
        this.Station = Station;
    }

    public void setQuantitéGallonDiesel(int quantitéGallonDiesel) {
        this.quantitéGallonDiesel = quantitéGallonDiesel;
    }

    public void setQuantitéGallonGazoline(int QuantitéGallonGazoline) {
        this.QuantitéGallonGazoline = QuantitéGallonGazoline;
    }

    public void setDateapp(String dateapp) {
        this.dateapp = dateapp;
    }

    public Approvisionnement(int ID, String Station, int quantitéGallonDiesel, int QuantitéGallonGazoline, String dateapp) {
        this.ID = ID;
        this.Station = Station;
        this.quantitéGallonDiesel = quantitéGallonDiesel;
        this.QuantitéGallonGazoline = QuantitéGallonGazoline;
        this.dateapp = dateapp;
    }
    
    public Approvisionnement(){
        
        
    
        
    }
    
     Scanner sc=new Scanner(System.in);
    Approvisionnement et=new Approvisionnement();
    
    ArrayList<Approvisionnement> art =new ArrayList<>();
    
    public  static ArrayList<String> Enregistrer(){
        
        System.out.println("Entrer un element");
        
 
        
        return null;
    }
    public void Afficher( ArrayList<String> val){
        
        
    
    }

    private int nextInt() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
 
    
    
    
	public static void afficherApprovisionnements() {
		System.out.println("Liste des Approvisionnements");
	}
}
