
public class SentenceCapitalizerInator 
{
	public String fixCaps(String paragraph)
	{
		String[] p = paragraph.split("\\.\\s");
		StringBuilder sb = new StringBuilder();
		System.out.println(paragraph);
		
		for(String i : p)
			System.out.println(i);
		
		for(int i = 0; i < p.length; i++)
		{
			p[i] = p[i].substring(0, 1).toUpperCase() + p[i].substring(1);
			sb.append(p[i] + ". ");
		}
		paragraph = sb.toString();
		
		return paragraph.substring(0, paragraph.length() - 2);
	}
}
