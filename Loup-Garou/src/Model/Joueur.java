package Model;

public class Joueur {
// Variable privé
    private String nom;
    private Role role;
    private boolean vivant = true;
//constructeur 
    public Joueur(String nom, Role role) {
        this.nom = nom;
        this.role = role;
    }

    public String getNom() {
        return nom;
    }

    public Role getRole() {
        return role;
    }

    public boolean estVivant() {
        return vivant;
    }

    public void tuer() {
        vivant = false;
    }

    public String toString() {
        return nom + " - " + (vivant ? "Vivant" : "Mort") + " (" + role + ")";
    }
}
