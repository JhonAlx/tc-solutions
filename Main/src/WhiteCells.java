
public class WhiteCells 
{
	public static int countOccupied(String[] board)
	{
		int oc = 0;
		
		for(int i = 0; i < board.length; i++)
		{
			if(i % 2 == 0 && board[i].equalsIgnoreCase("F"))
				oc++;
		}
		
		return oc;
	}
}
