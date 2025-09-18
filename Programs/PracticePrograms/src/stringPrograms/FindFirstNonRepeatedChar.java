package stringPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindFirstNonRepeatedChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s= "automation";
		
		char ch[] = s.toCharArray();
		
		Map<Character,Integer> charMap = new HashMap<Character,Integer>();
		
		for(Character c: ch) {
			Integer count = charMap.get(c);
			if(charMap.containsKey(c)) {
				charMap.put(c, count+1);
			}
			else {
				charMap.put(c, 1);
			}
			
		}
		
		Set<Entry<Character,Integer>> entrySet = charMap.entrySet();
		for(Entry<Character,Integer> entry: entrySet) {
			if(entry.getValue()==1) {
				System.out.println(entry.getKey()+":"+entry.getValue());
				break;
			}
		}
		
		
	}

}
