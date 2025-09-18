package stringPrograms;

public class SwapTwoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "Hello";
		String b = "World";
		
		System.out.println("Before swapping the value of a and b is: "+a+" "+b);
		
		//append/concatenate a and b
		a = a + b;
		
		//store initial string a in string b
		b = a.substring(0, a.length()- b.length());
		
       //store initial string b in string a
       a = a.substring(b.length());
		
       System.out.println("After swapping the value of a and b is: "+a+" "+b);
	}

}
