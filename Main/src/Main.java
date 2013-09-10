import java.io.*;
import java.util.*;

class Main
{
	static BufferedReader br;
	static Scanner sn;
	static ArrayList<Integer> a = new ArrayList<Integer>(); 
	
	public static void addToArrayList(String s)
	{
		String[] q = s.split("(?!^)");
		
		for(String y : q)
			a.add(Integer.parseInt(y));
	}
	
	public static long sumArray(ArrayList<Integer> i)
	{
		long x = 0;
		
		for(int q : i)
			x += q;
			
		return x;
	}
	
	public static void main(String[] args) throws IOException
	{
		br = new BufferedReader(new InputStreamReader(System.in));
		sn = new Scanner(System.in);
		String z;
		
		while((z = br.readLine()) != null)
		{
			a.clear();
			String[] c = z.split("\\s");
			int n = Integer.parseInt(c[0]);
			int m = Integer.parseInt(c[1]);
						
			if(n == 0 && m == 0)
				break;
			else
			{
				for(int i = n; i <= m; i++)
				{
					addToArrayList(String.valueOf(i));
				}
			
				System.out.println(sumArray(a));
			}
		}
	}
}