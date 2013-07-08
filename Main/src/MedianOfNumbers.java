import java.util.Arrays;

public class MedianOfNumbers 
{
	public int findMedian (int[] numbers)
	{
		if(numbers.length % 2 == 0)
			return -1;
		else
		{
			int half = (int) Math.ceil(numbers.length / 2);
			Arrays.sort(numbers);
			return numbers[half];
		}
	}
}
