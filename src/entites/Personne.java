package entites;

public class Personne 
{
	public String nom;
	public String prenom;
	public AdressePostale x;
	
	public Personne(String n, String p, AdressePostale x)
	{
		nom=n;
		prenom=p;
		this.x=x;
	}
	
	public Personne(String nom, String prenom)
	{
		this.nom=nom;
		this.prenom=prenom;	
	}			
				
	
	public void affCasse() // affiche le nom et le prénom avec le nom de famille en majuscules.
	{
		System.out.println(nom.toUpperCase()+prenom);
	}
	
	public void setNom(String nouveauNom)
	{
		nom=nouveauNom;
	}
	public String getNom(String nom)
	{
		return nom;
	}
	
	public void setPrenom(String nouveauPrenom)
	{
		prenom=nouveauPrenom;
	}
	public String getPrenom(String prenom)
	{
		return prenom;
	}
	
	public void setAdr(AdressePostale nouvelleAdr)
	{
		x=nouvelleAdr;
	}
	public AdressePostale getAdr(AdressePostale adr)
	{
		return adr;
	}
	
	
	public void affichage()
	{
		System.out.println("Nom : " + nom + "\nPrénom : " +prenom+ "\nAdresse : "+x.numeroRue+" " +x.libelleVoie+" "+"\n"+x.codePostal+" "+x.ville);
	}

}
