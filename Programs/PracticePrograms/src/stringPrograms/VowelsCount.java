package stringPrograms;

public class VowelsCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Ramya is a good in automation testing";
		
		int vcount = 0;
		
		for(int i=0;i<s.length();i++) {
			if(isVowel(s.charAt(i))) {
				vcount++;
			}
		}
		System.out.println("no. of vowels in string is: "+vcount);
	}
	
	public static boolean isVowel(char t) {
		return t=='a'||t=='e'||t=='i'||t=='o'||t=='u'||t=='A'||t=='E'||t=='I'||t=='O'||t=='U';
	}

}
