
public class GridGenerator 
{
	public int generate(int[] row, int[] col)
	{
		int[][] gr = new int[row.length][col.length];
		
		for(int i = 0; i < row.length; i++)
		{
			gr[i][0] = row[i]; gr[0][i] = col[i];
		}
		
		for(int i = 1; i < row.length; i++)
		{
			for(int j = 1; j < col.length; j++)
			{
				gr[i][j] = gr[i - 1][j] + gr[i][j - 1] + gr[i - 1][j - 1];
			}
		}
		
		return gr[row.length - 1][col.length - 1];
	}
}
