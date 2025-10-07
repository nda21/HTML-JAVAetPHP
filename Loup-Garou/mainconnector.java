import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class mainconnector {

	public static void main (String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		
		//ETAPE 1 : se connecter à la BDD
		
		String BDD = "td_banque";
		String url = "jdbc:mysql://localhost:3306/"+BDD;
		String user = "root";
		String passwd="";

		Connection conn ;
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection(url, user, passwd);
		System.out.println("Vous etes connecter");


		ResultSet resultats;
		String requete = "Select * FROM client";
		Statement stmt = conn.createStatement();
		resultats = stmt.executeQuery(requete);

		while(resultats.next()) {
			System.out.println("nom : "+resultats.getString(2)+ "  prenom : "
					+resultats.getString(3)+ " genre : " +resultats.getInt(4)+ " Date : "
					+resultats.getString(5)+ " Adresse : "+resultats.getString(6)
					+" Télephone : "+resultats.getString(7)+" Mail : "+resultats.getString(8)+" Catégorie : "+resultats.getInt(9));
		}
		Statement stmt2 = conn.createStatement();
		 stmt2.executeUpdate( "UPDATE client SET tel = 0612345678 WHERE id = 1 ");
			
			
	}
}
