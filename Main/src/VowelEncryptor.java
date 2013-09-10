
public class VowelEncryptor 
{
	public static boolean hasNonVowel(String text)
	{
		int c = 0;
		for(int i = 0; i < text.length(); i++)
		{
			if(text.charAt(i) == 'a' || text.charAt(i) == 'e' || text.charAt(i) == 'i' || text.charAt(i) == 'o' || text.charAt(i) == 'u')
				c++;
		}
		
		if(c > 1)
			return true;
		else
			return false;
	}
	
	public String[] encrypt(String[] text)
	{
		StringBuilder sb;
		for(int i = 0; i < text.length; i++)
		{
			sb = new StringBuilder();
			
			if(!hasNonVowel(text[i]))
				continue;
			else
			{
				for(int j = 0; j < text.length; j++)
				{
					if(text[i].charAt(j) == 'a' || text[i].charAt(j) == 'e' || text[i].charAt(j) == 'i' || text[i].charAt(j) == 'o' || text[i].charAt(j) == 'u')
						continue;
					else
						sb.append(text[i].charAt(j));
				}
				
				text[i] = sb.toString();
			}
		}
		return text;
	}
}