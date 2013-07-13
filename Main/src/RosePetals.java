
public class RosePetals 
{
	public int getScore(int[] dice)
	{
		int c = 0;;
		
		for(int i : dice)
		{
			switch(i)
			{
				case 3:
					c += 2;
					break;
				case 5:
					c += 4;
					break;
			}
		}
		
		return c;
	}
}
