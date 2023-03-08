package Test;

import java.util.Scanner;
import Menu.Menu;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String user = "admin";
		String pass = "admin123";
		System.out.println("\t\t\t\t\t===============================================");
		System.out.println("\t\t\t\t\t=======                                 =======");
		System.out.println("\t\t\t\t\t             BIENVENUE A POMPE SYS              ");
		System.out.println("\t\t\t\t\t=======                                 =======");
		System.out.println("\t\t\t\t\t===============================================");
		System.out.println();
		System.out.println("\t\t\t\t\t\tVeuillez vous identifier svp!");
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.print("\t\t\t\t\t\t\tUsername : ");
		String username = sc.nextLine();
		System.out.print("\t\t\t\t\t\t\tPassword : ");
		String password = sc.nextLine();
		
		if(password.equals(pass) && username.equals(user)) {
			System.out.println("\n\n\n\n\n\n\n\n\n\n");
			Menu menu = new Menu();
			menu.afficherMenu(); 
		}else {
			System.out.println("Username ou password incorrect");
		}
	}

}
