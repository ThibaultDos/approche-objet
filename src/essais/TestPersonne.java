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
		AdressePostale ap = new AdressePostale(42, "rue des pommiers", 14610, "Anguerny");
		Personne moi= new Personne ("Dos", "Thibault", ap);
		
		moi.affichage();
	
		Personne personne = new Personne("nom","prenom");
		AdressePostale adr = new AdressePostale(0, "voie", 00000, "ville");
		personne.setAdr(adr);	
	}	
}
