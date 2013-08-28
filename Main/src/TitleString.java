
public class TitleString 
{
	public String toFirstUpperCase(String title)
	{
		char[] c = title.toCharArray();
		
		for(int i = 0; i < c.length; i++)
		{
			if(c[i] != ' ' && (i == 0 || c[i - 1] == ' '))
				c[i] = (char)(c[i] - 32);
		}
		
		return new String(c);
	}
}
