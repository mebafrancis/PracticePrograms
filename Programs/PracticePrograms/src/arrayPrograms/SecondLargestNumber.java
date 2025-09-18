package arrayPrograms;

public class SecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {1,9,3,11,2};
		
		int largest = a[0];
		int secondlargest = a[0];
		
		for(int i=0;i<a.length;i++) {
			if(a[i]>largest) {
				secondlargest = largest;
				largest = a[i];
			}
			
			if(a[i]<largest && a[i]>secondlargest) {
				secondlargest = a[i];
			}
		}
		
		System.out.println("Second largest number in array is: "+secondlargest);
	}

}
