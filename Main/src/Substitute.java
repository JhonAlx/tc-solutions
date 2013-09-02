import java.util.*;

public class Substitute 
{
	public static int getValue(String key, String code)
	{
		StringBuilder sb = new StringBuilder();

		for(int i = 0; i < code.length(); i++)
		{
			System.out.print(key.indexOf(code.charAt(i)) % 10);
		}
		
		return Integer.parseInt(sb.toString());
	}
	
	public static void main(String[] args)
	{
		System.out.println(getValue("TRADINGFEW", "LGXWEV"));
	}
}
