package arrayPrograms;

public class MissingNumberInSeries {

	public static void main(String[] args) {
		int num[] = {1,2,3,5};
		int n = findMissingNumber(num,5);
		System.out.println(n);	
		}
	
	public static int findMissingNumber(int num[], int totalCount) {
		int expSum = totalCount * ((totalCount + 1) / 2);
		int actualSum = 0;
		for(int i: num) {
		actualSum = actualSum+i;
		}
		
		return expSum - actualSum;
		
	}
}
