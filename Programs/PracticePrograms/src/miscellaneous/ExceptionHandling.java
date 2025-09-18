package miscellaneous;
import java.util.Optional;

public class ExceptionHandling {
	
	public static void main(String[] args)
	{
		String value = null;
		
		//with optional clause
		String handledvalue= Optional.ofNullable(value).orElse("Default Value");
		System.out.println(handledvalue.length());
		
		//With try catch block
		try {
			System.out.println(value.length());
		}
		catch(NullPointerException e)
		{
			System.out.println("NullPointerException is handled");
		}
	}

}
