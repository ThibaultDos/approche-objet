package essais;
import java.lang.Exception;

public class TestException {
	
	public static Integer diviser(Integer a, Integer b) throws Exception{
		if(b==0){
			throw new Exception("Division par 0.");
		}
		return a/b;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=42;
		int b=0;
		try {
			System.out.println(diviser(a,b));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
