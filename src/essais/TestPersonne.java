package essais;

import entites.AdressePostale;
import entites.Personne;

public class TestPersonne 
{
	public static void main(String[] args) 
	{
		String n=null;
		String p=null;
		AdressePostale ad=null;
		
		Personne personne1 = new Personne(n, p, ad);
		Personne personne2 = null ;
		AdressePostale ap = new AdressePostale(42, "Rue des pommiers", 66666, "Lucix");
		Personne moi= new Personne ("Dos", "Thibault", ap);
		
		test(moi);
	}

	public static void test(Personne p){
		System.out.println("Nom : " + p.nom + "\nPrénom : " +p.prenom+ "\nAdresse : "+p.x.numeroRue+" " +p.x.libelleVoie+" "+"\n"+p.x.codePostal+" "+p.x.ville);
	}
}
