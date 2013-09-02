
public class StringMult 
{
	public static String times(String sFactor, int iFactor)
	{
		String s = ""; 
		int y = iFactor;
		
		if(sFactor.equals("") || iFactor == 0)
			return s;
		else
			if(iFactor < 0)
			{
				StringBuilder sb = new StringBuilder(sFactor).reverse();
				String q = sb.toString();
				
				while(true)
				{
					s += q;
					y++;
					if(y == 0)
						break;
				}
				return s;
			}
			else
			{
				while(true)
				{
					s += sFactor;
					y--;
					if(y == 0)
						break;
				}
				return s;
			}
	}
}
