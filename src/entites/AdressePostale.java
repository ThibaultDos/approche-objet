package entites;

public class AdressePostale 
{
	public int numeroRue;
	public String libelleVoie;
	public int codePostal;
	public String ville;
	
	public AdressePostale(int num, String voie, int cp, String ville)
	{
		codePostal=cp;
		this.ville=ville;
		numeroRue = num ;
		libelleVoie = voie;
	}

}
