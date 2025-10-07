import java.util.ArrayList;

public class CLIENT {
	private String nom;
	private String prenom;
	private int genre;
	private String date;
	private CATEGORIE categ;
	private String adresse;
	private String tel;
	private String email;
	private ArrayList<COMPTE>lstcompte;
	
	
	public CLIENT(String nom, String prenom, int genre, String date, CATEGORIE categ, String adresse, String tel,
			String email, ArrayList<COMPTE> lstcompte) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.genre = genre;
		this.date = date;
		this.categ = categ;
		this.adresse = adresse;
		this.tel = tel;
		this.email = email;
		this.lstcompte = lstcompte;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public int getGenre() {
		return genre;
	}


	public void setGenre(int genre) {
		this.genre = genre;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public CATEGORIE getCateg() {
		return categ;
	}


	public void setCateg(CATEGORIE categ) {
		this.categ = categ;
	}


	public String getAdresse() {
		return adresse;
	}


	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}


	public String getTel() {
		return tel;
	}


	public void setTel(String tel) {
		this.tel = tel;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public ArrayList<COMPTE> getLstcompte() {
		return lstcompte;
	}


	public void setLstcompte(ArrayList<COMPTE> lstcompte) {
		this.lstcompte = lstcompte;
	}
	
	

}
