package stringPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CountDuplicateChars {

	public static void main(String[] args) {
		 String newValue="189537235893";
	       int count=1;
	       int value=0;
	       for(int i=0;i<newValue.length();i++)
	       {
	          value=newValue.charAt(i);
	          
	          for(int j=i+1;j<newValue.length();j++)
	          {
	             if(newValue.charAt(i)==newValue.charAt(j))
	             {
	               count++;
	             }
	          }
	          if(count>1)
	          {
	       System.out.print(newValue.charAt(i));
	       System.out.println(" count is "+count);
	       count=1;
	          }
	       }
	       
	       //Melba code
	       char[] charvalue=newValue.toCharArray();
	       Map<Character,Integer> valuemap=new HashMap<Character,Integer>();
	       for(char a: charvalue)
	       {
	    	   valuemap.put(a, valuemap.getOrDefault(a, 0)+1);
	       }
           
	       for(Map.Entry<Character,Integer> entryValue:valuemap.entrySet())
	       {
	    	   if(entryValue.getValue()>1)
	    	   {
	    		   System.out.println("The value is "+entryValue.getKey() + " and the value is "+entryValue.getValue());
	    	   }
	       }
	}

}
