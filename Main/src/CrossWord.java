
public class CrossWord 
{
	public int countWords(String[] board, int size)
	{
		int c = 0;
		int aux = 0;
		
		for(int i = 0; i < board.length; i++)
		{
			aux = 0;
			
			for(int j = 0; j < board[i].length(); j++)
			{
				if(board[i].charAt(j) == '.')
					aux++;
				else
					aux = 0;
			}
			
			if(aux == size)
				c++;
		}
		
		return c;
	}
}
