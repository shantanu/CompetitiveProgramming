package Round390;

import java.io.*;
import java.util.*;

public class A754 {

    static FastReader in = null;
    static PrintWriter out = null;

    public static void solve()
    {
        int n = in.nextInt();
        int[] a = in.nextIntArr(n);
        int[] sums = new int[n];
        sums[0] = a[0];
        for(int i = 1; i < n; i++){
        	sums[i] = sums[i-1] + a[i];
        }
        
        if (sums[n-1] != 0) {
        	out.println("YES");
        	out.println("1");
        	out.print("1 " + n);
        	return;
        }
        
        else { //The sum of the whole array is 0
        	
        	for (int i = 0; i < n; i++){
        		if (sums[i] != 0){
        			out.println("YES");
        			out.println("2");
        			out.println("1 " + (i+1));
        			out.println(i+2 + " " + n);
        			return;
        		}
        	}
        	
        	//The sum of everything is 0
        	out.println("NO");
        	
        	
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
