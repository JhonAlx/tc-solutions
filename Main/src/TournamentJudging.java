public class TournamentJudging 
{
	public int getPoints(int[] rawScores, int[] conversionFactor)
	{
		int r = 0;
		for(int i = 0; i < rawScores.length; i++)
		{
			r += (int)Math.round((double)rawScores[i] / conversionFactor[i]);
		}
		
		return (int) r;
	}
}
