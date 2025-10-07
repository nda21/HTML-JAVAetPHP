package algo;

public class CLIENT {
	private int CIN;
	private String nom ;
	private String prénom;
	private int tél;
	public CLIENT(int cin, String Nom, String Prénom, int Tél) {
		super();
		CIN = cin;
		this.nom = Nom;
		this.prénom = Prénom;
		this.tél = Tél;
	
	}
	// Constructeur sans le Tel
	public CLIENT(int cin, String Nom, String Prénom) {
		super();
		CIN = cin;
		this.nom = Nom;
		this.prénom = Prénom;
	}
	
	//les propriétés
	
	public int getCIN() {
		return CIN;
	}
	public void setCIN(int cin) {
		CIN = cin;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String Nom) {
		this.nom = Nom;
	}
	public String getPrénom() {
		return prénom;
	}
	public void setPrénom(String Prénom) {
		this.prénom = Prénom;
	}
	public int getTél() {
		return tél;
	}
	public void setTél(int Tél) {
		this.tél = Tél;
	}
	public void afficher() {
		System.out.println("********************");
		System.out.println("CIN: "+CIN);
		System.out.println("NOM:"+nom);
		System.out.println("PRENOM:"+prénom);
		System.out.println("TEL:"+tél);
	}

}
