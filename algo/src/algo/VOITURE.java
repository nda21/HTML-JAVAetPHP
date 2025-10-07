package algo;

public class VOITURE {
		private int km;
		private int année ;
		private String etat;
		private String marque;
		private String model;
		private String couleur;
		private String immat;
		private Proprietaire proprietaire;
		


	public VOITURE(int lekm, int lannée, String letat, String lamarque, String lemodel, String lacouleur, String limmat,
			Proprietaire laproprietaire) {
		super();
		this.km = lekm;
		this.année = lannée;
		this.etat = letat;
		this.marque = lamarque;
		this.model = lemodel;
		this.couleur = lacouleur;
		this.immat = limmat;
		this.proprietaire = laproprietaire;
	}

	public int getKm() {
		return km;
	}

	public void setKm(int lekm) {
		this.km = lekm;
	}

	public int getAnnée() {
		return année;
	}

	public void setAnnée(int lannée) {
		this.année = lannée;
	}

	public String getEtat() {
		return etat;
	}

	public void setEtat(String letat) {
		this.etat = letat;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String lamarque) {
		this.marque = lamarque;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String lemodel) {
		this.model = lemodel;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String lacouleur) {
		this.couleur = lacouleur;
	}

	public String getImmat() {
		return immat;
	}

	public void setImmat(String limmat) {
		this.immat = limmat;
	}

	public Proprietaire getProprietaire() {
		return proprietaire;
	}

	public void setProprietaire(Proprietaire laproprietaire) {
		this.proprietaire = laproprietaire;
	}
	
	public void ADDkm(int ADDkm) {
			km = ADDkm + km ;
	}
}
