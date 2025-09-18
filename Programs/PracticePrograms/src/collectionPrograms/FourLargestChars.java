package collectionPrograms;

import java.util.Set;
import java.util.TreeSet;

public class FourLargestChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//print 4 largest characters from char array
		char[] ch = {'a','b','a','c','d','e','f','d'};
		
		Set t = new TreeSet();
		for(char c: ch) {
			t.add(c);
			System.out.println(t);
			}
		((TreeSet) t).pollFirst();
		((TreeSet) t).pollFirst();
		System.out.println(t);
	}

}
