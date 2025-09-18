package stringPrograms;

public class SwapFirstAndLastWordsInSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "I love Selenium Automation with Java";
		
		String word[]=s.split(" ");
		int len=word.length;
		
		String temp=word[0];
		word[0]=word[len-1];
		word[len-1]=temp;
		
		for (int i = 0; i < word.length; i++) {
		    System.out.print(word[i]+" ");
		}
	}
}
