package arrayPrograms;

import java.util.Arrays;

public class ShiftZerosToRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = new int[] {1,0,2,0,3,0,0,0};
		
		int newArray[]= new int[a.length];
		
		int count=0;
		
		for(int number:a) {
			if(number!=0) {
				newArray[count] = number;
				count++;
			}
		}
		
		System.out.println(Arrays.toString(newArray));
	}

}
