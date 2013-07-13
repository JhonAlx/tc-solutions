import java.util.*;
import java.io.*;	
	
public class Main {

	public static void main(String[] args) 
	{
		//BufferedReader br = new BufferedReader(new InputStreamReader( System.in ));
		Scanner sn = new Scanner( System.in );
		PrintWriter out = new PrintWriter(System.out);
		 
	    boolean first = true;
	    while (sn.hasNextInt()) {
	      if (!first)
	        out.println();
	      int N = sn.nextInt();
	      String[] friends = new String[N];
	      HashMap<String, Integer> map = new HashMap<String, Integer>();
	      for (int i = 0; i < N; i++) {
	        friends[i] = sn.next();
	        map.put(friends[i], i);
	      }
	      int[] moneys = new int[N];
	      for (int i = 0; i < N; i++) {
	        int idx = map.get(sn.next());
	        int gift = sn.nextInt();
	        int M = sn.nextInt();
	        if (M > 0) {
	          moneys[idx] -= gift;
	          if (gift != 0 && gift % M != 0) {
	            int t = gift % M;
	            moneys[idx] += t;
	            gift -= t;
	          }
	          for (int j = 0; j < M; j++) {
	            moneys[map.get(sn.next())] += gift / M;
	          }
	        }
	      }
	      for (int i = 0; i < N; i++) {
	        out.println(friends[i] + " " + moneys[i]);
	      }
	      first = false;
	    }
	    out.close();
	}
}