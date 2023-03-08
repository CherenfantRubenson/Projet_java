package Ventes;

public class Ventes {
	  private int ID;
    private String Station;
    private int quantitéGallonDiesel;
    private int  QuantitéGallonGazoline;
    private  String dateVente;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getStation() {
        return Station;
    }

    public void setStation(String Station) {
        this.Station = Station;
    }

    public int getQuantitéGallonDiesel() {
        return quantitéGallonDiesel;
    }

    public void setQuantitéGallonDiesel(int quantitéGallonDiesel) {
        this.quantitéGallonDiesel = quantitéGallonDiesel;
    }

    public int getQuantitéGallonGazoline() {
        return QuantitéGallonGazoline;
    }

    public void setQuantitéGallonGazoline(int QuantitéGallonGazoline) {
        this.QuantitéGallonGazoline = QuantitéGallonGazoline;
    }

    public String getDateVente() {
        return dateVente;
    }

    public void setDateVente(String dateVente) {
        this.dateVente = dateVente;
    }

    public Vente() {
    }

    public Vente(int ID, String Station, int quantitéGallonDiesel, int QuantitéGallonGazoline, String dateVente) {
        this.ID = ID;
        this.Station = Station;
        this.quantitéGallonDiesel = quantitéGallonDiesel;
        this.QuantitéGallonGazoline = QuantitéGallonGazoline;
        this.dateVente = dateVente;
    }
    
    
}
