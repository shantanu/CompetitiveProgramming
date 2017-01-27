import java.io.*;
import java.util.*;

public class A166 {

    static FastReader in = null;
    static PrintWriter out = null;

    public static void solve()
    {
        int n = in.nextInt();
        int k = in.nextInt();
        int pt[][] = new int[n][2];
        for (int i = 0; i < n; i++){
        	pt[i][0] = in.nextInt();
        	pt[i][1] = in.nextInt();
        }
        
        //insertion sort for the array of teams max O(n^2)
        
        for (int i = 1; i < n; i++){
        	for (int j = i; j > 0; j--){
        		if ( (pt[j][0] > pt[j-1][0]) || (pt[j][0] == pt[j-1][0] && pt[j][1] < pt[j-1][1]) ){
        			swap(j, j-1, pt);
        		}
        		else break;
        	}
        }
        
        // determine how many teams in kth place
        int[] place = new int[n+1];
        for (int i = 0; i < n; i++){
        	if (place[i+1] == 0){
        		int count = 1;
	        	for (int j = i; j < n-1; j++) {
	        		if (pt[j][0] == pt[j+1][0] && pt[j][1] == pt[j+1][1]) {
	            		count++;
	            	}
	        		else {
	        			break;
	        		}
	        	}
	        	for (int p = i+1; p <= i + count; p++){
	        		place[p] = count;
	        	}
        	}
        	
        	
        }
        
        
        out.println(place[k]);
        
    }
    
    public static void swap (int i, int j, int[][] a){
    	int m0 = a[i][0];
    	int m1 = a[i][1];
    	a[i][0] = a[j][0];
    	a[i][1] = a[j][1];
    	a[j][0] = m0;
    	a[j][1] = m1;
    }
    
    public static void main(String[] args)
    {
        in = new FastReader(System.in);
        out = new PrintWriter(System.out);
        solve();
        out.flush();
        out.close();

    }

    static class FastReader {

        BufferedReader read;
        StringTokenizer tokenizer;

        public FastReader(InputStream in)
        {
            read = new BufferedReader(new InputStreamReader(in));
        }

        public String next()
        {
            while(tokenizer == null || !tokenizer.hasMoreTokens())
            {
                try{
                    tokenizer = new StringTokenizer(read.readLine());
                }catch(Exception e){
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }
        public String nextLine(){

            try
            {
                return read.readLine();
            }
            catch(Exception e)
            {
                throw new RuntimeException(e);
            }
        }
        public int nextInt()
        {
            return Integer.parseInt(next());
        }
        public long nextLong()
        {
            return Long.parseLong(next());
        }
        public double nextDouble()
        {
            return Double.parseDouble(next());
        }

        public int[] nextIntArr(int n)
        {
            int[] a = new int[n];
            for(int i=0; i<n; ++i)
            {
                a[i] = nextInt();
            }
            return a;
        }

        public long[] nextLongArr(int n)
        {
            long[] a = new long[n];
            for(int i=0; i<n; ++i)
            {
                a[i] = nextLong();
            }
            return a;
        }
    }


}
