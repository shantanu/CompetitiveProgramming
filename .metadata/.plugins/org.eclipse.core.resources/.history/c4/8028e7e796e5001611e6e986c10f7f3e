import java.io.*;
import java.util.*;

public class B211352 {

    static FastReader in = null;
    static PrintWriter out = null;

    public static void solve()
    {
    	int n = in.nextInt();
    	int[] coins = in.nextIntArr(n);
    	Arrays.sort(coins);
    	int[] sums = new int[n];
    	for (int i = 0; i < n; i++){
    		if (i == 0) {
    			int sum = 0;
    			for (int j = 1; j < n; j++){
    				sum += coins[j];
    			}
    			sums[0] = coins[0] - sum;
    		}
    		else {
    			sums[i] = sums[i-1] + 2*coins[i];
    			if (sums[i] > 0) {
    				System.out.println(Math.max(0, Math.min(i + 1, n-(i+1)+1)));
    				return;
    			}
    			
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

