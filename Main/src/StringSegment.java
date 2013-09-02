import java.util.*;

public class StringSegment 
{
	public static double average(String s)
	{
		int count = 1;
		char c = s.charAt(0);
		
		for(int i = 1; i< s.length(); ++i)
		{
			if(s.charAt(i) != c)
				count++;
			
			c = s.charAt(i);
		}
		
		return 1.0 * s.length() / count;
	}
	
	public static void main(String[] args)
	{
		System.out.println(average("aaabbaaac"));
	}
}
