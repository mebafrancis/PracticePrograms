package arrayPrograms;

import java.util.Arrays;

public class CompareTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {1,2,3,4};
		int b[] = {1,2,3,4};
		
		//1. Using Arrays.equal()
		
		boolean res = Arrays.equals(a, b);
		System.out.println(res);
		if(res==true) {
			System.out.println("Arrays are equal");
		}
		else {
			System.out.println("Arrays are not equal");
		}
		
		
		//2. Not using Pre-defined method
		
		if(a.length==b.length) {
			for(int i=0;i<a.length;i++) {
					if(a[i]!= b[i]) {
						System.out.println("Arrays are not equal");
					}
					else {
						System.out.println("Arrays are equal");
					}
			}
		}
	}

}
