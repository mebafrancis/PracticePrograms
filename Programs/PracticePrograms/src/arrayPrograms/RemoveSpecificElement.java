package arrayPrograms;

import java.util.Scanner;

public class RemoveSpecificElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int index = 3;
		
		System.out.println("enter number of elements of array");
		
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		
		
		int a[] = new int[10];
		
		System.out.println("enter elements of array");
		for(int i=0;i<n;i++) {
			a[i]= sc.nextInt();
		}
		
		System.out.println("Array elements are");
		for(int i=0;i<n;i++) {
		System.out.println(a[i]);
		}
		
		int[] newArray = new int[a.length-1];
		
		
		for(int i=0,k=0;i<a.length;i++) {
			if(i==index) {
				continue;
			}
			
			newArray[k++] = a[i];
		}
		
		for(int j=1;j<newArray.length;j++) {
			System.out.println("array after removing key: "+newArray[j]);
		}
		
	}

}
