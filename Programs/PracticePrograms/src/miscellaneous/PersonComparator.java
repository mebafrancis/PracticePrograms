package miscellaneous;

public class PersonComparator {
	
	private String name;
	private int age;
	private double weight;
	
    public PersonComparator(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    
    public String getName()
    { 
    	return this.name;
    }

}
