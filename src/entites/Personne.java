package entites;

public class Personne 
{
	public String nom = null;
	public String prenom = null;
	public AdressePostale x = null ;
	
	public Personne (String n, String p, AdressePostale x)
	{
		nom=n;
		prenom=p;
		this.x=x;
	}

}
