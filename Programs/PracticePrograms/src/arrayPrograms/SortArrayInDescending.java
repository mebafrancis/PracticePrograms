package arrayPrograms;

import java.util.Arrays;
import java.util.Collections;

public class SortArrayInDescending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Integer a[] = {5,2,9,3,1};
		 * 
		 * Arrays.sort(a,Collections.reverseOrder());
		 * 
		 * System.out.println(Arrays.toString(a));
		 */

		int arr[] = { 5, 2, 9, 3, 1 };
		Arrays.sort(arr);

		reverse(arr);

		System.out.println(Arrays.toString(arr));
	}

	public static void reverse(int[] array) {
		int n = array.length;
		for (int i = 0; i < n / 2; i++) {
			int temp = array[i];
			array[i] = array[n - i - 1];
			array[n - i - 1] = temp;
		}
	}

}
