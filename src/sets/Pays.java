package sets;

public class Pays {

	private String nomPays;
	private Integer nbHab;
	private Double pibHab;
//	private Double pibTotal;
	
	public Pays(String nomPays, Integer nbHab, Double pibHab) {
		super();
		this.nomPays = nomPays;
		this.nbHab = nbHab;
		this.pibHab = pibHab;
	}
	
	public Double pibTotal(){
		return nbHab * pibHab;
	}
	
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nbHab == null) ? 0 : nbHab.hashCode());
		result = prime * result + ((nomPays == null) ? 0 : nomPays.hashCode());
		result = prime * result + ((pibHab == null) ? 0 : pibHab.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pays other = (Pays) obj;
		if (nbHab == null) {
			if (other.nbHab != null)
				return false;
		} else if (!nbHab.equals(other.nbHab))
			return false;
		if (nomPays == null) {
			if (other.nomPays != null)
				return false;
		} else if (!nomPays.equals(other.nomPays))
			return false;
		if (pibHab == null) {
			if (other.pibHab != null)
				return false;
		} else if (!pibHab.equals(other.pibHab))
			return false;
		return true;
	}
	
	
	

	public String getNomPays() {
		return nomPays;
	}
	public void setNomPays(String nomPays) {
		this.nomPays = nomPays;
	}
	public Integer getNbHab() {
		return nbHab;
	}
	public void setNbHab(Integer nbHab) {
		this.nbHab = nbHab;
	}
	public Double getPibHab() {
		return pibHab;
	}
	public void setPibHab(Double pibHab) {
		this.pibHab = pibHab;
	}
	
	@Override
	public String toString() {
		return nomPays;
	}
}
