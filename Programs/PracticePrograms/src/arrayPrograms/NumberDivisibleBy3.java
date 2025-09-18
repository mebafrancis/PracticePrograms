package arrayPrograms;

public class NumberDivisibleBy3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {40,50,90};//4050900
		int sum=0;
		
		for(int i=0;i<a.length;i++) {
			sum= sum+a[i];
		}
		
		if(sum%3==0) {
			System.out.println("No. is divisible by 3");
		}

	}

}
