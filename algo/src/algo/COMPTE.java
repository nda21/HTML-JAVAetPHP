package algo;
import java.util.Scanner;
public class COMPTE {
	private int numéro ;
	private int solde ;
	private CLIENT propriétaire;
	public COMPTE(int lenuméro, int lesolde, CLIENT lepropriétaire) {
		super();
		this.numéro = lenuméro;
		this.solde = lesolde;
		this.propriétaire = lepropriétaire;
	}
	public int getNuméro() {
		return numéro;
	}
	public void setNuméro(int lenuméro) {
		this.numéro = lenuméro;
	}
	public int getSolde() {
		return solde;
	}
	public void setSolde(int lesolde) {
		this.solde = lesolde;
	}
	public CLIENT getPropriétaire() {
		return propriétaire; 
	}
	public void setPropriétaire(CLIENT lepropriétaire) {
		this.propriétaire = lepropriétaire;
	}
	public void setcrediter(int lesolde) {
		this.solde = solde + lesolde;
	}
	
	public int getcrediter () {
		return solde;
	}
	public void setdebiter(int lesolde) {
		this.solde = solde - lesolde;
	}
	
	public int getdebiter () {
		return solde;
		
	}
	public void affiche() {
		System.out.println("***********");
		System.out.println("numéro du compte :"+numéro);
		System.out.println("solde de compte :"+solde);
		System.out.println("Propriètaire du compte :"+propriétaire);
}
}
