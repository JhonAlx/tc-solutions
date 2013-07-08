public class EscapeFromRectangle 
{
	public int shortest(int x, int y, int w, int h)
    {
            int a = Math.min(Math.abs(x-w), x);
            int b = Math.min(Math.abs(y-h), y);
            return Math.min(a, b);
    }
}
