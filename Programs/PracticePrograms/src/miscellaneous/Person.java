package miscellaneous;

public class Person implements Comparable<Person> {
	private String name;
	private int age;
	private double weight;
	
    public Person(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    
    public String getName()
    { 
    	return this.name;
    }
    
    public int getAge()
    { 
    	return this.age;
    }
    
    public double getWeight()
    { 
    	return this.weight;
    }
    
	@Override
	public int compareTo(Person o) {
		return this.age - o.age;
	}

}
