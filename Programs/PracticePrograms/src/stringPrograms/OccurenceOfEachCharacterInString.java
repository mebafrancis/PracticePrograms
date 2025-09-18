package stringPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class OccurenceOfEachCharacterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Ramya is a kind girl";
		
		char[] ch = s.toCharArray();
		
		Map<Character,Integer> countMap = new HashMap<Character,Integer>();
		
		for(char c: ch) {
			if(countMap.containsKey(c)) {
				countMap.put(c, countMap.get(c)+1);
			}
			
			else {
				countMap.put(c, 1);
			}
		}
		
		Set<Entry<Character,Integer>> entrySet = countMap.entrySet();
		for(Entry<Character,Integer> entry: entrySet) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
	}

}
