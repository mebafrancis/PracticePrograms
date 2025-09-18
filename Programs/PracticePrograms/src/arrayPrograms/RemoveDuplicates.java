package arrayPrograms;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a[] = {1,2,3,2,4,2,5,2};
    
    LinkedHashSet l = new LinkedHashSet();
    for(int i=0;i<a.length;i++) {
    	l.add(a[i]);
    }
    
    Iterator it = l.iterator();
    while(it.hasNext()) {
    	System.out.println(it.next());
    }
	}

}
