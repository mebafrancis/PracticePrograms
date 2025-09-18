package arrayPrograms;

import java.util.Arrays;
import java.util.List;

public class SearchElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		int a[] = { 2, 5, 1, 4,7};
		int search = 1;
		
		//1. Using linear search method
//		for(int element: a) {
//			if(element==search)
//				System.out.println("element is present in array");
//		}
		
		//2. List.contains()
		boolean b =searchUsingList(a,search);
		System.out.println(b);
	}	
		public static boolean searchUsingList(int arr[],int searchNum) {
		boolean result=  Arrays.asList(arr).contains(searchNum);
		System.out.println(result);
			return result;
		}
	}


