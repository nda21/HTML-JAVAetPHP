package algo;

public class ETUDIANT1 {
	private String matricule;
	private String nom;
	private String prénom;
	private int age;
	private String filière;
	private float moyenne;
	
	

	public ETUDIANT1(String lematricule, String lenom, String leprénom, int lage, String lafilière, float lamoyenne) {
		super();
		this.matricule = lematricule;
		this.nom = lenom;
		this.prénom = leprénom;
		this.age = lage;
		this.filière = lafilière;
		this.moyenne = lamoyenne;
	}



	public String getMatricule() {
		return matricule;
	}



	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}



	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public String getPrénom() {
		return prénom;
	}



	public void setPrénom(String prénom) {
		this.prénom = prénom;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getFilière() {
		return filière;
	}



	public void setFilière(String filière) {
		this.filière = filière;
	}



	public float getMoyenne() {
		return moyenne;
	}



	public void setMoyenne(float moyenne) {
		this.moyenne = moyenne;
	}



	

	

}
