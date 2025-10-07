package algo;

public class MAIN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VOITURE voiture1,voiture2;
		
		voiture1= new VOITURE (90000,2010,"occasion","Renault","Mégane","rouge","CBO58275",null);
		voiture2= new VOITURE (0,2016,"neuve","Peugeot","306","noir",null,null);
		
		voiture1.setCouleur("gris métallisé");
		
		//voiture1.SET_km(voiture1.GET_km()+250)
		voiture1.ADDkm(250);
				
System.out.println("coucou");
	}

}
