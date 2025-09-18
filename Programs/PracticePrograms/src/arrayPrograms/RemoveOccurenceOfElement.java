package arrayPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveOccurenceOfElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {3,1,2,3,4,5,3,6,7,3};
		int key = 3;
		
		List<Integer> result = new ArrayList<Integer>();
		
		for(int i:a) {
			if(i!=key) {
				result.add(i);
			}
		}
		
		//to print list elements
		for(int i=0;i<result.size();i++) {
			System.out.print(result.get(i));
		}
		
		System.out.println();
		System.out.println("*******");
		
		//to convert list to array
		Integer arr[] =  new Integer[result.size()];
		arr = result.toArray(arr);
		for(int i:arr) {
			System.out.print(i);
		}
		}
	

}
