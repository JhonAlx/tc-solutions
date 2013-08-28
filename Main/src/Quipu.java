
public class Quipu 
{
	public static int readKnots(String knots)
	{
		String[] its = knots.split("-", -1);
		int val = 0;
		
		for (String i : its)
		{
			val = val * 10 + i.length();
			System.out.println(val);
		}
		return val/10;
	}
	
	public static void main(String[] args)
	{
		System.out.println(readKnots("-XX-XXXX-XXX-"));
	}
}
