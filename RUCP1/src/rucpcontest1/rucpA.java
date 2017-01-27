package rucpcontest1;

import java.io.*;
import java.util.*;

public class rucpA {

    static FastReader in = null;
    static PrintWriter out = null;

    public static void solve()
    {
        long n = in.nextLong();
        long k = in.nextLong();
        
        if (n % 2 == 0){
        	if (k > n/2) {
        		// it is the k-(n/2)th even number
        		out.println(2*(k-(n/2)));
        	}
        	else{
        		// it is the kth odd number
        		out.println(2*k-1);
        	}
        }
        else {
        	if (k > n/2 + 1){
        		out.println(2*(k-(n/2 + 1)));
        	}
        	else {
        		out.println(2*k-1);
        	}
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
