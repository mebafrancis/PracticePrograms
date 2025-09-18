package numberPrograms;

public class SumOfLargestSmallest {
	
	public static void main(String[] args) {
	
	int a[] = {8,25,100,2,102};
	
	int largest = a[0];
	int smallest = a[0];
	int sum=0;
	for(int i=0;i<a.length;i++) {
		if(a[i]>largest) {
			largest = a[i];
		}
		
		if(a[i]<smallest) {
			smallest = a[i];
		}
	}
	
	sum= largest+smallest;
	
	System.out.println("sum of largest and smallest element in array"+sum);
	
	
	}

}
