
public class HiddenMessage 
{
	public String getMessage(String text)
	{
		StringBuilder sb = new StringBuilder();
		String[] s = text.split("\\s");
		
		for(String q : s)
		{
			if(q.length() == 0)
				continue;
			else
				sb.append(q.charAt(0));
		}
		
		return sb.toString();
	}
}
