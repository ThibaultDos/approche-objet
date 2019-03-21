package sets;

import java.util.HashSet;
import java.util.Set;

public class TestPays {
	
	public static void main(String[] args) {
		Set <Pays> paySet = new HashSet<>();
		
		Pays p1 = new Pays("USA", 327_167_434, 55_805.204);
		Pays p2 = new Pays("France", 67_795_000, 38_476.7);
		Pays p3 = new Pays("Allemagne", 82_979_100, 47_589.972);
		Pays p4 = new Pays("UK", 65_105_246, 45_158.909);
		Pays p5 = new Pays("Italie", 60_483_973, 35_708.0);
		Pays p6 = new Pays("Japon", 126_168_156, 41_300.0);
		Pays p7 = new Pays("Chine", 1_417_913_092, 14_107.431);
		Pays p8 = new Pays("Russie", 146_880_400, 24_026.0);
		Pays p9 = new Pays("Inde", 1_296_834_042, 5_855.306);
		
		
		paySet.add(p1);
		paySet.add(p2);
		paySet.add(p3);
		paySet.add(p4);
		paySet.add(p5);
		paySet.add(p6);
		paySet.add(p7);
		paySet.add(p8);
		paySet.add(p9);
		
		
		Double maxPibHab=Double.MIN_VALUE;
		String paysMaxPibHab=null;
		Double maxPib=Double.MIN_VALUE;
		Double minPib=Double.MAX_VALUE;
		String paysMaxPib=null;
		String paysMinPib=null;
		Pays remove=null;
		
		for (Pays p : paySet){
			if (p.getPibHab()>maxPibHab){
				maxPibHab=p.getPibHab();				
				paysMaxPibHab=p.getNomPays();
			}
			if (p.pibTotal()>maxPib){
				maxPib=p.pibTotal();
				paysMaxPib=p.getNomPays();
			}
			if (p.pibTotal()<minPib){
				minPib=p.pibTotal();
				paysMinPib=p.getNomPays().toUpperCase();
				remove=p;
			}
						
		}
		
		paySet.remove(remove);
				
		StringBuilder answer = new StringBuilder();
		StringBuilder affichage = new StringBuilder();
		answer.append("• Le pays qui le PIB/habitant le plus important est ").append(paysMaxPibHab).append(".")
		.append("\n• Le pays qui le PIB le plus important est ").append(paysMaxPib).append(".")
		.append("\n• Le pays qui le PIB le moins important est ").append(paysMinPib).append(".")
		.append("\n• Suppression de ce pays de la collection...")
		.append("\n• Affichage de l’ensemble des pays ainsi modifiés avec leur nom, nombre d’habitants et PIB total :\n");
		
		for (Pays p : paySet){
			affichage.append(p.getNomPays()).append(" : ").append(p.getNbHab()).append(" habitants, ").append(p.pibTotal()).append("$ de PIB total\n");
		}
				
		System.out.println(answer.toString());	
		System.out.println(affichage.toString());	
		
		
//		affichage du PIB total de tous les pays :		
//		System.out.println(p1.pibTotal());
//		System.out.println(p2.pibTotal());
//		System.out.println(p3.pibTotal());
//		System.out.println(p4.pibTotal());
//		System.out.println(p5.pibTotal());
//		System.out.println(p6.pibTotal());
//		System.out.println(p7.pibTotal());
//		System.out.println(p8.pibTotal());
//		System.out.println(p9.pibTotal());

	}

}
