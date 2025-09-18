package arrayPrograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1.Bruteforce method(integer array)
		int numArray[] = { 2, 3, 2, 4, 5, 2 };
		for (int i = 0; i < numArray.length; i++) {
			for (int j = i + 1; j < numArray.length; j++) {
				if (numArray[i] == numArray[j]) {
					System.out.println(numArray[i]);
				}
			}
		}
		
		
		//2.Bruteforce method(String array)
		String names[] = {"ram","krishna","ram","vishnu","shiva","ram"};
		for(int i=0;i< names.length;i++) {
			for(int j=i+1;j<names.length;j++) {
				if(names[i].equals(names[j])) {
					System.out.println(names[i]);
				}
			}
		}
		
		System.out.println("****HashSet****");
		//3.Hashset
		Set<String> data = new HashSet<String>();
		for(String e:names) {
			if(data.add(e)== false) {
				System.out.println(e);
			}
		}
		
		System.out.println("****HashMap****");
		//4.HashMap
		
		Map<String,Integer> dataMap = new HashMap<String,Integer>();
		for(String e:names) {
			Integer count = dataMap.get(e);
			if(count==null) {
				dataMap.put(e, 1);
				
			}
			else {
				dataMap.put(e, count+1);
			}
		}
		
		Set<Entry<String,Integer>> entrySet = dataMap.entrySet();
		for(Entry<String,Integer> entry: entrySet) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey());
			}
		}

	}

}
