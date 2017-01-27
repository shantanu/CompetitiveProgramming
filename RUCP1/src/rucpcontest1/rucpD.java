package rucpcontest1;

import java.io.*;
import java.util.*;

public class rucpD {

    static FastReader in = null;
    static PrintWriter out = null;

    public static void solve()
    {
        int[] sides = in.nextIntArr(6);
        int[] max = findMax(sides);
        
        int longestSide = max[0];
        int sideNext = sides[(max[1] + 1) % 6];
        int other = sides[(max[1] - 1) % 6];
        
        //calculate the number of triangles in the big triangle
        int triangles = 0;
        for (int i = 1; i <= longestSide + sideNext + other; i++){
        	triangles += 2*i - 1;
        }
        
        for (int i = 1; i <= 3; i++){
        	for (int j = 1; j <= sides[(max[1] + (i*2-1)) % 6]; j++){
        		triangles -= 2*j - 1;
        	}
        }
        
        out.println(triangles);
    }
    
    public static int[] findMax(int[] a){
    	int max = a[0];
    	int ind = -1;
    	for (int i = 0; i < a.length; i++){
    		if (a[i] >= max){
    			ind = i;
    			max = a[i];
    		}
    	}
 
    	int[] x = {max, ind};
    	return x;
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

