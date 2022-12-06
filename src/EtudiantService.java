
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
public class EtudiantService {

@@ -21,17 +24,15 @@ public IJournal getJournal() {
		public IEtudiant getStudRep() {
			return this.StudRep;
		}

		
	boolean inscription (int matricule, String nom, String prénom, String email,String pwd, int id_universite) throws SQLException	
	{

		
	    Etudiant stud = new Etudiant(matricule, nom, prénom, email,pwd,id_universite);
	    Universite univ= UnivRep.GetById(id_universite, j);

	    
	    j.outPut_Msg("Log: début de l'opération d'ajout de l'étudiant avec matricule "+matricule);




		 if (univ.getPack() == TypePackage.Standard)
	     {
	          stud.setNbLivreMensuel_Autorise(10);
@@ -40,25 +41,34 @@ else if (univ.getPack() == TypePackage.Premium)
	     {
	    	 stud.setNbLivreMensuel_Autorise(10*2);
	     }                           

	     
		 StudRep.add(stud, j);

		 
		 j.outPut_Msg("Log: Fin de l'opération d'ajout de l'étudiant avec matricule "+matricule);
		 return true;



	}




	public void ajouterBonus() throws SQLException {
		ArrayList<Etudiant> etudiants = StudRep.getEtudiants();

		for(Etudiant e : etudiants) {
			Universite univ = UnivRep.GetById(e.getId_universite(), new ScreenJourn());
			e.giveBonus(univ);
		}
	}



public ArrayList<Etudiant> GetEtudiantParUniversitye()
{

    //...
	return new ArrayList<>(4);
}
public ArrayList<Etudiant> GetEtudiatparLivreEmprunte()
{

    //...
	return new ArrayList<>(4);

}
