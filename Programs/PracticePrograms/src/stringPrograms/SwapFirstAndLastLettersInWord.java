package stringPrograms;

public class SwapFirstAndLastLettersInWord {
	
	public static void main(String[] args) {
		
	
	String s = "SeleniumTesting";
	
	int len = s.length();

	if(len<2) {
		System.out.println(s);
	}
	
	char[] ch = s.toCharArray();
	
	char temp= ch[0];
	ch[0]=ch[len-1];
	ch[len-1] = temp;
	
	System.out.println(s.valueOf(ch));
	}

}
