import java.util.ArrayList;

public class VowelLatin 
{
	public String translate(String word)
	{
		ArrayList<String> a = new ArrayList<String>();
		char c;
		StringBuilder sb =  new StringBuilder();
		
		for(int i = 0; i < word.length(); i++)
		{
			c = word.charAt(i);
			
			if(c == 'A' || c == 'a')
			{
				a.add(String.valueOf(c));
				sb = new StringBuilder(word).deleteCharAt(i);
				word = sb.toString();
			}
			else
				if(c == 'E' || c == 'e')
				{
					a.add(String.valueOf(c));
					sb = new StringBuilder(word).deleteCharAt(i);
					word = sb.toString();
				}
				else
					if(c == 'I' || c == 'i')
					{
						a.add(String.valueOf(c));
						sb = new StringBuilder(word).deleteCharAt(i);
						word = sb.toString();
					}
					else
						if(c == 'O' || c == 'o')
						{
							a.add(String.valueOf(c));
							sb = new StringBuilder(word).deleteCharAt(i);
							word = sb.toString();
						}
						else
							if(c == 'U' || c == 'u')
							{
								a.add(String.valueOf(c));
								sb = new StringBuilder(word).deleteCharAt(i);
								word = sb.toString();
							}
		}
		
		sb = new StringBuilder();
		sb.append(word);
		
		for(int i = 0; i < a.size(); i++)
		{
			sb.append(a.get(i));
		}
		
		return sb.toString();
	}
}
