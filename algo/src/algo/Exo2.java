/**
 * 
 */
package algo;

import java.util.Scanner;

/**
 * 
 */
public final class Exo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int nbr, nbr2;
		
		System.out.println("Veuillez saisir un nombre :");
		nbr = sc.nextInt();
		System.out.println("Veullez saisir un second nombre :");
		nbr2 = sc.nextInt();
		System.out.println("La table de ces nombre est :");
		tble(nbr,nbr2);
	}
	static void tble(int nbr, int nbr2) {
		for (int i = 1; i<= nbr2; i++) {
			System.out.println(i + "*"+nbr+"="+i*nbr);
		}

	}

}
