package algo;

import java.util.Scanner;

public class algo_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
				int nbr;
		System.out.println("Veuillez saisir un nombre :");
		nbr = sc.nextInt();
		System.out.println("La factorielle de ce nombre est :" + facto(nbr));

	}
	static int facto(int nbr) {
		int n = nbr;
		while (nbr >1) {
			nbr = nbr-1;
			n =n*nbr;
		}
		return n ;
		
	}
	
}
