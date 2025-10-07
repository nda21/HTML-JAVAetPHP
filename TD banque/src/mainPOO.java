
public class mainPOO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		
			CATEGORIE categorie1, catagorie2;
			
			categorie1  = new CATEGORIE ("PDG");
			categorie1  = new CATEGORIE ("Directeur");
			
			COMPTE compte1, compte2;
			
			compte1 = new COMPTE ("N°C01",1000,"euro", null);
			compte2 = new COMPTE ("N°C02",1000,"dollar", null);
			
			CLIENT client1;
			
			client1 = new CLIENT ("DUCK","Donald",0, null, null, null, null, null, null);
			
			client1.setCateg(categorie1);
			
			
	}
	
	
	

}
