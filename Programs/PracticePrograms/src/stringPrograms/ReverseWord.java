package stringPrograms;

public class ReverseWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Ramya";
		String emp = "";
		for(int i= s.length()-1;i>=0;i--) {
			emp = emp+s.charAt(i);
		}
		System.out.print(emp);

	}

}
