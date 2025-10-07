package algo;

public class Proprietaire {
		private String nom;
		private String adresse;
		private String tel;

		public Proprietaire(String lenom, String ladresse, String letel) {
			super();
			this.nom = lenom;
			this.adresse = ladresse;
			this.tel = letel;
		}

		public String getNom() {
			return nom;
		}

		public void setNom(String lenom) {
			this.nom = lenom;
		}

		public String getadresse() {
			return adresse;
		}

		public void setadresse(String ladresse) {
			this.adresse = ladresse;
		}

		public String getTel() {
			return tel;
		}

		public void setTel(String letel) {
			this.tel = letel;
		}

	

	}


