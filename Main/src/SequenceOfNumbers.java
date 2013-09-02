import java.util.Arrays;

public class SequenceOfNumbers 
{
	public static String[] rearrange(String[] sequence)
	{
		int[] s = new int[sequence.length];
		
		for(int i = 0; i < sequence.length; i++)
			s[i] = Integer.parseInt(sequence[i]);
			
		Arrays.sort(s);
		
		for(int i = 0; i < sequence.length; i++)
			sequence[i] = String.valueOf(s[i]);
		
		return sequence;
	}
}
