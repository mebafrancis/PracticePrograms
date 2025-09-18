package stringPrograms;

public class CharCountWithoutUsingConditions {
	
	public static void main(String[] args) {

	String x="Publicis Sapient";
	char val= 'i';
	
	long count = x.chars().filter(e->e ==val).count();
	
	System.out.println(count);
	
	//Melba code
	
	String stringUnderConsideration="Here we come";
	char toFind='e';
	long countValue=stringUnderConsideration.chars().filter(e->e ==toFind).count();
	System.out.println(countValue);
	
}
}
