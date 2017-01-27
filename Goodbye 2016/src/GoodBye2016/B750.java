package GoodBye2016;

import java.io.*;
import java.util.*;

public class B750 {

    static FastReader in = null;
    static PrintWriter out = null;

    public static void solve()
    {
        int n = in.nextInt();
        int distanceNS = 0; /* Bound this by [-20000, 0] */
        for (int i = 0; i < n; i++){
        	int t = in.nextInt();
        	String dir = in.next();
        	
        	
    		if (dir.equals("North") && distanceNS + t > 0){
    			distanceNS = Integer.MAX_VALUE;
    			break;
    		}
    		else if (dir.equals("South") && distanceNS - t < -20000){
    			distanceNS = Integer.MAX_VALUE;
    			break;
    		}
    		else {
    			if (dir.equals("North")){
    				distanceNS += t;
    			}
    			else if (dir.equals("South")){
    				distanceNS -= t;
    			}
    		}
    		
    		if ((distanceNS == 0 || distanceNS == -20000) && (dir.equals("East") || dir.equals("West"))){
    			distanceNS = Integer.MAX_VALUE;
    			break;
    		}
			if (dir.equals("East") || dir.equals("West")){
        		continue;
        	}
        }
        
        if (distanceNS == 0) out.print("YES");
        else out.println("NO");
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
