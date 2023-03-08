package Station;

import java.util.ArrayList;
import java.util.Scanner;

public class Commandes
{

    //private static Station[] Station;
    private int commandeGasoline;
    private int commandeDiesel;
    private String id;
    private String dateCommande;
    private String etat;
    //static Station tab[]=new Station[2];
    Station stat=new Station();
    Scanner clav=new Scanner(System.in);
    Scanner clavStri=new Scanner(System.in);
    Commandes []tabCom=new Commandes[3];
    public Commandes(){this.etat = "N";}
    
    
    public Commandes(String id, int commandeGasoline, int commandeDiesel, String dateCommande)
    {
        this.id = id;
        this.commandeGasoline = commandeGasoline;
        this.commandeDiesel = commandeDiesel;
        this.dateCommande = dateCommande;
        this.etat = "N";
    }
    
//Les getters et les setters
    public int getcommandeGasoline() {
        return commandeGasoline;
    }

    public void setcommandeGasoline(int commandeGasoline) {
        this.commandeGasoline = commandeGasoline;
    }

    public int getcommandeDiesel() {
        return commandeDiesel;
    }

    public void setcommandeDiesel(int commandeDiesel) {
        this.commandeDiesel = commandeDiesel;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getdateCommande() {
        return dateCommande;
    }

    public void setdateCommande(String dateCommande) {
        this.dateCommande = dateCommande;
    }


////////////////////////////Les Mehodes\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
    void command()
    {
        int choix=0;
        int somGazo=0,somDiel=0;
        for(int i=0 ; i<tab.length; i++)
            
        {
           somGazo+=((tab[i].getCapaciteGazo()-tab[i].getQuantiteGazoD())*1.25);
           somDiel+=((tab[i].getCapaciteDies()-tab[i].getQuantiteDiesDis())*1.10);
        }
         
//   int prGazD=0;
        String rep="";
           // int prGaz=0;
          int i=0;
        //for(int i=0; i<tabCom.length; i++)
        //{
       // do{
            //int i=0;
            //tabCom[i]=new Commandes();
         //Commandes com=new Commandes();
        

           do{ 
              String pass="";
              /*System.out.println("1-. Pour Gazoline");
               System.out.println("2-. Pour Diesel");
               System.out.println("3-. Pour Gazoline et Diesel");
               System.out.println("Choix !!!");
              */
               tabCom[i]=new Commandes();
               choix=verifyeGD();
              System.out.println("Entrer votre mot de passe");
              pass=clavStri.nextLine();
              int co=0;
              while(!pass.equals("Authentic"))
              { 
                co+=1;
                                

                  if(co==3)
                  {
                      break;
                  }
                  System.out.println("Mot de passe incorrect !" + "\n"+"Entrer votre mot de passe");
                  pass=clavStri.nextLine();
                  //co+=1;
               }
              if(co!=3){
                switch(choix)
                {
                    case 1:
                    {
                        //
                        System.out.println("La commande du gazoline est effectuee avec succes");
                       // prGaz=somGazo;
                        tabCom[i].commandeGasoline=somGazo;

                    }break;

                    case 2:
                    {
                        System.out.println("La commande du succes est effectuee avec succes");  
                        //prGazD=somDiel;
                        tabCom[i].commandeDiesel=somDiel;
                                              
                    }break;
                    
                    case 3:
                    {
                        System.out.println("La commande des deux gaz sont effectuees avec succes"); 
                      //  prGaz=somGazo;
                        //prGazD=somDiel;        
                              tabCom[i].commandeGasoline=somGazo;
                              tabCom[i].commandeDiesel=somDiel;
                    }break;
                }    
              
              }
               
           if(i>0){
               if(i==1){
                   tabCom[i-1].etat="P";
               }
               if(i==2){
                 tabCom[i-1].etat="P";
                 tabCom[i-2].etat="P";
               }
           }
            tabCom[i].id=(i+1000)+"$";
            LocalDate date = LocalDate.now();
            // Convertir la date en une chaîne de caractères
            String dateString = date.toString();
            tabCom[i].dateCommande=dateString; 
            i+=1;
            System.out.println("O pour continuer N pour annuler");
            rep=clavStri.nextLine();
           }while(rep.equalsIgnoreCase("O"));

        }
           


        //Pour les affichers
    void afficherCommande()
    {
        System.out.println("Voici la liste des commandes ");
        for(Commandes s:tabCom)
        {//{
            //System.out.println(v.getNom());
            if(s==null)
            {             
                System.out.println();
            }
            else{
               System.out.println(s.toString()); 
               System.out.println();
            }
        }
            //if(s.getcommandeGasoline()!=0){
            //System.out.println(s.toString());
            //System.out.println();
            //}else{
            //System.out.println(s.toString());
            //System.out.println();
             //System.out.println("wwwwwwwwww");       
       // }
        
    }
    
    
    void supprimer()
    {
              //choix=clav.nextInt();
              String pass="";
              System.out.println("Entrer votre mot de passe");
              pass=clavStri.nextLine();
              int co=0;
              while(!pass.equals("Authentic"))
              { 
                co+=1;
                                

                  if(co==3)
                  {
                      break;
                  }
                  System.out.println("Mot de passe incorrect !" + "\n"+"Entrer votre mot de passe");
                  pass=clavStri.nextLine();
                  //co+=1;
               }
              if(co!=3){

		String codeSai;
		System.out.println("Entrer code du produit que vous voulez supprimer ");
		codeSai=clavStri.nextLine();
		for(int i=0; i<tabCom.length; i++)
		{

			if(tabCom[i].id.equalsIgnoreCase(codeSai))
			{
				tabCom[i].id="S";	
				tabCom[i].commandeGasoline=0;		
				tabCom[i].commandeDiesel=0;	
				tabCom[i].dateCommande="";
                                tabCom[i].etat="";
			}
                }
			//for(int i=0; i<tabCom.length; i++)
                        for(Commandes c : tabCom)
			{
                            
				//if(!tabCom[i].id.equalsIgnoreCase("S"))
                            if(c.getId().equalsIgnoreCase("S") || c==null)
				{
					//System.out.println(tabCom[i].toString());
                                        System.out.println();
				}
                            else
                            {
                                System.out.println(c.toString());
                            }
			}	
              }
    }

    @Override
    public String toString() {
        return    "Le code du commande                 =" + id+"\n" 
                + "Qnte Gazoline commande              =" + commandeGasoline+" Gallon(s)\n"
                + "Qnt Diesel commande                 =" + commandeDiesel+" Gallon(s)\n"
                + "La date du commande                 =" + dateCommande+"\n" 
                + "L'etat du commande                  =" + etat;
    }
    

            static int verifyeGD(){	
	Scanner ent=new Scanner(System.in);
	int num=0;
             boolean validInput = false;

        while (!validInput) {
               System.out.println("1-. Pour Gazoline");
               System.out.println("2-. Pour Diesel");
               System.out.println("3-. Pour Gazoline et Diesel");
               System.out.println("Choix !!!");
                String input = ent.nextLine();
		boolean isNumber = true;
            for (int a = 0; a < input.length(); a++) {
                if (!Character.isDigit(input.charAt(a))) {
                    isNumber = false;
                    break;
                }
				
            }
		if (isNumber)
                {
                    num = Integer.parseInt(input);
                    if (num<1 || num>3) {
                     System.out.println("Erreur : vous devez entrer un nombre entier compris entre 1 a 3 "); 
                     //System.out.println("Select le nom du Station \n1.--------Tabarre\n2.--------Petion-Ville\n3.--------Mirebalais\n4.--------Gressier");
                    }
                    else
                    {
                        validInput = true;
                    }
                }

		}		
		
                return num;	
		
	}
    
