package listes;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TestListeInt {
	public static void main(String[] args) {

		
/*		Instanciez une ArrayList d’entiers et placez-y des éléments.
 * 		Affichez tous les éléments.
 */
		List<Integer> maListe= new ArrayList<>();
		maListe.add(-1);
		maListe.add(5);
		maListe.add(7);
		maListe.add(3);
		maListe.add(-2);
		maListe.add(-4);
		maListe.add(8);
		maListe.add(new Integer(5));
		
		System.out.println("• Affichage de la liste :\n"+maListe);

		
		/*		Instanciez une ArrayList d’entiers et placez-y des éléments.
		 * 		Affichez tous les éléments.
		 * 		méthode 2 : utilisation de asList
		 */
						
//		Integer[] tableau = {-1,5,7,3,-2,4,8,5};
//		List<Integer> maListe=Arrays.asList(tableau);
		
		//Recherchez le plus grand élément de la liste :
		int greatest=maListe.get(0);
		for (Integer i : maListe) {
			//System.out.print(i+", ");
			if (i>=greatest){
				greatest=i;
			}
		}
		System.out.println("\n• Le plus grand élément de la liste est :\n"+greatest+"\n");
		
		/*Supprimez le plus petit élément de la liste :
		 * méthode de parcours de liste avec boucle objet.
		 */
		
//		int smallest=maListe.get(0);
//		int index=0;
//		for (Integer i : maListe) {
//			if (i<smallest){
//				smallest=i;
//				index=maListe.indexOf(i);
//			}
//		}
//		maListe.remove(index);
//		System.out.println(maListe);
		
		
		
		/*Supprimez le plus petit élément de la liste : 
		 * méthode 2 : récupération d'un Iterator
		 */
		
		
		System.out.println("• Suppression du plus petit élément de la liste :");
		int smallest=maListe.get(0);
		Iterator<Integer> iter = maListe.iterator();
		while (iter.hasNext()){			
			if (iter.next() < smallest){
				smallest=iter.next();
			}		
		}
		Iterator<Integer> iter2 = maListe.iterator();
		while (iter2.hasNext()){
			if (iter2.next()==smallest){
				iter2.remove();
			}
		}
		
		System.out.println(maListe+"\n");
		
 

		for (Integer i : maListe) {
			if (i<0){				
				maListe.set(maListe.indexOf(i), -i); // possibilité d'utiliser Math.abs(i)
			}
		}
		
		System.out.println("• Et voilà la liste convertie en entiers naturels :\n"+maListe);
		
	}

}
