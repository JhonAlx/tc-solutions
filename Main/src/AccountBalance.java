public class AccountBalance 
{
	public int processTransactions(int startingBalance, String[] transactions)
	{
		int c = 0;
		
		c = c + startingBalance;
		
		for(int i = 0; i < transactions.length; i++)
		{
			String[] a = transactions[i].split(" ");
			
			if(a[0].equalsIgnoreCase("C"))
				c += Integer.parseInt(a[1]);
			else
				c -= Integer.parseInt(a[1]);
		}
		
		return c;
	}
	
	public static void main(String[] args)
	{
		int a = 100;
		String[] b = {"C 1000", "D 500", "D 350"};
		
		System.out.println();
	}
}
