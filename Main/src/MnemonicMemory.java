import java.util.*;

public class MnemonicMemory 
{
	public static String getPhrase(String number, String[] dictionary)
	{
		Comparator<String> c = new Comparator<String>()
		{

			@Override
			public int compare(String s1, String s2) {
				if(s1.length() != s2.length())
					return s1.length() - s2.length();
				return s1.compareTo(s2);
			}
			
		};
		
		String s = "";
				
		Arrays.sort(dictionary, c);
		
		for(int i = 0; i < number.length(); i++)
		{
			int n = number.charAt(i) - '0';
			
			for(int j = 0; j < dictionary.length; j++)
			{
				
				if(dictionary[j].length() == n)
				{
					s += dictionary[j] + " ";
					dictionary[j] = "";
					break;
				}
			}
		}
		
		return s.substring(0, s.length() - 1);
	}
	
	public static void main(String[] args)
	{
		String[] dic = {"is", "there", "anybody", "out", "there"};
		System.out.println(getPhrase("25735", dic));
	}
}
