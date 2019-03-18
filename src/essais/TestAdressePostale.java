package essais;

import entites.AdressePostale;

public class TestAdressePostale 
{
	public static void main(String[]args)
	{
		int num = 0;
		String voie = null;
		int cp = 00000;
		String ville = null;
		
		AdressePostale a = new AdressePostale(num, voie, cp, ville);
		AdressePostale b = new AdressePostale(num, voie, cp, ville);
	}

}
