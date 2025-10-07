package algo;
import java.util.Scanner;
public class mainCOMPTE {

	public static  String main(String[] args) {
		// TODO Auto-generated method stub
		COMPTE Compte1;
		int CIN,tél;
		String nom,prénom;
		
		Scanner scanner = new Scanner(System.in); 
		
		System.out.println("Compte1:");
		System.out.println("Donner le nom:");
		String nom1 = scanner.nextLine();
		
		System.out.println("Donner le Prénom:");
		String prénom1 = scanner.nextLine();
		
		return new COMPTE (nom, prénom);

	}

}
