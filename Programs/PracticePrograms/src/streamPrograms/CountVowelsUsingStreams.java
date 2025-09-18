package streamPrograms;
import java.util.Set;

public class CountVowelsUsingStreams {

	public static void main(String[] args) {
		 String input = "Hello World! This is a Java Stream Example.";
         long vowelCount= countVowel(input);
         System.out.println(vowelCount);
	}
	public static long countVowel(String input)
	{
		Set<Character> vowel = Set.of('a','e','i','o','u');
		
		return input.toLowerCase()
				.chars()
				.mapToObj(c->(char)c)
				.filter(vowel::contains)
                .count();
}

}
