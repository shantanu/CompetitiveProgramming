import java.io.*;
import java.util.*;

public class C466 {
	// AAAHHHHHHH FUCK THIS PROBLEM 
    static FastReader in = null;
    static PrintWriter out = null;

    public static void solve()
    {
        int n = in.nextInt();
        int[] a = in.nextIntArr(n);
        
        int[] sums = new int[n+1];
        sums[0] = 0;
        sums[1] = a[0];
        for (int i = 2; i <= n; i++){
        	sums[i] = sums[i-1] + a[i-1];
        }
        int totalCount = 0;
        if (!(sums[n] % 3 == 0)) {
        	out.print("0");
        	return;
        }
        
        int i = 0;
        for (i = 0; i < n-2; i++){
        	if (sums[i] == sums[n]/3){
        		break;
        	}
        }
        int j = i;
        for (j = i; j < n-1; j++) {
        	if (sums[j+1]-sums[i]== sums[n]/3){
        		break;
        	}
        }
        
        
        out.print(totalCount);
        
    }
    public static int findSum(int left, int right, int[] sums){
    	return sums[right] - sums[left];
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
