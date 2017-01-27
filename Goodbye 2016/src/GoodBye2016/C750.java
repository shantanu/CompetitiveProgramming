package GoodBye2016;

import java.io.*;
import java.util.*;

public class C750 {

    static FastReader in = null;
    static PrintWriter out = null;

    public static void solve()
    {
        int n = in.nextInt();
        int maxRating = Integer.MAX_VALUE;
        int[] ratingSum = new int[n+1];
        ratingSum[0] = 0;
        int[] div = new int[n+1];
        int[] divChange = new int[n+1];
        
        for (int i = 1; i <= n ; i++){
        	int c = in.nextInt();
        	int d = in.nextInt();
        	
        	ratingSum[i] = ratingSum[i-1] + d;
        	div[i] = c;	
        }
        
        for (int i = 2; i <= n; i++){
        	divChange[i] = div[i] - div[i-1];
        	
        }
        
        
        for (int i = n; i > 1; i--){
        	if (divChange[i] == 1){ //Goes from div 1 to div 2 in ith contest
        		if (ratingSum[i] - ratingSum[i-1] >= 0){
        			out.print("Impossible"); //rating cannot increase and div go up
        		}
        		maxRating = 1899 + ratingSum[n] - ratingSum[i-1];
        	}
        	else if (divChange[i] == -1){ //Goes from div 2 to div 1 in ith contest
        		if (ratingSum[i] - ratingSum[i-1] <= 0){
        			out.print("Impossible"); //rating cannot decrease and div go down
        		}
        		maxRating = ratingSum[n] - ratingSum[i-1] + 1900;
        	}
        	else {
        		
        	}
        }
        
        out.print(maxRating);
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
