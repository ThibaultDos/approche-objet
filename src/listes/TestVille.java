package listes;

import java.util.ArrayList;
import java.util.List;

public class TestVille {

	public static void main(String[] args) {
		List<Ville> demoVilles = new ArrayList<>();

		Ville v1 = new Ville("Nice", 343_000);
		Ville v2 = new Ville("Carcassonne", 47_800);
		Ville v3 = new Ville("Narbonne", 53_400);
		Ville v4 = new Ville("Lyon", 484_000);
		Ville v5 = new Ville("Foix", 9_700);
		Ville v6 = new Ville("Pau", 77_200);
		Ville v7 = new Ville("Marseille", 850_700);
		Ville v8 = new Ville("Tarbes", 40_600);

		demoVilles.add(v1);
		demoVilles.add(v2);
		demoVilles.add(v3);
		demoVilles.add(v4);
		demoVilles.add(v5);
		demoVilles.add(v6);
		demoVilles.add(v7);
		demoVilles.add(v8);

		Integer nbHab = demoVilles.get(0).getNbHab();
		String nomVille = demoVilles.get(0).getNomVille();
		Integer maxHab = demoVilles.get(0).getNbHab();
		String biggestCity = demoVilles.get(0).getNomVille();
		Integer minHab = demoVilles.get(0).getNbHab();
		String smallestCity = demoVilles.get(0).getNomVille();
		

		for (Ville v : demoVilles) {
			nbHab = v.getNbHab();
			nomVille = v.getNomVille();
			if (nbHab >= maxHab) {
				maxHab = nbHab;
				biggestCity = nomVille;
			}
			if (nbHab <= minHab) {
				minHab = nbHab;
				smallestCity = nomVille;
			}
			if (nbHab >= 100000) {
				v.setNomVille(v.getNomVille().toUpperCase());

			}

		}
		
		StringBuilder concluTP = new StringBuilder();
		concluTP.append("• La ville la plus peuplée est ").append(biggestCity).append(".\n")
		.append("• La ville la moins peuplée est ").append(smallestCity).append(".\n")
		.append("• Réécriture des villes de plus de 100 000 habitants en MAJUSCULE :\n").append(demoVilles);

		System.out.print(concluTP.toString());
	}

}
