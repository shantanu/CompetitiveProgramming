package Round390;

import java.io.*;
import java.util.*;

public class D754 {

    static FastReader in = null;
    static PrintWriter out = null;

    public static void solve()
    {
        int n = in.nextInt();
        int k = in.nextInt();
        
        long[][] posid = new long[(int)2E9+1][k];
        for (int i = 0; i < n; i++){
        	int l = in.nextInt();
        	int r = in.nextInt();
        	for (int j = l; j <= r; j++){
        		for (int p = 0; p < k; p++){
        			if (posid[j][p] == 0){
        				posid[j][p] = i+1;
        				break;
        			}
        		}
        	}
        	
        	
        }
        int maxCount = 0;
        int startIndex = 0;
        int endIndex = 0;
        for (int i = 0; i < posid.length; i++){
        	int j = 0;
        	for (j = 0; j < k; j++){
        		if (posid[i][j] == 0) break;
        	}
        	if(j == maxCount){
        		endIndex = i;
        	}
        	else if (j > maxCount) {
        		startIndex = i;
        		endIndex = i;
        		maxCount = j;
        	}
        }
        
        out.println(endIndex - startIndex + 1);
        for (int i = 0; i < k; i++){
        	out.print(posid[startIndex][i] + " ");
        }
        
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
