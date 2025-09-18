package arrayPrograms;

public class DisplayLongestName {
	
	public static void main(String[] args) {

	String[] names = {"Ramya","Bhagya","Urvi","Melba","Tejashree"};
	
	int longest = names[0].length();
	int ans=0;
	for(int i=0;i<names.length;i++) {
		if(names[i].length()>longest) {
			longest = names[i].length();
			ans=i;
		}
	}
	
	System.out.println("Longest name is: "+names[ans]);
	
	}
	
}
