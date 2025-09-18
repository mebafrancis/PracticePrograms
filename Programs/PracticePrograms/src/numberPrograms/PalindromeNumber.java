package numberPrograms;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 545;
		int temp = num;
		int rem;
		int sum = 0;
		while (num > 0) {
			rem = num % 10;
			sum = (sum * 10) + rem;
			num = num / 10;
		}

		System.out.println(sum);
		if (temp == sum) {
			System.out.println("no. is palindrome");
		} else {
			System.out.println("no. is not palindrome");
		}
	}

}
