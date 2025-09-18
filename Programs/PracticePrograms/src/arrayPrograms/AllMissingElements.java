package arrayPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class AllMissingElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {6,7,10,11,13};
		Arrays.sort(a);
		HashSet<Integer> set = new HashSet<>();
		
		for(int i = a[0];i<a[a.length-1];i++) {
			set.add(i);
		}
		
		for(int i =0;i<a.length;i++) {
			set.remove(a[i]);
		}
		
		for(int x:set) {
			System.out.println(x+" ");
		}
		
		//Melba Practice
		
		Integer a1[] = {6,7,10,11,13};
		Arrays.sort(a1);
		HashSet<Integer> set1=new HashSet<>();
		for(int i=a[0];i<a[a.length-1];i++)
		{
			set1.add(i);
		}
		
		List<Integer> lis1= Arrays.asList(a1);
		
		set1.removeAll(lis1);
		
		for(int yy: set1)
		{
			System.out.println(yy);
		}
	}

}
