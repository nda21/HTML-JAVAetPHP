package algo;

public class Etudiant {
				private String Titre;
				private String Auteur;
				private Float Prix;
				private int numero ;


	public Etudiant(String letitre, String lauteur, Float leprix, int lenumero) {
		super();
		Titre = letitre;
		Auteur = lauteur;
		Prix = leprix;
		numero = lenumero;
	}

	public String getTitre() {
		return Titre;
	}

	public void setTitre(String letitre) {
		Titre = letitre;
	}

	public String getAuteur() {
		return Auteur;
	}

	public void setAuteur(String lauteur) {
		Auteur = lauteur;
	}

	public Float getPrix() {
		return Prix;
	}

	public void setPrix(Float leprix) {
		Prix = leprix;
	}
	public int getnumero() {
		return numero;
	}
	public void setPrix(int lenumero) {
		numero = lenumero;
	}
	
}
