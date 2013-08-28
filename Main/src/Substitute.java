import java.util.TreeSet;

public class Substitute 
{
	public static int getValue(String key, String code)
	{
		String s;
		StringBuilder sb = new StringBuilder();
		char[] c = code.toCharArray();
		TreeSet<String> t = new TreeSet<String>();
		
		for(char q : c)
		{
			t.add(String.valueOf(q));
		}
		
		for(String q : t)
		{
			for(int i = 0; i < code.length(); i++)
			{
				if(code.contains(q))
				{
					sb.append(String.valueOf(code.indexOf(q)));
				}
			}
		}
		
		return Integer.parseInt(sb.toString());
	}
	
	public static void main(String[] args)
	{
		System.out.println(getValue("TRADINGFEW", "LGXWEV"));
	}
}
