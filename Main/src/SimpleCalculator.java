public class SimpleCalculator
{
	public static int calculate(String input)
	{
		int c = 0;
		char op = 'a';
		for(int i = 1; i < input.length(); i++)
		{
			if(input.charAt(i) == '+' || input.charAt(i) == '-' || input.charAt(i) == '*' || input.charAt(i) == '/')
			{
				op = input.charAt(i);
				break;
			}
		}
				
		String[] s = input.split("[/*-+]");
		
		if(op == '+')
			c = Integer.parseInt(s[0]) + Integer.parseInt(s[1]);
		else
			if(op == '-')
				c = Integer.parseInt(s[0]) - Integer.parseInt(s[1]);
			else
				if(op == '*')
					c = Integer.parseInt(s[0]) * Integer.parseInt(s[1]);
				else
					if(op == '/')
						c = Integer.parseInt(s[0]) / Integer.parseInt(s[1]);
		
		return c;
	}
	
	public static void main(String[] args)
	{
		System.out.println(calculate("2+1"));
	}
}


