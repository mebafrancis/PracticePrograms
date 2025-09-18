package stringPrograms;

public class StringComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "AutomationTesting";

		String s2 = new String("AutomationTesting");

		//checks if value of these objects are equal or not
		System.out.println(s1.equals(s2)); 

		//checks if both strings point to same memory location
		System.out.println(s1 == s2); 
	}

}
