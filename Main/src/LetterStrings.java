
public class LetterStrings
{
	public int sum(String[] s)
	{
		int c = 0;
		
		for(int i = 0; i < s.length; i++)
		{
			for(int j = 0; j < s[i].length(); j++)
			{
				if(s[i].charAt(j) != '-')
					c++;
			}
		}
		
		return c;
	}
}
