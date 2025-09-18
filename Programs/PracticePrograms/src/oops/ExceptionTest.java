package oops;

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
			int i = 10/0;
		}
		
		catch(ArithmeticException e1) {
			e1.getStackTrace();
			System.out.println("arithmetic");
		}
		
		catch(Exception e) {
			e.getStackTrace();
			System.out.println("exception");
		}
		
		
	}

}
