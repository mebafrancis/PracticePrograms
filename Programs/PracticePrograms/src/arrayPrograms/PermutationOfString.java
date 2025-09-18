package arrayPrograms;

public class PermutationOfString {

	public static void main(String[] args) {
		String string1="DFAB";
		PermutationOfString per =new PermutationOfString();
		per.permute(string1,"");

	}
	
	public void permute(String value,String prefix)
	{
		if(value.isEmpty())
		{
			System.out.println(prefix);
		}
		else 
		{
			for(int i=0;i<value.length();i++)
			{
				char a=value.charAt(i);
				String left=value.substring(0,i);
				String right=value.substring(i+1);
				String remaining=left+right;
				permute(remaining,prefix+a);
			}
			
		}
	}

}
