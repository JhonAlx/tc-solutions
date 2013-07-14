public class Justifier 
{
	public String[] justify(String[] textIn)
	{
		int l = 0;
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < textIn.length; i++)
			if(textIn[i].length() > l)
				l = textIn[i].length();
		
		for(int i = 0; i < textIn.length; i++)
		{
			sb = new StringBuilder(textIn[i]).reverse();
			while(sb.toString().length() != l)
			{
				sb.append(" ");
			}
			sb = new StringBuilder(sb.toString()).reverse();
			textIn[i] = sb.toString();
		}
		
		return textIn;
	}
}
