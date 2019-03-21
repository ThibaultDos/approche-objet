package sets;
import java.util.HashSet;
import java.util.Set;

public class TestSetString {
	
	public static void main(String[] args) {
		
		Set <String> newSet =new HashSet<>() ;
		
		newSet.add("USA");
		newSet.add("France");
		newSet.add("Allemagne");
		newSet.add("UK");
		newSet.add("Italie");
		newSet.add("Japon");
		newSet.add("Chine");
		newSet.add("Russie");
		newSet.add("Inde");
		
		Integer nbLettres=0;
		Integer maxLettres=0;
		String longPays=null;
		for (String s : newSet){
			nbLettres=s.length();
			if (nbLettres>maxLettres){
				maxLettres=nbLettres;
				longPays=s;
				
			}
			
		}
		newSet.remove(longPays);
		Set <String>capsSet=new HashSet<>();
		for (String s : newSet){
			capsSet.add(s.toUpperCase());			
		}
		
		System.out.println(capsSet);
		
	}

}
