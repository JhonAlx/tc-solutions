
public class bloggoShortcuts 
{
	public String expand(String text)
	{
		boolean b = true;
		String[] s = text.split("(?!^)");
		
		for(int i = 0; i < s.length; i++)
		{
			if(s[i].equals("_"))
			{
				if(b)
				{
					s[i] = "<i>"; 
					b = false;
				}
				else
				{
					s[i] = "</i>"; 
					b = true;
				}
			}
			else
				if(s[i].equals("*"))
				{
					if(b)
					{
						s[i] = "<b>"; 
						b = false;
					}
					else
					{
						s[i] = "</b>"; 
						b = true;
					}
				}
		}
		
		text = "";
		
		for(int i = 0; i < s.length; i++)
			text += s[i];
		
		return text;
	}
}