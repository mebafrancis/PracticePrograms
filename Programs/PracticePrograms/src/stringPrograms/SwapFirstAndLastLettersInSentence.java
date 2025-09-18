package stringPrograms;

public class SwapFirstAndLastLettersInSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "I like Selenium Testing";
		
		char[] ch = s.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			int k=i;
			while(i<ch.length && ch[i]!=' ') {
				i++;
			}
				char temp=ch[k];
				ch[k]=ch[i-1];
				ch[i-1]=temp;
		}
		
		System.out.println(s.valueOf(ch));
	}

}
