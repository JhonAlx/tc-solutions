
public class MassiveNumbers 
{
	public String getLargest(String numberA, String numberB)
	{
		String s1[] = numberA.split("\\^");
		String s2[] = numberB.split("\\^");
		
		double n1 = Integer.parseInt(s1[1]) * Math.log(Integer.parseInt(s1[0]));
		double n2 = Integer.parseInt(s2[1]) * Math.log(Integer.parseInt(s2[0]));
		
		if(n1 > n2)
			return numberA;
		else
			return numberB;
	}
}
