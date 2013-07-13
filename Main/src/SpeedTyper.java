public class SpeedTyper 
{
	public static String lettersToPractice(String letters, int[] times)
	{
		StringBuilder sb =  new StringBuilder();
		float avg = 0;		
		int[] r = new int[times.length];
		
		for(int i = 0; i < times.length; i++)
		{
			if(i == 0) { r[i] = times[i]; avg += r[i]; }
			else { r[i] = times[i] - times[i - 1]; avg += r[i]; }
		}
			
		avg = avg / times.length;
		
		for(int i = 0; i < r.length; i++)
		{
			if(r[i] > avg)
				sb.append(String.valueOf(letters.charAt(i)));
		}
			
		return sb.toString();
	}
}
