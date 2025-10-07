package model;

public class LIVRE {
	private String ISBN;
	private String titre;
	private float prix;
	private ADHERENT Emprunteur;
	private AUTEUR Auteur;
	
	public LIVRE (String iSBN, String titre, float prix, ADHERENT Emprunteur, AUTEUR Auteur) {
		super();
		ISBN = iSBN;
		this.titre = titre;
		this.prix = prix;
		this.Emprunteur = Emprunteur;
		this.Auteur = Auteur;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

	public ADHERENT getEmprunteur() {
		return Emprunteur;
	}

	public void setEmprunteur(ADHERENT Emprunteur) {
		this.Emprunteur = Emprunteur;
	}
	
	public AUTEUR getauteur() {
		return Auteur;
	}
	
	public void setAuteur (AUTEUR Auteur) {
		this.Auteur = Auteur;
	}
}
