package miscellaneous;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparatorExample {

	public static void main(String[] args) {
		List<Person> newList=new ArrayList<Person>(Arrays.asList(
				new Person("Alice", 15, 90),
                new Person("Bob", 25, 45),
                new Person("Charlie", 35, 80.0)
                ));
		ComparatorName comparatorName= new ComparatorName();
		Collections.sort(newList,comparatorName);
		printList(newList);
		ComparatorWeight comparatorWeight= new ComparatorWeight();
		Collections.sort(newList,comparatorWeight);
		printList(newList);
		

	}
	
	private static void printList(List<Person> newList)
	{
		for(Person p :newList )
		{
			System.out.println(p.getName());
		}
	}

}
