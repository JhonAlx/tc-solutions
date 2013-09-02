public class JustifyText 
{
	public static String[] format(String[] text)
	{
		int max = 0;
		int n = 0;
		StringBuilder sb;
		
		for(int i = 0; i < text.length; i++)
		{
			if(text[i].length() > max)
				max = text[i].length();
		}
		
		for(int i = 0; i < text.length; i++)
		{
			sb = new StringBuilder();
			if(text[i].length() < max)
			{
				n = max - text[i].length();
				
				for(int j = 0; j < n; j++)
				{
					sb.append(" ");
				}
				
				sb.append(text[i]);
				
				text[i] = sb.toString();
			}
		}
		
		return text;
	}
}
