
import java.sql.SQLException;

public class Etudiant {

		private int matricule;
	    private String nom;
	    private String prenom;
            public class Etudiant {
	    private int nbLivreMensuel_Autorise;
	    private int nbLivreEmprunte;
	    private int id_universite;




		public Etudiant(int matricule, String nom, String prenom, String email,String pwd, int id_universite) {
			

			this.matricule = matricule;
			this.nom = nom;
			this.prenom = prenom;

			if(email != null && email.length() != 0)
		    {
				this.email = email;
                 public String getNom() {
		public void setNom(String nom) {
			this.nom = nom;
		}

		public String getPrenom() {
			return prenom;
		}
              public String getPwd() {
		public void setPwd(String pwd) {
			this.pwd = pwd;
		}



		public void giveBonus(Universite univ) throws SQLException {

			if (univ.getPack() == TypePackage.Standard)
		     {
				this.nbLivreMensuel_Autorise += 5 ;
		     }
		     else if (univ.getPack() == TypePackage.Premium)
		     {
		    	 this.nbLivreMensuel_Autorise += 10 ;
		     }                           

		}



	    }
