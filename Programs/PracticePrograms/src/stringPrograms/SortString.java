package stringPrograms;

public class SortString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String s = "selenium testing";
    
    char[] ch = s.toCharArray();
    
    for(int i=0;i<=ch.length-1;i++) {
    	for(int j=i+1;j<=ch.length-1;j++) {
    	if(ch[i]>ch[j]) {
    		char temp=ch[i];
    		ch[i]=ch[j];
    		ch[j]=temp;
    		
    	}
    }
	}
    
    for(int i=0;i<ch.length;i++) {
    	System.out.print(ch[i]);
    }
	}
}
