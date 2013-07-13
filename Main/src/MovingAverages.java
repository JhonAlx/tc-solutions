import java.util.*;

public class MovingAverages 
{
	public int[] calculate(String[] times, int n)
	{
		Calendar c = Calendar.getInstance();
		
		int[] avg = new int[n];
		
		for(int i = 0; i < n; i++)
			avg[i] = 0;
			
		for(int i = 0; i < times.length; i++)
		{
			for(int j = i; j < n; j++)
			{
				String[] t = times[j].split(":");
				c.set(Calendar.HOUR, Integer.parseInt(t[0]));
				c.set(Calendar.MINUTE, Integer.parseInt(t[1]));
				c.set(Calendar.SECOND, Integer.parseInt(t[2]));
				
				avg[i] += c.get(Calendar.HOUR) + c.get(Calendar.MINUTE) + c.get(Calendar.SECOND);
			}
		}
		
		return avg;
	}
}
