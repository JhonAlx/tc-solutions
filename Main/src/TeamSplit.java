import java.util.*;

public class TeamSplit 
{
	public int difference(int[] strengths)
	{
		int a = 0;
		int b = 0;
		
		Arrays.sort(strengths);
		
		for(int i = 0; i < strengths.length; i++)
		{
			if(i % 2 == 0)
				a += strengths[i];
			else
				b += strengths[i];
		}
		
		return Math.abs(a - b);
	}
}
