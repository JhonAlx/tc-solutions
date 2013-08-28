
public class LuckyCounter 
{
	public int countLuckyMoments(String[] moments)
	{
		int c = 0;
		String[] s = null;
		
		for(int i = 0; i < moments.length; i++)
		{
			s = moments[i].split("\\:");
			if(s[0].equalsIgnoreCase(s[1]))
				c++;
			else
				if(s[0].equals(new StringBuilder(s[1]).reverse().toString()))
					c++;
		}
		
		return c;
	}
}
