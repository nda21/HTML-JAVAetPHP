package algo;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Saisie du nombre d'élèves
        System.out.println("Combien d'élèves y a-t-il dans la classe ?");
        int nombreEleves = sc.nextInt();

        // Création du tableau pour stocker les notes
        double[] notes = new double[nombreEleves];
        double somme = 0;
        double maxNote = Double.MIN_VALUE;

        // Saisie des notes
        for (int i = 0; i < nombreEleves; i++) {
            System.out.println("Entrez la note de l'élève " + (i + 1) + " :");
            notes[i] = sc.nextDouble();

            // Calcul cumulatif de la somme des notes
            somme += notes[i];

            // Vérification de la note maximale
            if (notes[i] > maxNote) {
                maxNote = notes[i];
            }
        }

        // Calcul de la moyenne
        double moyenne = somme / nombreEleves;

        // Affichage des résultats
        System.out.println("La moyenne de la classe est : " + moyenne);
        System.out.println("La note la plus haute est : " + maxNote);

        sc.close();
    }
}
