package collectionPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class duplicateCharacterCountInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String s = "Ramya";
    char[] c = s.toCharArray();
    Map<Character,Integer> countMap = new HashMap<Character,Integer>();
    
    for(char ch:c ) {
    	if(countMap.containsKey(ch)) {
    		countMap.put(ch, countMap.get(ch)+1);
    	}
    	else {
    		countMap.put(ch, 1);
    	}
    }
    
    Set<Map.Entry<Character,Integer>> entrySet = countMap.entrySet();
    for(Map.Entry<Character,Integer> entry : entrySet) {
    	if(entry.getValue()>1) {
    		System.out.println(entry.getKey()+":"+entry.getValue());
    	}
    }
	}

}
