package patternPrograms;

public class PatternRightDownAlphabetTraingle1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int alpha = 65; //to print capital letters
		
		//int alpha = 97; //to print small letters
		
		for (int i=0; i<=5; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print((char)(alpha+j)+" ");
			}
			
			System.out.println();
		}
	}

}
