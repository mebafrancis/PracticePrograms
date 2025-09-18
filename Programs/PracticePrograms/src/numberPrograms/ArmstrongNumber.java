package numberPrograms;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int rem= 0;
		int sum = 0;
		int num= 153;
		int temp = num;
		while(num>0) {
			rem = num%10;
			sum = sum + (rem*rem*rem);
			num = num/10;
		}
		
		if(temp==sum) {
			System.out.println("no. is armstrong");
		}
		else {
			System.out.println("no. is not armstrong");
		}

	}

}
