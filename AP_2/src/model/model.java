package model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class model {
		private ArrayList<LIVRE>ListLivre;
		private ArrayList<ADHERENT>ListADHERENT;
		private ArrayList<AUTEUR>ListAUTEUR;
		private Connection conn ;
		

		
		public model() throws SQLException, ClassNotFoundException {
			
			//Conexion à la BDD
			String BDD = "projet_java";
			String url = "jdbc:mysql://localhost:3306/"+BDD;
			String user = "root";
			String passwd = "";
			System.out.println("connecteé à la BDD");
			
			Class.forName("com.mysql.jdbc.Driver");
			//Vérifie la connection 
			 conn = DriverManager.getConnection(url,user,passwd);
			System.out.println("connexion ok");
			
			//ETAPE 2 : afficher les livres avec un SELECT
			// Déclaration de vaiable 
			ResultSet resultats;
			String requete ;
			// je fais ma requete 
			requete = "SELECT * FROM LIVRE";
			Statement stmt = conn.createStatement();
			resultats = stmt.executeQuery(requete);
			// afficher les livres present dans la BDD
			while(resultats.next()) {
				System.out.println("ISBN :"+resultats.getString(1)+
				" - titre: "+resultats.getString(2)+
				" - prix: "+resultats.getFloat(3));
			}
			
			
			//ETAPE 3 : ins�rer un livre
			stmt.executeUpdate("INSERT INTO Livre VALUES ('test2','titre',0,null,null);");
		}
		
		
		
		public void getall () throws SQLException {
			ListLivre = new ArrayList<LIVRE>();
			ListADHERENT = new ArrayList<ADHERENT>();
			ListAUTEUR = new ArrayList<AUTEUR>();
			
			LIVRE l1 = new LIVRE ("1","t1",10,null,null);
			LIVRE l2 = new LIVRE ("1","t2",11,null,null);
			ADHERENT a1 = new ADHERENT ("01","nomA","prenom","email", new ArrayList<LIVRE>());
			AUTEUR a2 = new AUTEUR ("1","nom","prenom","01/01/2000","blablabla");
			
			ResultSet resultat;
			Statement stmt;
			stmt = conn.createStatement();
			// ça sert  à stocker les données presents dasn la BDD pour afficher dans le View 
			//**********************************************
			//chargement de la liste d'auteur
			//********************************
			resultat=stmt.executeQuery("SELECT * from AUTEUR");
			while (resultat.next())
			{
				ListAUTEUR.add(new AUTEUR(resultat.getString(1),resultat.getString(2),resultat.getString(3),resultat.getString(4),resultat.getString(5))); 
			}
			
			//**********************************************
			//Chargement de la liste adherent 
			//******************************************
			resultat=stmt.executeQuery("SELECT * from ADHERENT");
			while (resultat.next())
			{
				ListADHERENT.add(new ADHERENT(resultat.getString(1),resultat.getString(2),resultat.getString(3),null));
			}
			
			resultat=stmt.executeQuery("SELECT * from LIVRE");
			while (resultat.next())
			{
				ListLIVRE.add(new LIVRE(resultat.getString(1),resultat.getString(2),resultat.getFloat(3)));
			}
			
			
			
		}
		public ArrayList<LIVRE> getListLivre() {
			return ListLivre;
		}
		public void setListLivre(ArrayList<LIVRE> listLivre) {
			ListLivre = listLivre;
		}
		public ArrayList<ADHERENT> getListADHERENT() {
			return ListADHERENT;
		}
		public void setListADHERENT(ArrayList<ADHERENT> listADHERENT) {
			ListADHERENT = listADHERENT;
		}
		public ArrayList<AUTEUR> getListAUTEUR() {
			return ListAUTEUR;
		}
		public void setListAUTEUR(ArrayList<AUTEUR> listAUTEUR) {
			ListAUTEUR = listAUTEUR;
		}
		
		
		
}
