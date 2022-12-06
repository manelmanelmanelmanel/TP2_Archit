import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class EtudiantService {



		private IEtudiant StudRep;
		private IUniversite UnivRep;
		private IJournal j;

		
		public void setEtudRep(IEtudiant StudRep) {
			this.StudRep = StudRep;
		}
@@ -23,35 +18,20 @@ public void setJournal(IJournal j) {
		public IJournal getJournal() {
			return this.j;
		}
		public IEtudiant getStudRep() {
			return this.StudRep;
		}

	boolean inscription (int matricule, String nom, String prénom, String email,String pwd, int id_universite) throws SQLException	
	{


	    Etudiant stud = new Etudiant(matricule, nom, prénom, email,pwd,id_universite);
	    Universite univ= UnivRep.GetById(id_universite,j);
	    Universite univ= UnivRep.GetById(id_universite, j);

	    j.outPut_Msg("Log: début de l'opération d'ajout de l'étudiant avec matricule "+matricule);

	    if(email == null || email.length() == 0)
	    {
	    	return false;
	    }




	    if (StudRep.Exists(matricule,j))
	    {
	        return false;
	    }

		if (StudRep.Exists(email, j))
	    {
	        return false;
	    }



		 if (univ.getPack() == TypePackage.Standard)
	     {
	          stud.setNbLivreMensuel_Autorise(10);
@@ -61,24 +41,24 @@ else if (univ.getPack() == TypePackage.Premium)
	    	 stud.setNbLivreMensuel_Autorise(10*2);
	     }                           


		 StudRep.add(stud, j);

		 j.outPut_Msg("Log: Fin de l'opération d'ajout de l'étudiant avec matricule "+matricule);
		 return true;


		
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
