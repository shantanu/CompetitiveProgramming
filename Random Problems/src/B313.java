import java.io.*;
import java.util.*;

public class B313 {

    static FastReader in = null;
    static PrintWriter out = null;

    public static void solve()
    {
        char[] s = in.nextLine().toCharArray();
        int[] count = new int[s.length+1];
        count[0] = 0;
        for (int i = 1; i < s.length; i++){
        	if ((s[i]) == (s[i-1])){
        		count[i+1] = count[i]+1;
        	}
        	else{
        		count[i+1] = count[i];
        	}
        }
        
        int n = in.nextInt();
        for (int i = 0; i < n; i++){
        	int l = in.nextInt();
        	int r = in.nextInt();
        	
        	out.println(count[r] - count[l]);
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
