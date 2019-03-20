package listes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestListeString {

	public static void main(String[] args) {
		// Instanciez une ArrayList de String contenant des éléments :
		List<String> villes = new ArrayList<>();
		villes.add("Nice");
		villes.add("Carcassonne");
		villes.add("Narbonne");
		villes.add("Lyon");
		villes.add("Foix");
		villes.add("Pau");
		villes.add("Marseille");
		villes.add("Tarbes");

//Recherchez la ville dans cette liste qui a le plus grand nombre de lettres :		
		String motLePlusLong = villes.get(0);
		int max = villes.get(0).length();
		for (String s : villes) {
			if (s.length() >= max){
				max=s.length();
				motLePlusLong = s;
			}			
		}
		System.out.println("• La ville qui a le plus grand nombre de lettres est : "+motLePlusLong+"\n");
		
//Modifiez le contenu de la liste de manière à mettre tous les noms de villes en majuscules :		
		for (String s : villes) {
			villes.set(villes.indexOf(s), s.toUpperCase());
		}
		System.out.println("• Écriture de la liste en majuscules :\n"+villes);
		
//Supprimez de la liste les villes dont le nom commence par la lettre N :
		
		
		char initiale = 'z';
		Iterator<String> iter = villes.iterator();
		while (iter.hasNext()){	
			String currentVille=iter.next();
			initiale=currentVille.charAt(0);
			if (initiale == 'N'){
				iter.remove();
			}
			
		}		
	
		System.out.println("\n• Suppresion des villes dont le nom commence par la lettre N : \n"+villes);
		
		
	
	}
		
}

