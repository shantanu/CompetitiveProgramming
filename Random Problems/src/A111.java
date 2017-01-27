import java.io.*;
import java.util.*;

public class A111 {

    static FastReader in = null;
    static PrintWriter out = null;

    public static void solve()
    {
        int n = in.nextInt();
        long x = in.nextLong();
        long y = in.nextLong();
        
        if (y < n) {
        	out.println("-1");
        	return;
        }
        
        long[] a = new long[n];
        Arrays.fill(a, 1);
        a[0] = y - (n-1);
        if (a[0]*a[0] + (n-1) < x){
        	out.println("-1");
        }
        else {
        	for (int i = 0; i < n; i++){
        		out.println(a[i]);
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

