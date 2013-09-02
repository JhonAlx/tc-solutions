import java.util.*;

public class ColorfulCookie 
{
	int getMaximum(int[] cookies, int P1, int P2)
	{
		Comparator<Integer> co = new Comparator<Integer>(){

			@Override
			public int compare(Integer o1, Integer o2) {
				if(o1 > o2)
					return -1;
				return 0;
			}
		};


		boolean b = true;
		int count = 0;
		
		Integer[] pI = {P1, P2};
		Integer[] cI = new Integer[cookies.length];
		
		for(int i = 0; i < cookies.length; i++)
			cI[i] = cookies[i];
		
		if(cI.length == 1)
			System.out.println("0");
		else
		{
			Arrays.sort(pI, co);
			Arrays.sort(cI, co);

			for(int i = cI.length - 1; i >= 1; i--)
			{
				while(cI[i] - pI[1] >= 0 && cI[i - 1] - pI[0] >= 0)
				{
					count += pI[1] + pI[0];
					cI[i] = cI[i] - pI[1];
					cI[i - 1] = cI[i - 1] - pI[0];

					Arrays.sort(pI, co);
					Arrays.sort(cI, co);
				}

			}
		}
		return count;
	}
}
