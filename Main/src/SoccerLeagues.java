
public class SoccerLeagues
{
	public int[] points(String[] matches)
	{
		int[] r = new int[matches.length];
		
		for(int i = 0; i < matches.length; i++)
		{
			String[] a = matches[i].split("(?!^)");
			
			for(String q : a)
			{
				if(q.equalsIgnoreCase("W"))
					r[i] += 3;
				else
					if(q.equalsIgnoreCase("D"))
						r[i] += 1;
					else
						r[i] += 0;
			}
			
		}
		
		return r;
	}
}
