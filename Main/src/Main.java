import java.io.*;
import java.util.*;

class Main
{
	static BufferedReader br;
	static Scanner sn;
	
	public static void main(String[] args) throws IOException
	{
		Main myWork = new Main();
		myWork.begin();
	}
	
	static void begin()
	{
		br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = null;
		char[] s, s1;
		try
		{
			int n = Integer.parseInt(br.readLine());
			int x;
		
			for(int i = 0; i < n; i++)
			{
				sb  = new StringBuilder();
				s = br.readLine().toCharArray();
				s1 = br.readLine().toCharArray();
							
				for(int j = 0; j < s.length; j++)
				{
					x = (int) s[j] - 64;
					if(x == -32)
						sb.append(" ");
					else
						sb.append(s1[x - 1]);
				}
				System.out.println((i + 1) + " " + sb.toString());
			}
		}
		catch(IOException e)
		{}
	}
}