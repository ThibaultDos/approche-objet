package essais;
import java.lang.RuntimeException;

public class DivException extends RuntimeException{
	
	public DivException(String string) {
		// TODO Auto-generated constructor stub
		System.out.println(string);
	}


	public static int diviser(int a, int b){
		if(b==0){
			throw new DivException("Nop !");
		}
		return a/b;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=42;
		int b=0;

/*
 * RuntimeException rend l'affiche du message d'exception facultatif. 
 *\/!\ à utiliser avec parcimonie
 */
		
//		try {
//			System.out.println(diviser(a,b));
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
	}

}

