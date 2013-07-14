
public class CssPropertyConverter 
{
	public String getCamelized(String cssPropertyName)
	{
		String[] p = cssPropertyName.split("\\-");
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < p.length; i++)
		{
			if(i == 0)
				sb.append(p[i]);
			else
			{
				sb.append(p[i].substring(0, 1).toUpperCase() + p[i].substring(1));
			}
		}
		
		return sb.toString();
	}
}
