package Commandes;

public class Commandes {
	 
    private  int ID;
    private int quantiteGallonDiesel;
    private int QuantiteGallonGazoline;
    private String dateCommande;
    private String etat;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getQuantiteGallonDiesel() {
        return quantiteGallonDiesel;
    }

    public void setQuantiteGallonDiesel(int quantiteGallonDiesel) {
        this.quantiteGallonDiesel = quantiteGallonDiesel;
    }

    public int getQuantiteGallonGazoline() {
        return QuantiteGallonGazoline;
    }

    public void setQuantiteGallonGazoline(int QuantiteGallonGazoline) {
        this.QuantiteGallonGazoline = QuantiteGallonGazoline;
    }

    public String getDateCommande() {
        return dateCommande;
    }

    public void setDateCommande(String dateCommande) {
        this.dateCommande = dateCommande;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    
    
    public Commandes() {
    }

 
    
  public  ArrayList<String> Enregistrer() {
    ArrayList<String> commandesList = new ArrayList<>();
    Commandes  com = new Commandes();
    
    Scanner myobject = new Scanner(System.in);
    
    // Ajouter les valeurs des attributs à l'ArrayList
    System.out.println("Entrer l'ID du commande");
    
     com.setID(myobject.nextInt(ID));
    
  
    
    com.setQuantiteGallonDiesel(myobject.nextInt(quantiteGallonDiesel));
    
   
    
    
    
    commandesList.add(Integer.toString(ID));
    commandesList.add(Integer.toString(quantiteGallonDiesel));
    commandesList.add(Integer.toString(QuantiteGallonGazoline));
    commandesList.add(dateCommande);
    
    
    return commandesList;
}
  
  public void afficher() {
    ArrayList<String> commandesList = Enregistrer();
    System.out.println("ID: " + commandesList.get(0));
    System.out.println("Quantité de Gallons de Diesel: " + commandesList.get(1));
    System.out.println("Quantité de Gallons de Gazoline: " + commandesList.get(2));
    System.out.println("Date de Commande: " + commandesList.get(3));
    System.out.println("Etat: " + commandesList.get(4));
}

}
