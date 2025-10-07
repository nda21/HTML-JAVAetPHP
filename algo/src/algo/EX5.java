package algo;

public class EX5{

    // Fonction pour trouver la valeur maximale d'un tableau de réels
    public static double valeurMaximale(double[] tableau, int nombreElements) {
        // Vérification que le tableau n'est pas vide
        if (nombreElements == 0 || tableau == null) {
            throw new IllegalArgumentException("Le tableau est vide ou nul.");
        }

        // Initialiser le maximum avec le premier élément
        double max = tableau[0];

        // Parcourir le tableau pour trouver la valeur maximale
        for (int i = 1; i < nombreElements; i++) {
            if (tableau[i] > max) {
                max = tableau[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        // Exemple d'utilisation de la fonction
        double[] tableau = {15.5, 22.0, 3.8, 18.7, 29.3};
        int nombreElements = tableau.length;

        // Appel de la fonction pour trouver le maximum
        double max = valeurMaximale(tableau, nombreElements);

        // Affichage du résultat
        System.out.println("La valeur maximale du tableau est : " + max);
    }
}



