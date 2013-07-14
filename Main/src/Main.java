import java.util.*;
import java.io.*;	
	
public class Main {

	public static void main(String[] args) 
	{
		//BufferedReader br = new BufferedReader(new InputStreamReader( System.in ));
		Scanner sn = new Scanner( System.in );
		PrintWriter out = new PrintWriter(System.out);
		long n = sn.nextLong();
		ArrayList<Long> a = new ArrayList<Long>();
		
		if(n <= 2)
		{ 
			System.out.println("-1");	
			return; 
		}
		else
		{
			for(int i = (int) n; i <= 0; i--)
			{
				if(n % 2 == 0)
					{ n = n / 2; a.add(n); }
				else
					{ n = (n * ( n - 1 )) / 2; a.add(n); }
			}
		}
		Collections.sort(a);
		
		for(long i : a)
			System.out.println(i);
	}
}