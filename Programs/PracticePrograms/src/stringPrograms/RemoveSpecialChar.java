package stringPrograms;

public class RemoveSpecialChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String reg = "[^a-zA-Z0-9]";
		String str = "Ram#y%&*@a";

		String s1=str.replaceAll(reg, "");
		System.out.println(s1);
		
	}

}
