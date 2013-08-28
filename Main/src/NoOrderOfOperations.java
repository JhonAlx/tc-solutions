import java.util.*;

public class NoOrderOfOperations 
{
	public static int evaluate(String expr)
	{
		int r = 0;
		ArrayList<String> a = new ArrayList<String>();
		String[] s = null;
		
		for(int i = 1; i < expr.length(); i++)
		{
			if(expr.charAt(i) == '+' || expr.charAt(i) == '-' || expr.charAt(i) == '*' || expr.charAt(i) == '/')
			{
				a.add(String.valueOf(expr.charAt(i)));
			}
		}
		
		for(String q : a)
			System.out.println(q);
		
		s = expr.split("[/*-+]");
		
		for(String q : s)
			System.out.println(q);
		
		for(int i = 0; i < s.length; i++)
		{
			if(i == 0)
				r += Integer.parseInt(s[i]);
			else
				if(a.get(i - 1).equals("+"))
					r = r + Integer.parseInt(s[i]);
				else
					if(a.get(i - 1).equals("-"))
						r = r - Integer.parseInt(s[i]);
					else
						if(a.get(i - 1).equals("*"))
							r = r * Integer.parseInt(s[i]);
		}
		
		return r;
	}
	
	public static void main(String[] args)
	{
		System.out.println(evaluate("3+5*7"));
	}
}
