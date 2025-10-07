package algo;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice, nbr, nbr2;
        String replay;

        do {
            // Affichage du menu
            System.out.println("Que souhaitez-vous faire ? (1 : factorielle ; 2 : multiplication)");
            choice = sc.nextInt(); // Récupérer le choix de l'utilisateur

            switch (choice) {
                case 1: // Factorielle
                    System.out.println("Entrez un nombre pour calculer sa factorielle : ");
                    nbr = sc.nextInt();
                    System.out.println("La factorielle de " + nbr + " est " + factorial(nbr));
                    break;

                case 2: // Multiplication
                    System.out.println("Entrez le premier nombre : ");
                    nbr = sc.nextInt();
                    System.out.println("Entrez le deuxième nombre : ");
                    nbr2 = sc.nextInt();
                    System.out.println("Le résultat de la multiplication est : " + (nbr * nbr2));
                    break;

                default: // Cas où l'utilisateur entre un choix invalide
                    System.out.println("Choix invalide. Veuillez entrer 1 ou 2.");
            }

            // Demander à l'utilisateur s'il veut relancer le programme
            System.out.println("Voulez-vous relancer le programme ? (oui/non)");
            replay = sc.next();

        } while (replay.equalsIgnoreCase("oui")); // Relancer tant que l'utilisateur entre "oui"

        System.out.println("Merci d'avoir utilisé le programme. Au revoir !");
        sc.close();
    }

    // Méthode pour calculer la factorielle
    public static int factorial(int num) {
        if (num < 0) {
            System.out.println("La factorielle n'est pas définie pour les nombres négatifs.");
            return -1;
        }
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}
