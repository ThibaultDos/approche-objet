package sets;

import java.util.HashSet;
import java.util.Set;

public class TestSetDouble {
	public static void main(String[] args) {
		
		Set<Double> newSet = new HashSet<>();
		newSet.add(1.5);
		newSet.add(8.25);
		newSet.add(-7.32);
		newSet.add(13.3);
		newSet.add(-12.45);
		newSet.add(48.5);
		newSet.add(0.01);
		System.out.println(newSet);
	
		
		Double max=Double.MIN_VALUE;
		Double min=Double.MAX_VALUE;
		
		Set<Double> nbPositifs = new HashSet<>();
		
		for (Double d : newSet){
			if (d>max){
				max=d;
			}
			if (d < min){
				min=d;
			}
			if (d<0){
				nbPositifs.add(Math.abs(d));
			
			}
			else {
				nbPositifs.add(d);
			}
		
		}
		newSet.remove(min);
		
		StringBuilder rep = new StringBuilder();
		rep.append("• Le plus grand élément de la collection est ").append(max).append(".\n")
		.append("• Le plus petit élément de la collection est ").append(min).append(".\n")
		.append("• Suppression du plus petit élément de la collection ").append("(").append(min).append(") :\n").append(newSet).append(".\n")
		.append("• Réécriture de la collection sous forme d'entiers naturels : \n").append(nbPositifs);
		
		System.out.print(rep.toString());
		
		
		
	}
}
