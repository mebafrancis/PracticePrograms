package stringPrograms;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Ramya is a good girl";
		
		String word[] = s.split(" ");
		String emp = "";
		
		for(int i= word.length-1; i>=0 ;i--) {
			emp = emp +word[i]+ " ";
		}

		System.out.println(emp);
	}

}
