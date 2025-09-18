package arrayPrograms;

import java.util.HashSet;
import java.util.Set;

public class CommonElementsBetween2Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer> s = new HashSet<Integer>();
		
		int a1[] = {1,2,3,4,5,6};
		int a2[] = {2,4,6,8,10,12};
		
		for(int i=0;i<a1.length;i++) {
			for(int j=0;j<a2.length;j++) {
				if(a1[i]==a2[j]) {
					s.add(a1[i]);
					break;
				}
			}
		}
		
		for(int i:s) {
			System.out.print(i+",");
		}
		
		//retainAll()
		
		Set<String> set1 = new HashSet<String>();
		Set<String> set2 = new HashSet<String>();
		
		String arr1[] = {"Java","selenium","language","programming"};
		String arr2[] = {"Java","selenium","good","language"};
		
		for(String i:arr1) {
			set1.add(i);
		}
		
		for(String j:arr2) {
			set2.add(j);
		}
		
		set1.retainAll(set2);
		
		System.out.println(set1);
	}

}
