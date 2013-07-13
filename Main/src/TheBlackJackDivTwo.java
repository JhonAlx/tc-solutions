public class TheBlackJackDivTwo 
{
	public int score(String[] cards)
	{
		int c = 0;
		String a;
		
		for(int i = 0; i < cards.length; i++)
		{
			a = cards[i].substring(0, 1);
			
			if(a.equalsIgnoreCase("A"))
				c += 11;
			else
				if(a.equalsIgnoreCase("K") || a.equalsIgnoreCase("Q") || a.equalsIgnoreCase("T"))
					c += 10;
				else
					c += Integer.parseInt(a);
		}
		
		return c;
	}
}
