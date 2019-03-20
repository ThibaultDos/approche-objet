package listes;

public class Ville{
	private String nomVille;
	private Integer nbHab;

	public String getNomVille() {
		return nomVille;
	}
	public void setNomVille(String nomVille) {
		this.nomVille = nomVille;
	}

	public Integer getNbHab() {
		return nbHab;
	}

	public void setNbHab(Integer nbHab) {
		this.nbHab = nbHab;
	}

	
	public Ville(String nomVille, Integer nbHab) {
		//super();
		this.nomVille = nomVille;
		this.nbHab = nbHab;
	}
		
	public String toString(){
		return nomVille;
	}
	

}
	
	
	