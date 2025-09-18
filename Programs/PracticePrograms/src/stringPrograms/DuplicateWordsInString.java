package stringPrograms;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateWordsInString {
	
	public static void main(String[] args) {
	
	String s = "Ramya is a very very good girl";
	
	String s1[]= s.split(" ");
	
	HashMap<String,Integer> countMap = new HashMap<String, Integer>();
	for(String str: s1) {
	Integer count = countMap.get(str);
		if(countMap.containsKey(str)) {
			countMap.put(str, count+1);
		}
		else {
			countMap.put(str, 1);
		}
	}
	
	Set<Entry<String,Integer>> entrySet = countMap.entrySet();
	for(Entry<String,Integer> entry: entrySet) {
		if(entry.getValue()>1) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
	}
	
	}
}
