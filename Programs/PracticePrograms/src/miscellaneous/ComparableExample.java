package miscellaneous;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparableExample {

	public static void main(String[] args) {
		List<Person> newList=new ArrayList<Person>(Arrays.asList(
				new Person("Alice", 30, 65.5),
                new Person("Bob", 25, 75.0),
                new Person("Charlie", 35, 80.0)
                ));
		System.out.println("Original List ");
		printList(newList);
		Collections.sort(newList);
		System.out.println("Sorted people list: ");
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
