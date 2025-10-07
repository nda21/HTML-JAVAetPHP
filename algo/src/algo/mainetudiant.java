package algo;

public class mainetudiant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Etudiant Livre1,Livre2;
		
		Livre1 = new Etudiant(null,"Claude Delannoy",(float) 350,1);
		Livre2 = new Etudiant (null,"Claude Delannoy",(float) 450,2);
		
		System.out.println(Livre2.getTitre());
		System.out.println(Livre2.getAuteur());
		System.out.println(Livre2.getPrix());
		System.out.println(Livre2.getnumero());
		
		
		System.out.println(Livre1.getTitre());
		System.out.println(Livre1.getAuteur());
		System.out.println(Livre1.getPrix());
		System.out.println(Livre1.getnumero());
	}

}
