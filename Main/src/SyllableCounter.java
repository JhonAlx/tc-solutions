
public class SyllableCounter 
{
	public static int countSyllables(String word)
	{
		int c = 0;
		
		String[] s = word.split("[aeiouAEIOU]+");
		
		if(word.charAt(word.length() - 1) == 'A' || word.charAt(word.length() - 1) == 'E' || word.charAt(word.length() - 1) == 'I' || word.charAt(word.length() - 1) == 'O' || word.charAt(word.length() - 1) == 'U')
			return s.length;
		else
			return s.length - 1;
	}
}
